package thread.ex01;

public class ThreadTest implements Runnable{
	int num=0;
	public void run() {
		for(int i=1;i<=10;i++) {
			if(Thread.currentThread().getName().equals("A")) {
				System.out.println("--------------------------");
				num++;
			}
			System.out.println("스레드명 : "+Thread.currentThread().getName()+", num : "+num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}