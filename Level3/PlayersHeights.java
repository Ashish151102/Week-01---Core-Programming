import java.util.Random;

public class PlayersHeights {

    // Method to generate random heights for 11 players in the range 150 to 250 cms
    public static int[] generateHeights() {
        Random random = new Random();
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150;  // Generates a number between 150 and 250
        }
        return heights;
    }

    // Method to calculate the sum of all heights
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height of the players
    public static double calculateMean(int[] heights) {
        int totalSum = calculateSum(heights);
        return (double) totalSum / heights.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    // Main method to display results
    public static void main(String[] args) {
        // Generate random heights for the team
        int[] heights = generateHeights();

        // Display the generated heights
        System.out.print("Heights of the players in cms: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }

        System.out.println();

        // Calculate and display the results
        int totalSum = calculateSum(heights);
        double meanHeight = calculateMean(heights);
        int shortestHeight = findShortest(heights);
        int tallestHeight = findTallest(heights);

        System.out.println("\nTotal Sum of Heights: " + totalSum);
        System.out.println("Mean Height of Players: " + String.format("%.2f", meanHeight));
        System.out.println("Shortest Height: " + shortestHeight);
        System.out.println("Tallest Height: " + tallestHeight);
    }
}
