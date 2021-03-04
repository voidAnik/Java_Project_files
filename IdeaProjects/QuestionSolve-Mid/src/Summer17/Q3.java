package Summer17;

class Work implements Runnable {
    String name;
    Thread t;
    Work(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("New work: "+ t.getName());
        t.start();
    }
    synchronized void printme(int i)
    {
        System.out.println(name+":"+i);
    }
    public void run() {
        for(int i = 3;i > 0; i--) {
            printme(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        System.out.println(name +"Exiting");
    }
}
public class Q3 {
    public static void main(String[] args) {
        Work w1 = new Work("Eat");
        Work w2 = new Work("Pray");
        Work w3 = new Work("Love");
        try {
            w1.t.join();
            w2.t.join();
            w3.t.join();
        }catch (Exception e){}
        System.out.println("Main thread exiting");
    }
}
