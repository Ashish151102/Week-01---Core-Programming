import java.util.Scanner;

public class Check_AnagramTexts {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if lengths of the two texts are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create an array to store the frequency of characters (26 for a-z)
        int[] charFrequency1 = new int[26];
        int[] charFrequency2 = new int[26];

        // Convert texts to lowercase to handle case insensitivity
        text1 = text1.toLowerCase();
        text2 = text2.toLowerCase();

        // Find the frequency of characters in the first text
        for (char c : text1.toCharArray()) {
            charFrequency1[c - 'a']++;
        }

        // Find the frequency of characters in the second text
        for (char c : text2.toCharArray()) {
            charFrequency2[c - 'a']++;
        }

        // Compare the frequency of characters in both texts
        for (int i = 0; i < 26; i++) {
            if (charFrequency1[i] != charFrequency2[i]) {
                return false;
            }
        }

        return true; // Return true if all frequencies match
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user inputs for the two texts
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Check if the two texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        scanner.close();
    }
}
