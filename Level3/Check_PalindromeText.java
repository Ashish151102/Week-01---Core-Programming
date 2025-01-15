public class Check_PalindromeText {

    // Logic 1: Iterative comparison from start and end
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Loop through the text and compare characters from start and end
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // Return false if characters do not match
            }
            start++;
            end--;
        }
        return true; // Return true if all characters match
    }

    // Logic 2: Recursive comparison from start and end
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        // Base case: If start index is greater than or equal to end index
        if (start >= end) {
            return true; // Palindrome condition satisfied
        }

        // Check if characters at start and end indexes are not equal
        if (text.charAt(start) != text.charAt(end)) {
            return false; // Return false if characters do not match
        }

        // Recursive call with updated indexes
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays and reversing
    public static boolean isPalindromeUsingCharArray(String text) {
        // Convert the string to a character array
        char[] originalArray = text.toCharArray();
        // Reverse the character array
        char[] reversedArray = reverseCharacterArray(originalArray);

        // Compare original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false; // Return false if any character does not match
            }
        }
        return true; // Return true if all characters match
    }

    // Helper method to reverse a character array
    private static char[] reverseCharacterArray(char[] array) {
        char[] reversedArray = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i]; // Reverse characters
        }
        return reversedArray; // Return the reversed array
    }

    public static void main(String[] args) {
        // Input string to check for palindrome
        String inputText = "madam";

        // Logic 1: Iterative method
        boolean isPalindromeIterative = isPalindromeIterative(inputText);
        System.out.println("Logic 1 - Iterative: " + (isPalindromeIterative ? "Palindrome" : "Not a Palindrome"));

        // Logic 2: Recursive method
        boolean isPalindromeRecursive = isPalindromeRecursive(inputText, 0, inputText.length() - 1);
        System.out.println("Logic 2 - Recursive: " + (isPalindromeRecursive ? "Palindrome" : "Not a Palindrome"));

        // Logic 3: Using character array
        boolean isPalindromeUsingCharArray = isPalindromeUsingCharArray(inputText);
        System.out.println("Logic 3 - Using Character Array: " + (isPalindromeUsingCharArray ? "Palindrome" : "Not a Palindrome"));
    }
}
