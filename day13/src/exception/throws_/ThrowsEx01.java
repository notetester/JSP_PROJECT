package exception.throws_;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;

public class ThrowsEx01 {
	public static void main(String[] args) {
		/*
		 * 메서드나, 생성자에서 발생되는 예외를 떠넘기는 키워드가 throws입니다.
		 * throws 구문이 붙어있는 메서드, 생성자르 ㄹ호출할 때는 예외처리를 대신 진행해야 합니다.
		 * 즉, 예외처리를 강요할 때 사용합니다.
		 */
		try {
			//greeting(10);
			calc(0);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			System.out.println("배열 범위를 벗어났습니다.");
		}
		//대표적인 throws 메서드
		try {
			Class.forName("!@#!@#");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
		}
		//대표적인 throws 생성자
//		try {
//			FileInputStream fileInputStream=new FileInputStream("@#$");
//			fileInputStream.close();
//		} catch (FileNotFoundException e) {
//			System.out.println("파일을 찾을 수 없습니다.");
//		}
	}
	private static String[]arr={"안녕하세요","hello","니하오~"};
	public static void greeting(int index) throws Exception{
		System.out.println(arr[index]);
	}
	public static void calc(int num) throws ArithmeticException{
		System.out.println(10/num);
	}
}