import java.util.Scanner;

public class IT24103821Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the price of 1 kg of rice
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        // Input for the number of kilograms to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = scanner.nextDouble();

        // Calculating the total cost
        double totalCost = pricePerKg * quantity;

        // Applying the 10% discount
        double discountedTotal = totalCost - (totalCost * 0.1);

        // Output the discounted total
        System.out.println("The total amount with 10% discount is: " + discountedTotal);

        scanner.close();
    }
}
