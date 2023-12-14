package abctraction;

public interface Hero {
	void amey();
	void kaka();
	default void rcb() {
		System.out.println("i am defailt rcb in hero interface");
	}
	static void account() {
		System.out.println(" i am in hero interface");
	}

}
