 import java.util.Scanner;

public class UniqueCharacter_frequency {

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        StringBuilder uniqueChars = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (uniqueChars.indexOf(String.valueOf(currentChar)) == -1) {
                uniqueChars.append(currentChar);
            }
        }
        return uniqueChars.toString().toCharArray();
    }

    // Method to find the frequency of characters using unique characters
    public static String[][] findFrequencyUsingUniqueCharacters(String text) {
        char[] uniqueChars = findUniqueCharacters(text);
        int[] frequency = new int[256]; // ASCII character size

        // Calculate frequency of each character
        for (char c : text.toCharArray()) {
            frequency[c]++;
        }

        // Create a 2D array to store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find frequency using unique characters
        String[][] frequencyUsingUnique = findFrequencyUsingUniqueCharacters(inputText);
        System.out.println("Frequency using unique characters:");
        for (String[] pair : frequencyUsingUnique) {
            System.out.println(pair[0] + ": " + pair[1]);
        }

        scanner.close();
    }
}
