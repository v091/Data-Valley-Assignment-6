import java.util.Scanner;

public class NumberStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;

        char choice;
        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Update smallest and largest
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }

            // Update sum and count for calculating average
            sum += number;
            count++;

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Largest number entered: " + largest);
            System.out.println("Smallest number entered: " + smallest);
            System.out.println("Average of all numbers entered: " + average);
        } else {
            System.out.println("No numbers entered.");
        }

        scanner.close();
    }
}
