public class OrderManager {
    private static OrderManager instance;

    private OrderManager() {}

    public static OrderManager getInstance() {
        if (instance == null) {
            instance = new OrderManager();
        }
        return instance;
    }

    public void placeOrder(String orderDetails) {
        System.out.println("\n===============================");
        System.out.println(" 🍕  Thank you for your order! 🍕 ");
        System.out.println("-------------------------------");
        System.out.println("Order details:");
        System.out.println(orderDetails);
        System.out.println("\nYour pizza is being prepared... Enjoy!");
        System.out.println("===============================\n");
    }
}
