package thread.runable;

public class MainClass {

	public static void main(String[] args) {
		//Runable인터페이스를 구현하는 클래스를, 쓰레드 클래스의 생성자로 전달해야 합니다.
		ThreadTest t=new ThreadTest();
		Thread thread=new Thread(t, "쓰레드1");
		thread.start();
		System.out.println("메인 종료~");
	}

}
