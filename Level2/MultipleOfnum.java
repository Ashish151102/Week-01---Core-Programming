import java.util.Scanner;

public class MultipleOfnum {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Get the input value
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        System.out.println("Multiples of " + number + " below 100 are:");
        
        // Loop to find multiples, running backward
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
        
        
        input.close();
    }
}
