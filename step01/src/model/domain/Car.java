package model.domain;

public class Car {
	private int carNum;
	private static int serialNum = 343;
	
	// getter
	public int getCarNum() {
		return carNum;
	}
	
	// setter
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	
	// 생성자
	public Car() {
		this.carNum = ++serialNum;
	}
	
}
