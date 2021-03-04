
public class Inheritance{
	public static void main(String[] args){
		SuperClass superObj = new SuperClass(9, 8, 7, "SUPER");
		SubClass subObj = new SubClass(1, 2, 3, "SUB", 12);
		
		System.out.println(superObj.getProduct());
		superObj = subObj;
		System.out.println(superObj.getProduct());
	}
}
