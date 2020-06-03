package thread.thread;

public class ThreadTest extends Thread{
	public void run() {
		//쓰레드의 기능을 전부 상속받아서 사용할 수 있다.
		System.out.println(getName());
		System.out.println("쓰레드 시작1");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			try {
				sleep(1000); //1초 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}