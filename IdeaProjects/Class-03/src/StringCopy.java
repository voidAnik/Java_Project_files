import java.util.Random;
import java.util.Scanner;

public class StringCopy {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int[] myArray=new int[10];
        Random rnd = new Random();
        int[] yourArray=new int[myArray.length];
        for(int i=0;i<myArray.length;i++)
        {
            myArray[i]=rnd.nextInt(myArray.length);
            System.out.println(myArray[i]);
        }
        System.out.println("FF");
        //yourArray=myArray;
        System.arraycopy(myArray,0,yourArray,0,myArray.length);
        myArray = new int[10];
        for(int i=0;i<yourArray.length;i++)
        {
            System.out.print(yourArray[i]);
            System.out.println(myArray[i]);
        }

    }
}
