package quiz41;

public class Download implements Runnable{
	public void run() {
		System.out.print("동영상을 다운로드 합니다:");
		for(int i=1;i<=10;i++) {
			System.out.print("*");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}System.out.println("\n다운로드가 완료되었습니다");
	}
}