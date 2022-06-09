package step01_api;

class Busan {
	public int num;
	
	public Busan(int num) {
		this.num = num;
		System.out.println("Busan" + num +"가 생성");
	}
	
	public void finalize() {
		System.out.println("Busan" + num +"가 제거");
	}
}

public class Ex01LangPackage {

	public static void main(String[] args) {
		// Object Class
		Object obj1 = new Object();
		Object obj2 = new Object();
		
//		System.out.println(obj1.toString());
//		System.out.println(obj2);
		// equals : 동일 객체 비교 결과 반환
//		System.out.println(obj1.equals(obj2));
		
		// System Class
		// getProperty :
//		System.out.println(System.getProperty("os.name"));
	
		// ** gc ** :  garbage collector 쓰레기 수집기
		Busan busan;
		
//		busan = new Busan(1);
//		busan = null;
//		busan = new Busan(2);
//		busan = new Busan(3);
		
//		System.gc();
		
		// String Class

		// charAt
		String str1 = "Java API";
//		System.out.println(str1.charAt(8)); // 에러
		
		// length
//		System.out.println(str1.length());
		
		// 대소문자 변환 메소드
//		System.out.println(str1.toLowerCase());
//		System.out.println(str1.toUpperCase());
		
		// subString
//		System.out.println(str1.substring(1,6));
		
		// replace
//		System.out.println(str1.replace("Java", "자바"));
		
		// trim
		String str2 = "   Java API   ";
//		System.out.println(str2);
//		System.out.println(str2.trim());
		
		// split
		String str3 = "Java API String Test";
//		System.out.println(str3.split(" "));
//		
//		for(String str : str3.split(" ")) {
//			System.out.println(str);
//		}
		
		// StringBuilder
		String str4 = "abc";
		System.out.println(str4.hashCode());

		str4 += "def";
		System.out.println(str4.hashCode());
		
		StringBuilder sb = new StringBuilder("abc");
		System.out.println(sb);
		
		sb.append("def");
		System.out.println(sb);
		
	}

}
