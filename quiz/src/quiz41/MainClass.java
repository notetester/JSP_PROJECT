package quiz41;

public class MainClass {

	public static void main(String[] args) {
		//2개의 객체, 스레드 2개(독립적으로 각각 실행)
		Music music=new Music();
		Download download=new Download();
		Thread thread1=new Thread(music,"music");
		Thread thread2=new Thread(download,"download");
		thread1.start();
		thread2.start();
	}

}
