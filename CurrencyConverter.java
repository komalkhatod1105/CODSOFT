import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Available Currencies:");
        System.out.println("1. INR (Indian Rupee)");
        System.out.println("2. USD (US Dollar)");
        System.out.println("3. EUR (Euro)");

        System.out.print("Enter base currency (INR/USD/EUR): ");
        String base = sc.next().toUpperCase();

        System.out.print("Enter target currency (INR/USD/EUR): ");
        String target = sc.next().toUpperCase();

        System.out.print("Enter amount to convert: ");
        double amount = sc.nextDouble();

        double rate = getExchangeRate(base, target);

        if (rate == 0.0) {
            System.out.println("Conversion not supported.");
        } else {
            double converted = amount * rate;
            System.out.println(amount + " " + base + " = " + converted + " " + target);
        }

        sc.close();
    }

    // Dummy exchange rates
    public static double getExchangeRate(String base, String target) {
        if (base.equals(target)) return 1.0;

        if (base.equals("INR") && target.equals("USD")) return 0.012;
        if (base.equals("USD") && target.equals("INR")) return 83.0;

        if (base.equals("INR") && target.equals("EUR")) return 0.011;
        if (base.equals("EUR") && target.equals("INR")) return 90.0;

        if (base.equals("USD") && target.equals("EUR")) return 0.92;
        if (base.equals("EUR") && target.equals("USD")) return 1.08;

        return 0.0; // Not supported
    }
}
