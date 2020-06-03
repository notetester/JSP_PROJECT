package api.io.buffered04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FileWriter fw=null;
		BufferedWriter bw=null;
		try {
			/*
			 * 순서대로 nextLine을 써서 2문장을 입력받습니다.
			 * 줄바꿈 처리를 한 다음에 file 폴더 안에 text3.txt형식으로 파일을 쓰세요.
			 */
			fw=new FileWriter("D:\\course\\java\\file\\text3.txt");
			bw=new BufferedWriter(fw);
			System.out.println("2문장을 입력하세요.");
			String str=sc.nextLine();
			String str2=sc.nextLine();
			bw.write(str+"\r\n"+str2);
			System.out.println("정상입력되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				fw.close();
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
