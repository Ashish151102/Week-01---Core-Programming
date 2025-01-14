import java.util.Arrays;
import java.util.Scanner;

public class Check_Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String string2 = scanner.nextLine();

        // Sort characters of both strings
        char[] chars1 = string1.replaceAll("\\s", "").toCharArray();
        char[] chars2 = string2.replaceAll("\\s", "").toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        // Compare the sorted strings
        if (Arrays.equals(chars1, chars2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
