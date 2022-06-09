package step04_abstractex;

public abstract class Computer {
	
	abstract void display();

	public void turnOn() {
		System.out.println("���� On");
	}
	
	public void turnOff() {
		System.out.println("���� Off");
	}
}
