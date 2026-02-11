import java.util.Scanner;
public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("💱 Currency Converter");
        System.out.println("Available currencies:");
        System.out.println("1. INR");
        System.out.println("2. USD");
        System.out.println("3. EUR");

        System.out.print("Choose base currency (1/2/3): ");
        int base = sc.nextInt();

        System.out.print("Choose target currency (1/2/3): ");
        int target = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double result = 0;

        // Static exchange rates
        if (base == 1 && target == 2)       // INR to USD
            result = amount * 0.012;
        else if (base == 1 && target == 3)  // INR to EUR
            result = amount * 0.011;
        else if (base == 2 && target == 1)  // USD to INR
            result = amount * 83;
        else if (base == 2 && target == 3)  // USD to EUR
            result = amount * 0.92;
        else if (base == 3 && target == 1)  // EUR to INR
            result = amount * 90;
        else if (base == 3 && target == 2)  // EUR to USD
            result = amount * 1.08;
        else
            result = amount; // Same currency

        System.out.println("\n Converted Amount: " + result);

        sc.close();
    }
}
