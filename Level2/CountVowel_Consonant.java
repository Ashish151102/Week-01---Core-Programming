import java.util.Scanner;

public class CountVowel_Consonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] result = countVowelsConsonants(input);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }

    public static int[] countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) vowels++;
            else if (Character.isLetter(ch)) consonants++;
        }
        return new int[]{vowels, consonants}; // Return count array
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // Convert to lowercase
        return "aeiou".indexOf(ch) != -1; // Check for vowels
    }
}
