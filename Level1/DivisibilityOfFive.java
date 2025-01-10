import java.util.Scanner;

class DivisibilityOfFive {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        System.out.print("Enter a number - ");
		int inputNumber = input.nextInt();
		boolean isDivisibleByFive;
		
        // Checking if the number is divisible by 5
        if (inputNumber % 5 == 0) {
            isDivisibleByFive = true;
        } else {
            isDivisibleByFive = false;
        }
		
		System.out.println("Is the number " + inputNumber + " divisible by 5? " + isDivisibleByFive);
		input.close();
	}
}
