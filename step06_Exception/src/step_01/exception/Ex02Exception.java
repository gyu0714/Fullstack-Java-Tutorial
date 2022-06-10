package step_01.exception;

class Info{
	static {
		System.out.println("Info Class");
	}
}

public class Ex02Exception {
	public static void main(String[] args) {
		try {
			Class.forName("step_01.exception.Info");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {			
			// java.lang.NullPointerException
			String str1 = null;
			System.out.println(str1.length());

			// java.lang.NumberFormatException
			String str2 = "three";
//			Integer.parseInt(str2);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
