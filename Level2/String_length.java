import java.util.Scanner;

public class String_length {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = input.next();

        int customLength = findLength(input);
        System.out.println("Custom Length: " + customLength);
        System.out.println("Built-in Length: " + input.length());
    }

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) { // Loop through characters till exception occurs
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Exception indicates end of string
        }
        return count; // Return the counted length
    }
}
_