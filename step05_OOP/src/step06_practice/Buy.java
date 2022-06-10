package step06_practice;

public interface Buy {
	
	default void order() {
		System.out.println("Buy Order");
	}
	
	void buy();
}
