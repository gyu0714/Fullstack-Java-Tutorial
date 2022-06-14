package step02_innerclass;

class OutClass {
	
	// 전역변수
	int outNumber = 100;
	static int staticOutNumber = 200;
	
	// Local Class
	Runnable getRunnable(int i) {
		int number = 100;
		
//		class MyRunnable implements Runnable {
			return new Runnable() {
			int localNumber = 10;
			
			@Override
			public void run() {
				// 외부 클래스
				System.out.println("외부 클래스, 인스턴스 변수 : " + outNumber);
				System.out.println("외부 클래스, static 변수 : " + staticOutNumber);

				System.out.println();
				//
//				i = 100; // final : 값 변경 불가, 상수 풀 메모리에 계속 존재하는 것과 같음
//				number = 1000; // final
				
				// getRunnable이라고 하는 메소드가 호출되어 끝났다 할지라도
				// run 메소드 내부에서 계속해서 호출해서 사용할 수 있음.
				System.out.println("외부 클래스, 매개변수 : " + i);
				System.out.println("메소드, 지역변수 : " + number);
				System.out.println("지역 클래스, 인스턴스 변수 : " + localNumber);
			}
		};
//		return new MyRunnable(); 지역 클래스는 외부에서 사용되지 않는다. 따라서 return 해줄 피요 없음
	}
	
	// 익명 클래스
	Runnable runner = new Runnable() {
		int localNumber = 10;
		
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
			System.out.println(outNumber);
			System.out.println(localNumber);
		}
	};
}

public class LocalAnomousInnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		Runnable runner = outClass.getRunnable(10);
//		runner.run();
		
		outClass.runner.run();		
	}

}
