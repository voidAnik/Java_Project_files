import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String args[])
    {
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        String[] names=new String[n];
        for(int i=0;i<n;i++)
        {
            names[i]=input.next();
        }
        System.out.println("\n");
        Arrays.sort(names);
        for(int i=0;i<n;i++)
        {
            System.out.println(names[i]);
        }
    }
}
