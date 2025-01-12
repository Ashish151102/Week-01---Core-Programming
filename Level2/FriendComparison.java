import java.util.Scanner;

public class FriendComparison {

    // Method to find the youngest friend
    public static String findYoungestFriend(int[] ages) {
        int minAge = ages[0];
        String youngest = "Amar";
        
        // Compare the ages to find the youngest
        if (ages[1] < minAge) {
            minAge = ages[1];
            youngest = "Akbar";
        }
        if (ages[2] < minAge) {
            minAge = ages[2];
            youngest = "Anthony";
        }
        
        return youngest;
    }

    // Method to find the tallest friend
    public static String findTallestFriend(double[] heights) {
        double maxHeight = heights[0];
        String tallest = "Amar";
        
        // Compare the heights to find the tallest
        if (heights[1] > maxHeight) {
            maxHeight = heights[1];
            tallest = "Akbar";
        }
        if (heights[2] > maxHeight) {
            maxHeight = heights[2];
            tallest = "Anthony";
        }
        
        return tallest;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Arrays to store ages and heights of 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input the age and height of Amar, Akbar, and Anthony
        System.out.println("Enter the details for Amar:");

        System.out.print("Age of Amar: ");
        ages[0] = scanner.nextInt();
        System.out.print("Height of Amar (in meters): ");
        heights[0] = scanner.nextDouble();

        System.out.println("Enter the details for Akbar:");

        System.out.print("Age of Akbar: ");
        ages[1] = scanner.nextInt();
        System.out.print("Height of Akbar (in meters): ");
        heights[1] = scanner.nextDouble();

        System.out.println("Enter the details for Anthony:");

        System.out.print("Age of Anthony: ");
        ages[2] = scanner.nextInt();
        System.out.print("Height of Anthony (in meters): ");
        heights[2] = scanner.nextDouble();

        // Find and display the youngest friend
        String youngestFriend = findYoungestFriend(ages);
        System.out.println("The youngest friend is: " + youngestFriend);

        // Find and display the tallest friend
        String tallestFriend = findTallestFriend(heights);
        System.out.println("The tallest friend is: " + tallestFriend);

        // Close the scanner object
        scanner.close();
    }
}
