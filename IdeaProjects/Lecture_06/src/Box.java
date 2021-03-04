public class Box {
    private double height;
    private double width;
    private double depth;
    Box(Box box)
    {
        width=box.width;
        height=box.height;
        depth=box.depth;
    }
    Box(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    Box()
    {
        width=-1;
        height=-1;
        depth=-1;
    }
    Box(double len)
    {
        width=height=depth=len;
    }
    double Volume()
    {
        return width*height*depth;
    }
}
