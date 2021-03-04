public class Rectangle {
    private int hight;
    private int width;

    public Rectangle()
    {
    }
    public Rectangle(int hight,int width)
    {
        this.hight=hight;
        this.width=width;
    }

    public String toString() {
        return "Rrectangles hight:"+hight+"width:"+width+".";
    }

    public void setHight(int hight)
    {
        this.hight=hight;
    }
    public int getHight()
    {
        return hight;
    }
    public void setWidth(int width)
    {
        this.width=width;
    }
    public int getWidth()
    {
        return width;
    }
    public int getArea()
    {
        return hight*width;
    }
    public int getArea(int w,int h)
    {
        return w*h;
    }
    public void increaseWidth(int w)
    {
        width+=2;
    }
}
