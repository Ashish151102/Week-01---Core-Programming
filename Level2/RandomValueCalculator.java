import java.util.Random;

public class RandomValueCalculator {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            // Generate a random 4-digit number between 1000 and 9999
            numbers[i] = 1000 + random.nextInt(9000);
        }

        return numbers;
    }

    // Method to find the average, minimum, and maximum values of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double[] result = new double[3];
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);  // Find minimum
            max = Math.max(max, num);  // Find maximum
        }

        // Calculate the average
        result[0] = (double) sum / numbers.length;  // Average
        result[1] = min;  // Minimum
        result[2] = max;  // Maximum

        return result;
    }

    public static void main(String[] args) {
        // Generate an array of 5 4-digit random numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Display the generated random numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find average, min, and max
        double[] results = findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
