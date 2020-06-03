package api.io.stream01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutputStreamEx {

	public static void main(String[] args) {
		/*
		 * 1. 파일을 쓸 때 사용하는 클래스는 FileOutputStream입니다.
		 * 2. 생성자 매개값으로 파일을 쓸 전체 경로를 지정합니다.
		 * 3. io 패키지 모든 클래스들은 생성자에 throws 키워드가 있기 때문에
		 *    try~catch 블록과 함께 써야합니다.
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.print("파일명>");
		String name=scanner.next();
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("D:\\course\\java\\file\\"+name+".txt");
			System.out.println("문장을 입력하세요>");
			scanner.nextLine();//next() 다음에 nextLine()을 쓰려고 할 때, 그냥 넘어가버리는 문제
			String str=scanner.nextLine();//그 이유가 엔터값 기준으로 값을 입력받고, nextLine()에 전달되서 문장의 종료로 인식되기 때문
			byte[]arr=str.getBytes();//문자열 데이터를 바이트 데이터로 변형
			fos.write(arr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
				scanner.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
