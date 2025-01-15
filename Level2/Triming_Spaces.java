import java.util.Scanner;

public class Triming_Spaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = scanner.nextLine();

        String trimmed = trimSpaces(input);
        System.out.println("Custom Trimmed: '" + trimmed + "'");
        System.out.println("Built-in Trimmed: '" + input.trim() + "'");
    }

    public static String trimSpaces(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++; // Trim leading spaces
        while (end >= start && str.charAt(end) == ' ') end--; // Trim trailing spaces
        return str.substring(start, end + 1); // Return trimmed substring
    }
}
