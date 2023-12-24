import java.util.Scanner;
public class Employee {
    private int id;     
    private String name;
    private double salary;
    public Employee(int id, String name, double salary)   // parametrized constructor  
    {
        this.id=id;     // this.id-->instance variable and id is local variable
        this.name=name;  // this.name-->instance variable and name is local variable
        this.salary=salary;    // this.salary-->instance variable and salary is local variable
    }
    public void raiseSalary(double percent)   //raisesalary method for increasing salary
    {
        if(percent>0)  // checking whether percent is positive or negative
        {
            double increaseAmount = (percent/100)*salary;
            salary +=increaseAmount;
            System.out.println(name + "'s salary increased by"+percent+"%.");
        }
        else{
            System.out.println("invalid percentage.salary remain unchanged.");
        }
    }
    public void display()    // method for displaying detail of employee.
    {
        System.out.println("employee ID"+id);
        System.out.println("employee name"+name);
        System.out.println("Employee salary: $"+salary);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);  //declaring scanner object for the class.
        System.out.println("eter employee id");
        int id=scanner.nextInt();    // taking integer input from user.
        System.out.println("Enter employee name");
        scanner.nextLine();        // taking character input from user.
        String name=scanner.nextLine();  // taking string input from user.
        System.out.println("Enter employee salary:$");
        double salary=scanner.nextDouble();    // taking Double input from user.
        Employee employee=new Employee(id, name, salary);   //declaring employee object for the class.
        System.out.println("\n Initial employee detail");
        employee.display();   // displaying id,name and salary before raising the salary.
        System.out.println("\n enter the percent to raisa the salary by:");
        double percent=scanner.nextDouble();
        employee.raiseSalary(percent);
        System.out.println("\n employee detail after raise salary");
        employee.display();    // displaying id,name and salary after raising the salary.
        scanner.close();   //closing the scannner object.
    }
}
