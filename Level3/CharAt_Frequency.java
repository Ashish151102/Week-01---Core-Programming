import java.util.Scanner;

public class CharAt_Frequency {

    // Method to find the frequency of characters in a string
    public static char[][] findCharacterFrequencies(String text) {
        int[] charFrequency = new int[256]; // Array to store character frequencies

        // Calculate frequency of each character
        for (int i = 0; i < text.length(); i++) {
            charFrequency[text.charAt(i)]++;
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        char[][] result = new char[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                result[index][0] = (char) i; // Store character
                result[index][1] = (char) charFrequency[i]; // Store frequency as a char
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Calling the method and getting the result
        char[][] frequencies = findCharacterFrequencies(userInput);

        // Displaying the result
        System.out.println("Character Frequencies:");
        for (char[] freq : frequencies) {
            System.out.println(freq[0] + ": " + (int) freq[1]);
        }

        input.close();
    }
}
