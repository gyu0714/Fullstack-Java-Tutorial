// 도메인 모델(Domain Model)
// - 객체 지향 분석 설계 기반으로 구현하고자 하는 비즈니스영역의 모델을 생성하는 패턴
// - 속성, 기능 분리
// - 단순 : 하나의 

package model.domain;

public class People {
	// 멤버변수(필드)
	String name;
	int age;
	
	// 생성자
	People() {
		
	}
	
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// getMethod
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
}
