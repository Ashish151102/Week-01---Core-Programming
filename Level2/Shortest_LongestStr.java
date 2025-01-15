import java.util.Scanner;

public class Shortest_LongestStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = customSplit(sentence);
        int[] result = findShortestLongest(words);
        System.out.println("Shortest Word Length: " + result[0]);
        System.out.println("Longest Word Length: " + result[1]);
    }

    public static String[] customSplit(String text) {
        // Reuse split logic
        return text.split(" ");
    }

    public static int[] findShortestLongest(String[] words) {
        int min = Integer.MAX_VALUE, max = 0;
        for (String word : words) { // Traverse all words
            int len = findLength(word);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max}; // Return shortest and longest lengths
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
