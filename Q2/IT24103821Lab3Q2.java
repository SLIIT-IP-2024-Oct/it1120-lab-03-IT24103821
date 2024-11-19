import java.util.Scanner;

public class IT24103821Lab3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the monthly salary
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = scanner.nextDouble();

        // Input for the number of OT hours
        System.out.print("Enter the number of OT hours: ");
        int otHours = scanner.nextInt();

        // Input for the OT hourly rate
        System.out.print("Enter the OT hourly rate: ");
        double otHourlyRate = scanner.nextDouble();

        // Calculate the OT amount
        double otAmount = otHours * otHourlyRate;

        // Calculate the total salary
        double totalSalary = monthlySalary + otAmount;

        // Output the total salary
        System.out.println("The total salary is: " + totalSalary);

        scanner.close();
    }
}
