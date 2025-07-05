import java.util.Scanner;

public class PerfectNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        // (i) Prompt and validate user input using exception handling
        while (true) {
            try {
                System.out.print("Enter a positive integer: ");
                number = Integer.parseInt(scanner.nextLine());

                if (number <= 0) {
                    throw new NumberFormatException("Number must be positive.");
                }
                break; // Exit loop if valid
            } catch (NumberFormatException e) {
                System.out.println(" Invalid input. Please enter a positive whole number.");
            }
        }

        // (ii) Calculate sum of proper divisors
        int sum = 0;
        System.out.print("Proper divisors of " + number + " are: ");
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
                System.out.print(i + " ");
            }
        }

        // (iii) Check if number is perfect
        System.out.println("\nSum of proper divisors: " + sum);

        if (sum == number) {
            System.out.println(" " + number + " is a PERFECT number.");
        } else {
            System.out.println(" " + number + " is NOT a perfect number.");
        }

        scanner.close();
    }
}
