  package step02;
public class Ex01People {
	Ex01People(){
		System.out.println("생성자 실행이 되었습니다.");
	}
	// 멤버 변수 (필드)
	String name="Java";
	int age=27;
	// 메소드 , 이름 반환 메소드
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	void print(){
		System.out.println("jhhk");
	//	System.out.println(getAge());
	}
	public static void main(String[] args) {
		//객체 생성(클래스 만들고 사용가능하게 객체를 생성)
		Ex01People ppl1= new Ex01People();
		System.out.println(ppl1);//만든 객체 출력
		System.out.println(ppl1.getName());
		System.out.println(ppl1.getAge());
		ppl1.print();
	}
}