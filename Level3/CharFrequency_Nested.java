import java.util.Scanner;

public class CharFrequency_Nested {

    // Method to find the frequency of characters using nested loops
    public static String[][] findFrequencyUsingNestedLoops(String text) {
        char[] charArray = text.toCharArray();
        int[] frequency = new int[charArray.length];

        // Initialize frequency array
        for (int i = 0; i < charArray.length; i++) {
            frequency[i] = 1;
        }

        // Calculate frequency using nested loops
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != '0') {
                for (int j = i + 1; j < charArray.length; j++) {
                    if (charArray[i] == charArray[j]) {
                        frequency[i]++;
                        charArray[j] = '0'; // Mark duplicate as processed
                    }
                }
            }
        }

        // Count unique characters
        int uniqueCount = 0;
        for (char c : charArray) {
            if (c != '0') {
                uniqueCount++;
            }
        }

        // Create a 1D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != '0') {
                result[index][0] = String.valueOf(charArray[i]);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find frequency using nested loops
        String[][] frequencyUsingNestedLoops = findFrequencyUsingNestedLoops(inputText);
        System.out.println("Frequency using nested loops:");
        for (String[] pair : frequencyUsingNestedLoops) {
            System.out.println(pair[0] + ": " + pair[1]);
        }

        scanner.close();
    }
}