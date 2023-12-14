package abctraction;

public class herohonda implements Honda,Hero {
	public void rcb() {
		//herohonda v=new herohonda();
		Honda.super.rcb();
		Hero.super.rcb();
		
		
	}
	static {
		System.out.println("i am static block in herohonda");
	}
	herohonda(){
		System.out.println("i am no are constructor");
	}
	{
		System.out.println("i am instance block in herohonda");
	}
	//*herohonda(int c,int b,int a){
		//System.out.println(" i am parameterised constructor");
	//}
	

	@Override
	public void amey() {
		int a=10;
		int b=10;
		System.out.println(a%b);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kaka() {
	amey();
		
	}

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("abc method");
		
	}

	@Override
	public void lmn() {
		// TODO Auto-generated method stub
		System.out.println("lmn method");
		
	}
	public static void main(String[] args) {
		//herohonda m=new herohonda(1,2,3);
		herohonda c=new herohonda();
		//c.lmn();
		//c.kaka();
	//	c.abc();
		c.rcb();
		Honda.mi();
		//Hero.account();
		
		
		
	}

}
