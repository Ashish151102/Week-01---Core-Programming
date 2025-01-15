import java.util.Random;

public class EligibilityForVote {
    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] result = checkVotingEligibility(ages);

        System.out.println("Age\tCan Vote");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + row[1]); // Display age and eligibility
        }
    }

    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(100); // Generate random ages
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "True" : "False"; // Check eligibility
        }
        return result; // Return 2D array
    }
}
