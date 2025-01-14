import java.util.Scanner;

public class Reverse_aString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String reversed = "";

        // Loop through the string in reverse
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // Append each character to the result
        }

        // Print the reversed string
        System.out.println("Reversed String: " + reversed);
    }
}
