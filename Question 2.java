import java.util.Scanner;

public class DivisibleBySevenAndThirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isDivisibleBySevenAndThirteen(number)) {
            System.out.println(number + " is divisible by both 7 and 13.");

            int quotientBySeven = number / 7;
            int remainderBySeven = number % 7;
            int quotientByThirteen = number / 13;
            int remainderByThirteen = number % 13;

            System.out.println("Quotient when divided by 7: " + quotientBySeven);
            System.out.println("Remainder when divided by 7: " + remainderBySeven);
            System.out.println("Quotient when divided by 13: " + quotientByThirteen);
            System.out.println("Remainder when divided by 13: " + remainderByThirteen);
        } else {
            System.out.println(number + " is not divisible by both 7 and 13.");
        }

        scanner.close();
    }

    public static boolean isDivisibleBySevenAndThirteen(int number) {
        return number % 7 == 0 && number % 13 == 0;
    }
}
