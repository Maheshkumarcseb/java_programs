
import java.util.Scanner;

public class Pizza_Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter choice (1-2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Chicken pizza ready");
                System.out.println("Do you want any extra material?");
                int ch3;
                System.out.println("Enter 1 for YES and 2 for NO");
                ch3 = scanner.nextInt();
                switch (ch3) {
                    case 1:
                        System.out.println("Enter extra item to be put on pizza");
                        System.out.println("1. Only chicken pizza");
                        System.out.println("2. Chicken pizza with extra toppings");
                        System.out.println("3. Chicken pizza with extra chilli");
                        System.out.println("4. Chicken pizza with extra pepper");
                        System.out.println("5. Chicken pizza with french fries");
                        int choice1;
                        System.out.println("Enter choice (1-5)");
                        choice1 = scanner.nextInt();
                        switch (choice1) {
                            case 1:
                                System.out.println("Only chicken pizza ready");
                                break;
                            case 2:
                                System.out.println("Chicken pizza with extra toppings ready");
                                break;
                            case 3:
                                System.out.println("Chicken pizza with extra chilli ready");
                                break;
                            case 4:
                                System.out.println("Chicken pizza with extra pepper ready");
                                break;
                            case 5:
                                System.out.println("Chicken pizza with french fries ready");
                                break;
                            default:
                                System.out.println("Enter from the above choices");
                        }
                        break;
                    case 2:
                        System.out.println("Plain chicken pizza ready ready");
                        break;
                    default:
                        System.out.println("Select from the above choices");
                }
                break;
            case 2:
                System.out.println("Cheese pizza ready");
                System.out.println("Do you want any extra material?");
                int ch4;
                System.out.println("Enter 1 for YES and 2 for NO");
                ch4 = scanner.nextInt();
                switch (ch4) {
                    case 1:
                        System.out.println("Enter extra item to be put on pizza");
                        System.out.println("1. Only cheese pizza");
                        System.out.println("2. Cheese pizza with extra toppings");
                        System.out.println("3. Cheese pizza with extra chilli");
                        System.out.println("4. Cheese pizza with extra pepper");
                        System.out.println("5. Cheese pizza with french fries");
                        int choice2;
                        System.out.println("Enter choice (1-5)");
                        choice2 = scanner.nextInt();
                        switch (choice2) {
                            case 1:
                                System.out.println("Only cheese pizza ready");
                                break;
                            case 2:
                                System.out.println("Cheese pizza with extra toppings ready");
                                break;
                            case 3:
                                System.out.println("Cheese pizza with extra chilli ready");
                                break;
                            case 4:
                                System.out.println("Cheese pizza with extra pepper ready");
                                break;
                            case 5:
                                System.out.println("Cheese pizza with french fries ready");
                                break;
                            default:
                                System.out.println("Enter from the above choices");
                        }
                        break;
                    case 2:
                        System.out.println("Plain cheese pizza ready");
                        break;
                    default:
                        System.out.println("Select from the above choices");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
