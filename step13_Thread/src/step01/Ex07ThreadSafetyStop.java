package step01;

public class Ex07ThreadSafetyStop extends Thread {
	
	public Ex07ThreadSafetyStop() {}

	public Ex07ThreadSafetyStop(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);
	}

	@Override
	public void run() {
		while(true) {
			System.out.println("Thread running");
			
			if(Thread.interrupted()) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Ex07ThreadSafetyStop thread = new Ex07ThreadSafetyStop();
//		thread.start();
//		
//		try {
//			Thread.sleep(1000);
//			thread.interrupt();			
//			} catch (InterruptedException e) {
//		}
		
		// 스레드 그룹화
		ThreadGroup busan = new ThreadGroup("busan");
		Ex07ThreadSafetyStop thread1 = new Ex07ThreadSafetyStop(busan, "thread1");
		Ex07ThreadSafetyStop thread2 = new Ex07ThreadSafetyStop(busan, "thread2");
		Ex07ThreadSafetyStop thread3 = new Ex07ThreadSafetyStop(busan, "thread3");
	
		busan.list();
		busan.interrupt();
	}

}
