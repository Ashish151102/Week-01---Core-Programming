import java.util.HashSet;
import java.util.Set;

public class OTP_Generator {

    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        // Generate a random 6-digit number using Math.random()
        return (int) (Math.random() * 900000) + 100000; // Random number between 100000 and 999999
    }

    // Method to ensure that the OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otps) {
        // Use a Set to store OTPs and ensure uniqueness
        Set<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            if (!otpSet.add(otp)) {
                // If the OTP already exists in the set, it is not unique
                return false;
            }
        }
        // All OTPs are unique
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10]; // Array to store 10 OTP numbers

        // Generate 10 OTP numbers
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otps[i]);
        }

        // Check if all OTPs are unique
        boolean unique = areOTPsUnique(otps);
        if (unique) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nThere are duplicate OTPs.");
        }
    }
}
