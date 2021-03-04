import java.util.ArrayList;

class Parent
{
    public Parent()
    {
        System.out.println("Default");
    }
    public Parent(String massage)
    {
        System.out.println("In parent"+massage);
    }
}
class Child extends Parent
{
    public Child(String massage,int value)
    {
        this(massage);
        System.out.println("End Child");
    }
    public Child(String massage)
    {
        super(massage);
        System.out.println("In child"+massage);
    }
}

public class Implicit_ExpliciteCalling {
    public static void main(String[] args)
    {
        Child me=new Child("Doing",5);
    }
}
