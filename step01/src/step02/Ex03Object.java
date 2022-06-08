
package step02;
public class Ex03Object {
	public static void main(String[] args) {
		C c= new C();
	}
}
class A{
	A(){
		System.out.println("Class A 생성자 실행");
	}
}
class B{
	A a=new A();
	B(){
		System.out.println("Class B 생성자 실행");
	}
}
class C{
	B b= new B();
	C(){
		System.out.println("Class C 생성자 실행");
	}
}
	
	
	
	
	
	
	
	