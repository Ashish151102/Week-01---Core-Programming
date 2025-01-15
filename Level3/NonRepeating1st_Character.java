import java.util.Scanner;

public class NonRepeating1st_Character {

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingCharacter(String text) {
        int[] charFrequency = new int[256]; // Array to store character frequencies

        // Calculate frequency of each character
        for (int i = 0; i < text.length(); i++) {
            charFrequency[text.charAt(i)]++;
        }

        // Find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            if (charFrequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Calling the method and displaying the result
        char result = findFirstNonRepeatingCharacter(userInput);
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        input.close();
    }
}
