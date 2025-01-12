public class Spring_Season {

    // Method to check if the given date is within the Spring season
    public static boolean isSpringSeason(int month, int day) {
        // Check for March 20 to June 20
        if (month > 3 && month < 6) {
            return true; // It's definitely Spring season
        } else if (month == 3 && day >= 20) {
            return true; // It's after March 20
        } else if (month == 6 && day <= 20) {
            return true; // It's before June 20
        } else {
            return false; // It's not within the Spring season
        }
    }

    public static void main(String[] args) {
        // Ensure there are two command line arguments (month and day)
        if (args.length != 2) {
            System.out.println("Please provide both month and day as command line arguments.");
            return;
        }

        // Parse the month and day from command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if the month and day represent a Spring season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
