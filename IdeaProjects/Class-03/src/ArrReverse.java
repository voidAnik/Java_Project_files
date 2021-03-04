import java.util.Scanner;

public class ArrReverse{

    public static void main(String args[]) {
        Scanner input= new Scanner(System.in);
        char[] c=input.next().toCharArray();
        for(int i=0, j=c.length-1; i<j; i++,j--){
            char t = c[i];
            c[i] = c[j];
            c[j] = t;
        }
        System.out.println(c);
    }
}
