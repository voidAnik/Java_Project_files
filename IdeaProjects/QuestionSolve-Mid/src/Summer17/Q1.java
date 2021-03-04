package Summer17;
import java.util.Scanner;

class InSufficientAttendanceException extends Exception
{
    InSufficientAttendanceException(int i)
    {
        super("Minimum attendance should be "+i+" days.");
    }
}
class LowScoreException extends Exception
{
    LowScoreException(int i)
    {
        super("Total test score should be" +i+" or above.");
    }
    LowScoreException(int i,double tI)
    {
        super("Minimum class test score should be. " + i);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of Student:");
        int studentCount = scan.nextInt();
        for(int i =0; i<studentCount; i++){
            try{
                System.out.println("\nEnter attendance of "+i+"th Student:");
                int att = scan.nextInt();
                if (att<=4)
                    throw new InSufficientAttendanceException(4);
                System.out.println("Enter total test score:");
                double totalScore = scan.nextDouble();
                if(totalScore <55 )
                    throw new LowScoreException(55);
                System.out.print("Enter class test score:");
                double ctScore = scan.nextDouble();
                if(ctScore <8 )
                    throw new LowScoreException(8, totalScore);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        } // end of for loop
    }// end of main
}// end of class