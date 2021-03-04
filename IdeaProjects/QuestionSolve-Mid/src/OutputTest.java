import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class myThread extends Thread
{
    ArrayList<Integer> listNum;
    String name;
    int n=0;
    Thread t ;
    myThread(ArrayList<Integer> listNum, String name)
    {
        this.listNum = listNum;
        this.name = name;
        t = new Thread(this);
    }
    synchronized public void rem()
    {
        n++;
        System.out.println(name + " " + n);
        listNum.remove(0);
        try {
            Thread.sleep(100);
        }catch(Exception e){}
    }
   public void run()
    {

        for(int i = 0 ; i<4;i++) {
            rem();
        }
    }
}

class OutputTest
{
    public static void main(String[] args)
    {
        ArrayList<Integer> listNum = new ArrayList<>();
        listNum.add(1);
        listNum.add(2);
        listNum.add(3);
        listNum.add(4);
        listNum.add(5);
        listNum.add(6);
        listNum.add(7);
        listNum.add(8);
        listNum.add(9);
        listNum.add(10);
        listNum.add(11);
        listNum.add(12);
        listNum.add(13);
        listNum.add(14);
        listNum.add(15);
        for (int i : listNum)
        {
            System.out.println(i);
        }
        Thread thread1 = new myThread(listNum,"thread1");
        Thread thread2 = new myThread(listNum,"thread2");
        Thread thread3 = new myThread(listNum,"thread3");
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            Thread.sleep(5000);
        }catch(Exception e){}
        System.out.println("After deleting");
        for (int i : listNum)
        {
            System.out.println(i);
        }

    }
}