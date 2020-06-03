package quiz27;

import java.util.Scanner;

public class Calculator {

	public int input() throws Exception{
		/*
		 * 1. 정수 2개를 받습니다.
		 * 2. 입력된 값이 정수라면 합계를 반환해주면 됩니다.
		 * 3. 예외가 발생할 수 있는 상황이라면 메서드를 종료하고 예외 메세지를 전달해주면 됩니다.
		 * 4. scan.close() 적절하게 처리해주세요.
		 */
		Scanner sc=new Scanner(System.in);
		int a=0,b=0;
		try {
			a=sc.nextInt();
			b=sc.nextInt();
		} catch (Exception e) {
			throw new Exception("정수만 입력해주세요.");
		}finally {
			sc.close();
		}
		return a+b;
	}

}
