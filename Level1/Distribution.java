public class Distribution {
    public static void main(String[] args) {
        //Create variables Total_pens , students and assigned its value
        int Total_Pens = 14;
        int Students = 3;

        // Calculate pens per student and remaining pens
        int pensPer_Student = Total_Pens / Students;
        int remaining_Pens = Total_Pens % Students;

        // Print output
        System.out.println("The Pen Per Student is " + pensPer_Student + 
                           " and the remaining pen not distributed is " + remaining_Pens );
    }
}
 