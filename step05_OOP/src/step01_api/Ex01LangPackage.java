package step01_api;

class Busan {
	public int num;
	
	public Busan(int num) {
		this.num = num;
		System.out.println("Busan" + num +"�� ����");
	}
	
	public void finalize() {
		System.out.println("Busan" + num +"�� ����");
	}
}

public class Ex01LangPackage {

	public static void main(String[] args) {
		// Object Class
		Object obj1 = new Object();
		Object obj2 = new Object();
		
//		System.out.println(obj1.toString());
//		System.out.println(obj2);
		// equals : ���� ��ü �� ��� ��ȯ
//		System.out.println(obj1.equals(obj2));
		
		// System Class
		// getProperty :
//		System.out.println(System.getProperty("os.name"));
	
		// ** gc ** :  garbage collector ������ ������
		Busan busan;
		
//		busan = new Busan(1);
//		busan = null;
//		busan = new Busan(2);
//		busan = new Busan(3);
		
//		System.gc();
		
		// String Class

		// charAt
		String str1 = "Java API";
//		System.out.println(str1.charAt(8)); // ����
		
		// length
//		System.out.println(str1.length());
		
		// ��ҹ��� ��ȯ �޼ҵ�
//		System.out.println(str1.toLowerCase());
//		System.out.println(str1.toUpperCase());
		
		// subString
//		System.out.println(str1.substring(1,6));
		
		// replace
//		System.out.println(str1.replace("Java", "�ڹ�"));
		
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
