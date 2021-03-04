class Parent {
    int x=10;
    Parent()
    {
        x++;
        System.out.println("Parent");
    }
    Parent(int y)
    {
        x++;
        System.out.println("Parent");
    }
}

abstract class Child extends Parent {
    Child()
    {
        x++;
        System.out.println("Child");
    }
    Child(int n)
    {
        System.out.println("Child76576");
    }
    abstract void add();
}
class ChildChild extends Child {
    ChildChild()
    {
        System.out.println("ChildChild");
    }
    ChildChild(int n)
    {
        System.out.println("Child76576");
    }
    void add(){}
}
public class Test {
    public static void main(String args[])
    {
        ChildChild obj=new ChildChild();
        System.out.println(obj.x);
    }
}

