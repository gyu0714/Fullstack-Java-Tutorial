package step02;
public class Ex02People2 {
	String name="Java";
	int age=27;
	// 객체 생성시 생성자에 데이터를 전달 받기 위해 자료형을 명시하고 있다.
	Ex02People2(String name,int i){
		this.name=name;
		this.age=i;
	}
	Ex02People2(){
		this.name="디폴트생성자";
		this.age=999999999;
	}
	Ex02People2(String name){
		this.name=name;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	void print(){
		System.out.println(age);
		System.out.println(name);
	}
	public static void main(String[] args) {
		//객체 생성시 생성자 사용
		Ex02People2 ppl1= new Ex02People2("자바",30);
		ppl1.print();
		Ex02People2 ppl2= new Ex02People2();// 값을 넣지 않았기 때문에 디폴트 생성자가 실행 된다.
		ppl2.print();
		Ex02People2 ppl3= new Ex02People2("자바");
		ppl3.print();
	}
}