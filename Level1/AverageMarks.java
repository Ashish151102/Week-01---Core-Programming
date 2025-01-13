public class AverageMarks {
    public static void main(String[] args) {
        //Create variables for Marks in each subject
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
		double TotalMarks = 300.0;
        // Create a variable MarksObtained and Calculate the total marks
        int MarksObtained = maths + physics + chemistry;
		
		//Create a variable AverageMark and calculate average
		// AverageMark = total marks / numbera of subjects
        double AverageMark = MarksObtained / TotalMarks;

        // Print same's average marks 
        System.out.println("Sam’s average mark in PCM is " + AverageMark );
    }
}
