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
//		Object obj1 = new Object();
//		Object obj2 = new Object();
		
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
//		String str1 = "Java API";
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
//		String str2 = "   Java API   ";
//		System.out.println(str2);
//		System.out.println(str2.trim());
		
		// split
//		String str3 = "Java API String Test";
//		System.out.println(str3.split(" "));
//		
//		for(String str : str3.split(" ")) {
//			System.out.println(str);
//		}
		
		// StringBuilder
//		String str4 = "abc";
//		System.out.println(str4.hashCode());
//
//		str4 += "def";
//		System.out.println(str4.hashCode());
//		
//		StringBuilder sb = new StringBuilder("abc");
//		System.out.println(sb);
//		
//		sb.append("def");
//		System.out.println(sb);
		
		// Wrapper Class
		// ����� Boxing
//		Integer intgr1 = new Integer(1);
//		System.out.println(intgr1.getClass());
		
		// ����� unBoxing
//		System.out.println(intgr1.valueOf(1).getClass()); // �⺻Ÿ������ ����
		
		// �⺻Ÿ���̶� Ŭ���� Ȯ�� �Ұ�
//		int int1 = 1;
		// System.out.println(int1.getClass());
		
		// �ڵ� �ڽ�/��ڽ�
//		Integer intgr2 = 2;
//		System.out.println(intgr2.getClass());
		
//		int intgr3 = intgr2;
//		System.out.println(intgr3);
		
		// parse
//		System.out.println(Integer.parseInt("3"));
//		System.out.println(Double.parseDouble("3"));
//		System.out.println(Integer.parseInt("three"));
		
		// Math
		System.out.println(Math.abs(-15)); // 15
		
		// ceil, floor, round
		System.out.println(Math.ceil(3.4)); // 4
		System.out.println(Math.floor(3.6)); // 3
		System.out.println(Math.round(3.6)); // 4
	}

}
