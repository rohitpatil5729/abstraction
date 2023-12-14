package abctraction;

public class car1 implements car {
	public car1() {
		this(0,0,"");
		System.out.println("i am no arg constructor");
	}
	int a;
	int b;
	String c;
	public car1(int x, int y, String z) {
		//this();
		a=x;
		b=y;
		c=z;
		
		System.out.println(" i am parameterised constructor");
		
	}
static {
	System.out.println("i am static block in class car");
}
{
	System.out.println("i am insatce block in class car");
	}
	
	public void pqr() {
		System.out.println("i am abstract method of pqr");
		
		
		
	}

	@Override
	public void lmn() {
		// TODO Auto-generated method stub
		
		System.out.println("i am abstract method of lmn");
	}
	static void hcl() {
		System.out.println("i am hcl method in class car1");
		
	}
	
	public static void main(String[] args) {
		
		
		//c.lmn();
		//c.pqr();
		//car.hyd();
		//c.mi();
		hcl();
		car1 c=new car1(1,2,"rohit");
		car1 q=new car1();
		
	}

}
