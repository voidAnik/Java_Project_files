
public class SubClass extends SuperClass{
	int e;
	
	public SubClass(){
		super();
		e = -1;
	}
	
	public SubClass(SubClass ob){
		super(ob);
		this.e = ob.e;
	}
	
	public SubClass(int a, int b, int c, String name, int e){
		this.a = a;
		this.b = b;
		this.c = c;
		this.setName(name);
		this.e = e;
	}
	
	public int getProduct(){
		return e*super.getProduct();
	}
}
