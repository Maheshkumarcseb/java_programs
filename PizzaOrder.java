
import java.util.Scanner;
public  class PizzaOrder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayMenu();
        int choice = getUserChoice(scanner);
        processOrder(choice);
        scanner.close();
    }
    private static void displayMenu() {
        System.out.println("Order please");   
    }
    private static int getUserChoice(Scanner scanner) {
        System.out.print("Enter choice: ");
        return scanner.nextInt();
    }
    PizzaOrder obj=new PizzaOrder();
    private static void processOrder(int choice) {
        switch (choice) {
            case 1:
                makeChickenPizza("chicken");
                
                System.out.println("1.chicken pizza with extra chilli\n");
                System.out.println("1.chicken pizza with extra pepper\n");
                System.out.println("1.chicken pizza with toppings \n");
                System.out.println("1.chicken pizza with french fries\n");
                int a=scanner.nextInt();
                break;
           case 2:
                makeCheesePizza("cheese");
                break;

            default:
                System.out.println("Please select from the menu.");
        }
    }
    private static void makeChickenPizza(String type) {
        System.out.println(type + " pizza ready.");
    }
    private static void makeCheesePizza(String type) {
        System.out.println(type + " pizza ready.");
    }
}
