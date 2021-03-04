import java.util.ArrayList;
import java.util.Comparator;

public class Q7 {
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();
       list.add(12);
       list.add(10);
       sort(list,true);
       for(Integer element : list )
       {
           System.out.println(element);
       }
    }
    public static <T extends Comparable<T>> void sort(ArrayList<T> list, boolean b)
    {
        if(b == true)
        {
            for(int i= 0;i<list.size();i++)
            {
            for(int j=i;j<list.size();j++)
            {
                if(list.get(i).compareTo(list.get(j))>0)
                {
                    T tempT = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,tempT);
                }
            }
        }
        }
        if(b == false)
        {
            for(int i= 0;i<list.size();i++)
            {
                for(int j=i;j<list.size();j++)
                {
                    if(list.get(i).compareTo(list.get(j))<0)
                    {
                        T tempT = list.get(i);
                        list.set(i,list.get(j));
                        list.set(j,tempT);
                    }
                }
            }
        }
    }
}
