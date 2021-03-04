public class Q6a implements Runnable{

    String name;
    Thread t;
     public Q6a(String name) {
        this.name = name;
    }
    public void run(){
        System.out.printf("Running:%s times.\n", name);
    }
    public static void main(String[] args) {
        Q6a t = new Q6a("First Thread");
        Thread t1 = new Thread(t);
        t1.start();
        try {
            t1.join();
        }catch(Exception e){
            System.out.println("Fuck");
        }
    }
}