public class ReferenceTest {
    public static void main(String[] args)
    {
        Rectangle sRect=new Rectangle();
        System.out.println("Area:"+sRect.getgetArea());
        ColouredRectangle cRect=new ColouredRectangle();
        cRect.height=10;
        cRect.width=15;
        cRect.setColour("Yellow");
        sRect=cRect;
        System.out.println("Area:"+sRect.getgetArea());
    }
}
