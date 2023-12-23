import java.util.Scanner;


public class Employee {
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void raiseSalary(double percent)
    {
        if(percent>0)
        {
            double increaseAmount = (percent/100)*salary;
            salary +=increaseAmount;
            System.out.println(name + "'s salary increased by"+percent+"%.");
        }
        else{
            System.out.println("invalid percentage.salary remain unchanged.");
        }
    }
    public void display()
    {
        System.out.println("employee ID"+id);
        System.out.println("employee name"+name);
        System.out.println("Employee salary: $"+salary);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("eter employee id");
        int id=scanner.nextInt();

        System.out.println("Enter employee name");
        scanner.nextLine();
        String name=scanner.nextLine();

        System.out.println("Enter employee salary:$");
        double salary=scanner.nextDouble();
        Employee employee=new Employee(id, name, salary);

        System.out.println("\n Initial employee detail");
        employee.display();
        System.out.println("\n enter the percent to raisa the salary by:");
        double percent=scanner.nextDouble();
        employee.raiseSalary(percent);
        System.out.println("\n employee detail after raise salary");
        employee.display();
        scanner.close();
    }
}
