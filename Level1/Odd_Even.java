import java.util.Scanner;

public class Odd_Even{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number - ");
        int upperLimit = input.nextInt();

        // Check if the input is a natural number
        if (upperLimit <= 0) {
            System.out.println("Please enter a natural number");
        } else {
            // Iterate from 1 to the number and check odd/even
            for (int currentNumber = 1; currentNumber <= upperLimit; currentNumber++) {
                if (currentNumber % 2 == 0) {
                    System.out.println(currentNumber + " is an even number");
                } else {
                    System.out.println(currentNumber + " is an odd number");
                }
            }
        }
        input.close();
    }
}
