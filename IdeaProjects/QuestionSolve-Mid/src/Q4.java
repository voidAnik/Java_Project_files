import java.util.*;

class InvalidMemberCountException extends Exception
{
    InvalidMemberCountException(String msg)
    {
        super(msg);
    }
}
class InvalidTeamMemberException extends Exception
{
    InvalidTeamMemberException(String msg)
    {
        super(msg);
    }
}
public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter team member count");
        int teamCount = scan.nextInt();
        try{
            checkTeamCount(teamCount);
        }catch(InvalidMemberCountException e){
            System.out.println(e.getMessage());
        }

        int creditComp=0;
        for(int i=0; i<teamCount; i++){
            System.out.println("Please enter the credit completed by member "+ (i+1));
            creditComp = scan.nextInt();
            try {
                checkCredit(creditComp);
            } catch (InvalidTeamMemberException e) {
                e.getMessage();
            }
        }
    }
    public static void checkTeamCount(int count) throws InvalidMemberCountException {
        if(count<3 || count >5)
         throw new InvalidMemberCountException("We need 3 to 5 team members to participate in the contest.");
//pass 3 for min & 5 for max count while creating InvalidMemberCountException
    }
    public static void checkCredit(int credit) throws InvalidTeamMemberException
    {
        if (credit < 100)
       throw new InvalidTeamMemberException("Must complete 100 credits to participate in the contest");
// and pass 100 as minCredit while creating InvalidTeamMemberException object
    }
}