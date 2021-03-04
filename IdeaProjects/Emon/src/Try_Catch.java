import java.util.Scanner;
public class Try_Catch {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] two = new int[2][2];
        two[0][0] = 1;
        two[0][1] = 2;
        two[1][0] = 3;
        two[1][1] = 4;
        try{
            for (int i=0 ; i<3 ; i++)
            {
                for (int j=0 ; j<3 ; j++)
                {
                    System.out.printf("%d ", two[i][j]);
                }
                System.out.printf("\n");
            }
        }
        catch (Exception e)
        {
            System.out.println("This line is printed");
        }

    }
}
