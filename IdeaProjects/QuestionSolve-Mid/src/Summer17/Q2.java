package Summer17;
class running
{
    boolean bool = false;
    synchronized void getting(String name)
    {
        if(!bool)
        {
            System.out.println(name + "Passed");
            bool=true;
           // notify();
        }
    }
   synchronized void giving(String name)
    {
        if(bool)
        {
            System.out.println(name + "Passed");
            bool=false;
           // notify();
        }
    }
}
class Player1 implements Runnable
{
    running r;
    String name;
    Player1(String name,running r)
    {
        this.r = r;
        this.name = name;
        new Thread(this,name).start();
    }
    public void run()
    {
        for(int i =0;i<6;i++)
        {
        r.giving(name);
        try {
            Thread.sleep(500);
        }catch (Exception e){}
        }
    }
}
class Bondhu implements Runnable
{
    running r;
    String name;
    Bondhu(String name,running r)
    {
        this.r = r;
        this.name = name;
        new Thread(this,name).start();
    }
    public void run()
    {
        for(int i = 0 ;i<5;i++) {
            r.getting(name);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
public class Q2 {
    public static void main(String[] args)
    {
        running r= new running();
        Player1 th1 = new Player1("Player1",r);
        Bondhu th2 = new Bondhu("Bondhu",r);
       // th1.start();
        //th2.start();

    }
}
