package exception.trycatch;

//import java.util.Scanner;

public class TryCatchEx03 {

	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
		while(true) {
			try {
				System.out.print(">");
//				int num=scan.nextInt();				
			} catch (Exception e) {
				System.out.println("숫자로 입력하실래요?");
			}
		}
	}

}
