package thread.ex02;

public class MainClass {

	public static void main(String[] args) {
		ThreadTest t1=new ThreadTest();
		Thread thread1=new Thread(t1,"A");
		Thread thread2=new Thread(t1,"B");
		thread1.start();
		thread2.start();
	}

}
