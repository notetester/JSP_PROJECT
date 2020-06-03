package api.io.stream01;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class InputStreamEx {

	public static void main(String[] args) {
		/*
		 * 1. 파일을 읽어들이는데 사용하는 클래스는 FileInputStream입니다.
		 * 2. 생성자의 매개밧으로 읽어들일 파일의 전체경로를 적습니다.
		 * 3. io패키지의 모든 메서드는 throws키워드가 있기 때문에 try~catch안에서 사용합니다.
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.print("파일명>");
		String name=scanner.next();
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("D:\\course\\java\\file\\"+name+".txt");
			/*
			while(true) {
				//1바이트씩 읽기
				int data=fis.read(); //1바이트 단위로 읽음
				System.out.print((char)data); //숫자형을 문자형으로 출력
				if(data==-1) {break;} //read()메서드가 더 이상 읽을 값이 없다면 -1을 반환
			}
			*/
			byte[]arr=new byte[100];
			int result=fis.read(arr); //100바이트 단위로 읽어들임
			System.out.println("읽어들인 데이터 길이 : "+result);
			System.out.println(Arrays.toString(arr));
			int i=0;
			while(true) {
				if(arr[i]==0) {break;}
				System.out.print((char)arr[i]);
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				scanner.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
