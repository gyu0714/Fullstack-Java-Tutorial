package step04_template;

public abstract class Car {
	
	abstract void drive();
	abstract void stop();
	
	public void turnOn() {
		System.out.println("trun On");
	}
	
	public void turnOff() {
		System.out.println("trun Off");
	}
	
	final public void run() {
		turnOn();
		drive();
		stop();
		turnOff();
	}
}
