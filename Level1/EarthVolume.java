public class EarthVolume {
    public static void main(String[] args) {
	
	    //Create a veriable Radius and assigned  values 
        // Radius of Earth in kilometers
        double Radius = 6378;
		
		//Create double variable Pi
        double Pi = Math.PI;

        // Volume of Earth in cubic kilometers
        double Volume = (4.0 / 3.0) * Pi * Math.pow(Radius, 3);

        // Convert volume from cubic kilometers to cubic miles
        double volumeMiles = Volume * 0.239913;

        // Print the output
        System.out.printf("The volume of Earth in cubic kilometers is " + Volume + " and cubic miles is " + volumeMiles);
    }
}
