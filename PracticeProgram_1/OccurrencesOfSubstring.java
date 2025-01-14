import java.util.Scanner;

public class OccurrencesOfSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the substring: ");
        String substring = scanner.nextLine();
        int count = 0, index = 0;

        // Search for occurrences of the substring
        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++; // Increment the count for each occurrence
            index += substring.length(); // Move index past the found substring
        }

        // Print the total count of occurrences
        System.out.println("Occurrences: " + count);
    }
}
