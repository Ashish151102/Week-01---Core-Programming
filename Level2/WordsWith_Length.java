import java.util.Scanner;

public class WordsWith_Length {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        String[][] result = getWordsWithLengths(customSplit(sentence));
        System.out.println("Word\tLength");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + row[1]); // Display words and lengths
        }
    }

    public static String[] customSplit(String text) {
        // Reuse split logic from previous program
        return text.split(" ");
    }

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i])); // Use helper method for length
        }
        return result; // Return 2D array
    }

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) str.charAt(count++);
        } catch (Exception e) {
        }
        return count;
    }
}
