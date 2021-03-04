public class TwoRectangleTest {
    public static void main(String args[])
    {
        Rectangle rOne=new Rectangle();
        //rOne.hight=5;
        //rOne.width=6;
        Rectangle rTwo=new Rectangle();
        //rTwo.hight=8;
        //rTwo.width=4;

        System.out.println("Before increament:");
        if(rOne.getArea()>rTwo.getArea())
        {
            System.out.println("Rectangle One has large area");
        }
        else
        {
            System.out.println("Rectangle two has large area");
        }
        rOne.increaseWidth(2);
        System.out.println("After increament:");
        if(rOne.getArea()>rTwo.getArea())
        {
            System.out.println("Rectangle One has large area");
        }
        else
        {
            System.out.println("Rectangle two has large area");
        }
    }
}
