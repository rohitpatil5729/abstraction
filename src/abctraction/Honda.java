package abctraction;

public interface Honda {
	void abc();
	void lmn();
	static void mi() {
		System.out.println("i am static method in honda interface");
	}
	default void rcb() {
		System.out.println(" i am default rcb method in honda interface");
		
	}
	

}
