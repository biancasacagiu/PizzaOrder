import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Am folosit Builder si SingleTon
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Java Pizzeria! 🍕");
        System.out.println("Let's build your pizza.");
        System.out.println("-------------------------------");

        // Pe viitor trebuie sa adaug validari :)
        System.out.print("Choose your size (Small, Medium, Large): ");
        String size = scanner.nextLine();

        Pizza.Builder pizzaBuilder = new Pizza.Builder(size);

        System.out.print("Add cheese? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            pizzaBuilder.addCheese();
        }

        System.out.print("Add pepperoni? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            pizzaBuilder.addPepperoni();
        }

        System.out.print("Add mushrooms? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            pizzaBuilder.addMushrooms();
        }

        Pizza pizza = pizzaBuilder.build();

        OrderManager orderManager = OrderManager.getInstance();
        orderManager.placeOrder(pizza.toString());
    }
}
