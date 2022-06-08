package step01_syntax;

public class Ex03Operation {
	public static void main(String[] args) {
		// 숫자 연산 : +, - , *, /, %
		int v1 = 10;
		int v2 = 3;
		
//		System.out.println(v1 % v2);
		
		// 증감 연산 : ++, --
//		System.out.println(++ v1); // 11
//		System.out.println(v1 ++); // 11
//		System.out.println(v1); // 12
		
		// 기본 연산(정수 타입의 기본연산은 int)
		byte v3 = 10;
		byte v4 = 3;
		
		byte v5 = (byte)(v3 + v4);
		int v6 = (v3 + v4);
		
		// 3.3333... ???
//		System.out.println(v3 / v4); // 3 ?? -> 3.3333 ??
		
		// double
		double result1 = v3 / v4;
		
		double result2 = (double)v3 / v4;
//		System.out.println(result2); // 3.33333...
		
		// Not a Number
//		System.out.println((5 % 0.0) + 2);
		
		// 논리 연산 : &, |, ^, !
		boolean isTrue = true;
		boolean isFalse = false;
		
		// &, &&
//		System.out.println(isTrue & isTrue);
		
//		System.out.println(isTrue & isFalse); // false
//		System.out.println(isTrue && isFalse); // false
		
		// |, ||
		
		// ^ : 연산 결과 하나는 true, 다른 하나는 false --> true
//		System.out.println(isTrue ^ isFalse); // true
		
		// ! : 논리값을 변경(true->false, false->true)
//		System.out.println(!isTrue); // false
		
		// 비교 연산 : <, <=, >, >=, ==, !=
		int num1 = 1;
		int num2 = 10;
		
//		System.out.println(num1 == num2); // false
//		System.out.println(num1 != num2); // true
		
		double num3 = 1.0;
//		System.out.println(num1 == num3); 
		
		// 대입 연산 : =, +=, -=, ...
		int assign = 1;
		assign *= 10; // assign = assign * 10; 
//		System.out.println(assign);
		
		
		// 문자열(String) 연산
		String str1 = "String 1";
		String str2 = "String 1";
		String str3 = "String 2";
		String str4 = new String("String 1");
		
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
//		System.out.println(str4);
		
		// 문자열 + 연산 : 연결 연산
//		System.out.println(str1 + str2);
		
		// 문자열 == 연산 : 같은 객체 여부 
//		System.out.println(str1 == str1); // true
//		System.out.println(str1 == str2); // true
//		System.out.println(str1 == str3); // false 
//		System.out.println(str1 == str4); // false
		
		// equals : 문자열 내용이 같은지 여부
//		System.out.println(str1.equals(str2)); // true
//		System.out.println(str1.equals(str3)); // false
//		System.out.println(str1.equals(str4)); // true
		
		// 삼항 연산 --> 조건? 결과1 : 결과2
		// 67.5g 초과이면 A등급, 그 외
		double meat = 66.1;
		String grade = (meat > 67.5)? "A 등급" : "그 외 등급";
		System.out.println(grade);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
