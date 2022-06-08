package step02;

public class Ex04Static {
	// 멤버 변수와 static 멤버변수
	String name;
	static String company;
	
	// 변하지 않는 수 = 상수(final, static) - 대문자, 언더바_
	static final double PI = 3.14;
	
	Ex04Static(String name) {
		this.name = name;
	}
	
	// static 초기화 블럭
	static {
		company = "busan";
	}
	
	static void print() {
		System.out.println(PI);
	}

	public static void main(String[] args) {
		System.out.println(company);
		print();

	}

}
