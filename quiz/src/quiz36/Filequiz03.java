package quiz36;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Filequiz03 {

	public static void main(String[] args) {
		/*
		 * 1. Date 클래스를 이용해서 File 경로에 하위 폴더로 20200421file 폴더를 생성합니다.
		 * 2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성합니다.
		 * 3. 그만을 입력받을 때 까지 엔터를 포함해서 입력 받습니다.
		 *    \r\n을 적절하게 이용해서 파일 출력을 완료
		 * 4. 파일을 다 썼다면 아무 방법으로 읽어들여서 이클립스창에 출력.
		 */
		Date date=new Date();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMdd");
		Scanner scanner=new Scanner(System.in);
		String string="",add="D:\\course\\java\\file\\"+simpleDateFormat.format(date)+"file";
		File file=new File(add);
		if(file.mkdir()) {
			System.out.println("폴더 생성 완료");
		}else {
			System.out.println("이미 존재하는 폴더입니다.");
		}
		FileWriter fileWriter=null;
		BufferedWriter bufferedWriter=null;
		FileReader fileReader=null;
		BufferedReader bufferedReader=null;
		try {
			System.out.println("생성할 파일명을 입력해주세요.");
			System.out.print(">");
			string=scanner.nextLine();
			add+="\\"+string+".txt";
			fileWriter=new FileWriter(add);
			bufferedWriter=new BufferedWriter(fileWriter);
			System.out.println("파일 내용을 입력해주세요. 입력을 종료하시려면 그만을 입력해주세요.");
			System.out.println("=================================================");
			string="";
			while(true) {
				String temp=scanner.nextLine();
				if(temp.equals("그만")) {
					break;
				}
				string+=temp+"\r\n";
			}
			bufferedWriter.write(string);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bufferedWriter.close();
				fileWriter.close();
				scanner.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		try {
			fileReader=new FileReader(add);
			bufferedReader=new BufferedReader(fileReader);
			System.out.println("생성한 파일을 출력하겠습니다.");
			System.out.println("=================================================");
			while(true) {
				int temp=bufferedReader.read();
				if(temp==-1) {break;}
				System.out.print((char)temp);
			}
			System.out.println("=================================================");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bufferedReader.close();
				fileReader.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
