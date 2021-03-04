import java.io.IOException;
public class Q6b {
    public static void main(String[] args) {
        try {
            whoIs("IOException");
        }
        //System.out.println("Which exception should be handled?");
        catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            System.out.println("Always executes.");
        }
    }
    public static void whoIs(String n) throws IOException{
        System.out.println("Who is %n "+n+"?");
    }
}