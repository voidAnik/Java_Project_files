public class RectangleTest {
        public static void main(String[] args)
    {
        Rectangle myRectangle=new Rectangle(5,6);
        //myRectangle.hight=5;
        //myRectangle.width=6;
       // myRectangle.setHight(5);
        //myRectangle.setWidth(6);
        //System.out.println(myRectangle.getHight());
        System.out.println("Area:" +myRectangle.toString());
        System.out.println("Area:" +myRectangle.getArea());
        System.out.println(myRectangle.getArea(4,8));
    }
}
