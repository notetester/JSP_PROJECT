package thread.runable;

public class ThreadTest implements Runnable{
	public void run() {
		//쓰레드 클래스에 정의된 static 메서드 사용가능
//		Thread t=Thread.currentThread();
//		t.getName();
		System.out.println(Thread.currentThread().getName());
		System.out.println("쓰레드 시작1");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000); //1초 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}