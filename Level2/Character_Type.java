import java.util.Scanner;

public class Character_Type {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = input.nextLine();

        String[][] result = classifyCharacters(input);
        System.out.println("Character\tType");
        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1]); // Display character and type
        }
    }

    public static String[][] classifyCharacters(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = getType(ch); // Get type of character
        }
        return result; // Return 2D array
    }

    public static String getType(char ch) {
        if (Character.isLetter(ch)) {
            return isVowel(ch) ? "Vowel" : "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // Convert to lowercase
        return "aeiou".indexOf(ch) != -1; // Check for vowels
    }
}
