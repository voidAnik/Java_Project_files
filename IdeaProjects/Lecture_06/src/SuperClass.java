
public class SuperClass{
	public int a;
	public int b;
	public int c;
	private String name;
	
	public SuperClass(){
		a = b = c = -1;
		name = "NULL";
	}
	
	public SuperClass(SuperClass ob){
		this.a = ob.a;
		this.b = ob.b;
		this.c = ob.c;
		
		this.name = ob.name;
	}
	
	public SuperClass(int a, int b, int c, String name){
		this.a = a;
		this.b = b;
		this.c = c;
		this.name = name;
	}
	
	public int getProduct(){
		return a*b*c;
	}
	
	public String getNmae(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}
