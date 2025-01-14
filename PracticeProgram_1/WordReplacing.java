import java.util.Scanner;

public class WordReplacing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter word to replace: ");
        String target = scanner.nextLine();
        System.out.print("Enter replacement word: ");
        String replacement = scanner.nextLine();

        // Replace the target word with the replacement word
        String modifiedSentence = sentence.replace(target, replacement);

        // Print the modified sentence
        System.out.println("Modified Sentence: " + modifiedSentence);
    }
}
