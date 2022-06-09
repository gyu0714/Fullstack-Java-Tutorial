package step03_oop;

class A {}
class B extends A {}
class C extends A {}

public class Instanceof {

	public static void main(String[] args) {
		A a1 = new B(); // upCasting
		A a2 = new C(); // upCasting
		A a3 = new A(); // default?


		System.out.println(a1 instanceof A); // true
		System.out.println(a1 instanceof B); // true
		System.out.println(a1 instanceof C); // false 屈力 包拌

		System.out.println();

		System.out.println(a2 instanceof A); // true
		System.out.println(a2 instanceof B); // false 屈力 包拌
		System.out.println(a2 instanceof C); // true default?
		
	}

}
