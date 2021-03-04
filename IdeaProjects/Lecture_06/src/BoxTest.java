public class BoxTest {
    public static void main(String[] args)
    {
        WeightedBox box1=new WeightedBox(5,5,5,5);
        WeightedBox box2=new WeightedBox(5,5);
        WeightedBox box3=new WeightedBox();
        WeightedBox box4=new WeightedBox((box2));
        WeightedBox box5=new WeightedBox(5,5,5,1);
        System.out.println("Volume:"+box1.Volume());
        System.out.println("Wight:"+box1.weight);
        System.out.println("Volume:"+box2.Volume());
        System.out.println("Wight:"+box2.weight);
        System.out.println("Volume:"+box3.Volume());
        System.out.println("Wight:"+box3.weight);
        System.out.println("Volume:"+box4.Volume());
        System.out.println("Wight:"+box4.weight);
        System.out.println("Volume:"+box5.Volume());
        System.out.println("Wight:"+box5.weight);
    }
}
