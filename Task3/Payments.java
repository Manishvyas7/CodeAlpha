package CodeAlpha.Task3;

public class Payments {
    public static boolean processPayment(String customerName, double amount) {
        // When use in real time we can add a payment gateway method here
        System.out.println("Processing payment for " + customerName + " of amount $" + amount);
        return true;
    }
}
