public class Grand {
    public static class Parents
    {
        public String name="UIU";
        public Parents()
        {
         System.out.println("In parents");
        }
    }
    public static class Child extends Parents
    {
           public String name;
           public Child()
           {
               System.out.println("In child");
           }
           public Child(String a, String b)
           {
               super.name=a;
               name=b;
           }
           public void PrintMe()
           {
               System.out.println(super.name);
               System.out.println(this.name);
           }
    }
    public static class GrandChild extends Child
    {
        public String name;
        public GrandChild(){}
        public GrandChild(String a, String b, String c)
        {
            super(a,b);
            name=c;
        }
        public void PrintMee()
        {
            super.PrintMe();
            System.out.println(name);
        }
    }
    public static void main(String[] args)
    {
        GrandChild grandchild=new GrandChild("UIU","Uni","Bd");
        grandchild.PrintMee();
        //Parents you=new Parents();
        Child me=new Child();
        Child mee=new Child("I","you");

    }
}
