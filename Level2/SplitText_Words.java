import java.util.Scanner;

public class SplitText_Words {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        String[] customSplit = customSplit(sentence);
        String[] builtInSplit = sentence.split(" ");

        System.out.println("Custom Split: " + String.join(", ", customSplit));
        System.out.println("Built-in Split: " + String.join(", ", builtInSplit));
        System.out.println("Are both equal? " + compareArrays(customSplit, builtInSplit));
    }

    public static String[] customSplit(String text) {
        int count = 0, lastSpace = -1;
        for (int i = 0; i < text.length(); i++) { // Count spaces to determine word count
            if (text.charAt(i) == ' ') count++;
        }
        String[] words = new String[count + 1];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' || i == text.length() - 1) { // Extract words using space indexes
                words[index++] = text.substring(lastSpace + 1, i == text.length() - 1 ? i + 1 : i);
                lastSpace = i;
            }
        }
        return words; // Return words array
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) { // Compare each word
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }
}
