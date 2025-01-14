import java.util.Scanner;

public class RemoveSpecific_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char toRemove = sc.next().charAt(0);
        String result = "";

        // Build a new string without the specified character
        for (char ch : input.toCharArray()) {
            if (ch != toRemove) {
                result += ch;
            }
        }

        // Print the modified string
        System.out.println("Modified String: " + result);
    }
}
