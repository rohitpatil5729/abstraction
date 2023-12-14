package abctraction;

public interface car {
	
	public abstract void pqr();
	//public abstract int abc();
	public abstract void lmn();
	
	default void xyz() {
		
	}
	static void rcb() {
		
	}
	default int mi() {
		int q=12;
		int p=6;
		int t=q/p;
		System.out.println(t);
		return t;
		
	}
	static int hyd() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		return c;
		
	}
	public static void main(String[] args) {
		hyd();
		//mi();
		
	}
	
		
		
	


}
