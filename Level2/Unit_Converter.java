public class Unit_Converter {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheitToCelsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheitToCelsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsiusToFahrenheit = (celsius * 9 / 5) + 32;
        return celsiusToFahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double poundsToKilograms = 0.453592;
        return pounds * poundsToKilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilogramsToPounds = 2.20462;
        return kilograms * kilogramsToPounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallonsToLiters = 3.78541;
        return gallons * gallonsToLiters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double litersToGallons = 0.264172;
        return liters * litersToGallons;
    }

    // Main method to test the conversion methods
    public static void main(String[] args) {
        // Example Usage:

        // Convert Fahrenheit to Celsius
        double fahrenheit = 98.6;
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " °F is equal to " + celsius + " °C.");

        // Convert Celsius to Fahrenheit
        celsius = 37.0;
        fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + " °C is equal to " + fahrenheit + " °F.");

        // Convert pounds to kilograms
        double pounds = 150.0;
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");

        // Convert kilograms to pounds
        kilograms = 68.0;
        pounds = convertKilogramsToPounds(kilograms);
        System.out.println(kilograms + " kilograms is equal to " + pounds + " pounds.");

        // Convert gallons to liters
        double gallons = 5.0;
        double liters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + liters + " liters.");

        // Convert liters to gallons
        liters = 20.0;
        gallons = convertLitersToGallons(liters);
        System.out.println(liters + " liters is equal to " + gallons + " gallons.");
    }
}
