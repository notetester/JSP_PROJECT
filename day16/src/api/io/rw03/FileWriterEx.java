package api.io.rw03;

import java.io.FileWriter;

public class FileWriterEx {

	public static void main(String[] args) {
		/*
		 * 문자를 써서 저장할 때 사용하는 클래스는 FileWriter 클래스입니다.
		 * 기본적으로 2바이트 단위로 처리하기 때문에 문자쓰기에 적합합니다.
		 */
		FileWriter fw=null;
		try {
			fw=new FileWriter("D:\\course\\java\\file\\test.txt");
			String str="오늘은 4월 20일 입니다~\r\n아 집에 가고 싶다.";//\n은 줄바꿈 \r은 다시 커서를 처음
			fw.write(str);
			System.out.println("파일이 정상적으로 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
