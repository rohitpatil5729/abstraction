package abctraction;

public abstract class abstact{
	
	static {
		System.out.println("i am static block of parent class");
	}
	
	{
      System.out.println("i am 1st nstance block in paraent");
	}
	int a;
	int b;
	String c;
	public abstact (int x, int y, String z){

		a=x;
		b=y; 
		c=z;
		System.out.println("i am parameterised constructor");
		abc();
	}
	public abstact(){
		System.out.println("i am no arg constructer1");
		
	}
void abc() {
	System.out.println("my value is a=" + a );
	System.out.println("my value is b=" + b );
	System.out.println("my value is c=" + c);
}
abstract void pqr();

{
	System.out.println("i am 2nd instnce in paraent class");}
}
