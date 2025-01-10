import java.util.Scanner;

class MultiplyTable{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        // Taking as input
        System.out.print("Enter a number to generate its multiplication table - ");
        int number = input.nextInt();

        // Generating multiplication table of given number
 
        for (int currentMultiplier = 1; currentMultiplier <= 10; currentMultiplier++) {
            System.out.println(number + " x " + currentMultiplier + " = " + (number * currentMultiplier));
        }

        input.close();
    }
}
