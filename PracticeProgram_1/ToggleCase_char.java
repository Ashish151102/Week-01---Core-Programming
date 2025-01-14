import java.util.Scanner;

public class ToggleCase_char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        // Toggle the case of each character
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch)); // Convert to lowercase
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch)); // Convert to uppercase
            } else {
                result.append(ch); // Leave non-alphabetic characters unchanged
            }
        }

        // Print the modified string
        System.out.println("Toggled String: " + result);
    }
}
