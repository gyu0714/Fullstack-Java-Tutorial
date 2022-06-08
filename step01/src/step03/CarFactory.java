package step03;

import model.domain.Car;

public class CarFactory {
	// 싱글톤 패턴
	private static CarFactory instance = new CarFactory();
	
	private CarFactory() {
		
	}
	// createCar() : return car;
	
	public static CarFactory getInstance() {
		if(instance == null) {instance = new CarFactory();}
		return instance;
	}

	public Car createCar() {
		Car car = new Car();
		return car;
	}
	
}
