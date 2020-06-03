package quiz42;

public class MainClass {

	public static void main(String[] args) {
		VoteThread Location1=new VoteThread();
		VoteThread Location2=new VoteThread();
		VoteThread Location3=new VoteThread();
		Thread thread1=new Thread(Location1,"Location1");
		Thread thread2=new Thread(Location2,"Location2");
		Thread thread3=new Thread(Location3,"Location3");
		thread1.start();
		thread2.start();
		thread3.start();
	}
}