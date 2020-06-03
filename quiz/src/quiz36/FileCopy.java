package quiz36;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {

	public static void main(String[] args) {
		/*
		 * 1. 스캐너를 통해서 파일명을 정확히 입력받습니다.
		 * 2. upload 폴더에 해당 파일이 있다면, 해당 파일을 uploadcopy 폴더로 복사하세요.
		 *    파일이 없다면 "파일명이 없습니다" 예외구문을 출력합니다.
		 * 3. 복사도중에 에러가 발생하면 "파일 처리중 예외발생" 구문을 출력
		 */
		Scanner scanner=new Scanner(System.in);
		FileInputStream fileInputStream=null;
		FileOutputStream fileOutputStream=null;
		byte[]arr=new byte[100];
		String str="";
		int result=-1;
		while(true) {
			try {
				System.out.println("복사할 파일명을 입력하세요. 프로그램 종료를 원한다면 0을 입력하세요.");
				str=scanner.next();
				if(str.equals("0")) {break;}
				fileInputStream=new FileInputStream("D:\\course\\java\\upload\\"+str);
				fileOutputStream=new FileOutputStream("D:\\course\\java\\uploadcopy\\"+str);
				while(true) {
					result=fileInputStream.read(arr);
					if(result==-1) {break;}
					fileOutputStream.write(arr,0,result);
				}
				System.out.println("파일이 정상적으로 복사되었습니다.");
			} catch (FileNotFoundException e) {
				System.out.println("파일명이 없습니다.");
			} catch (IOException e) {
				System.out.println("파일 처리중 예외 발생");
			} catch (Exception e) {
				System.out.println("예외 발생");
			}finally {
				try {
					fileInputStream.close();
					fileOutputStream.close();
				} catch (Exception e2) {
					System.out.println("파일 닫기 실패");
				}
			}
		}
		scanner.close();
		System.out.println("프로그램 정상 종료");
	}

}
