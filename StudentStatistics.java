
/**
 * program to compute statistics of 'students' marks in an assignment.
 *
 * @author (Anjil Khadka)
 * @version (a version number or a date)
 */
import java.util.*;
/**
 * Program to compute statistics of 'students' marks in an assignment.
 * @author (Anjil Khadka)
 * @version ()
 */
public class StudentStatistics
{
    public static void main(String[] args) {
        // F1: Scanner input object to read input from the user
        Scanner input = new Scanner(System.in);

        // let the user to enter the assignment name
        System.out.print("Please Enter the Assignment Name: ");

        // Read input from the user and store in a variable
        String assignmentName = input.nextLine();
        
       
     
    
    
    // F2:  Allows the user to input 30 student's marks for the assignment.
        double[] marks = new double[30]; 
        
        
        for (int i = 0; i < marks.length; i++) {
            
            double mark;
        
            do {
                
                System.out.print("Enter the student " + (i+1) + " mark: ");
                
                mark = input.nextDouble();
            //F3: showing an error message on the screen to the user with sufficient details of the error before allowing users to re-enter the mark.
                if (mark < 0 || mark > 30) {
                    System.out.println("Invalid marks! Please enter the marks between 0 and 30");
                } 
                
            } while (mark < 0 || mark > 30);
            
             marks[i] = mark;
        }
    
}
}
