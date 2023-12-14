package abctraction;

public class savingaccount extends abstact {
	{
		System.out.println("i am 4th instance block");
	}
	
	static {
		System.out.println(" i am static in child class");
	}
	void pqr() {
		System.out.println("i am the body of abstact class present iun parent class");
	}
	
	public savingaccount(int x,int y,String z){
	    super(x, y, z);
		}
	public savingaccount(){
		super();
		System.out.println("i am super const for no arg constructor 1");
	}
	
	public static void main(String[] args) {
		System.out.println("i am in main method 1");
		savingaccount s=new savingaccount(1,2,"i am boy");
		savingaccount s1=new savingaccount(10,20,"i am girl");
		s1.pqr();
		s.pqr();
		System.out.println("i am in main method");
		savingaccount f=new savingaccount();
}
	{
		System.out.println("i am 3rd instance block present in child class");
	}
		
	}


