package quiz36;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Filequiz02 {
	public static void main(String[] args) {
		/*
		 * 1. Date 클래스를 이용해서 file 경로에 20200421.txt 이름으로 파일을 씁니다
		 * 2. 내용은 아무거나 작성하세요.
		 * 3. 파일을 정상적으로 썼다면 BufferedReader를 통해서 파일을 읽어들이세요.
		 */
		Date date=new Date();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMdd");
		FileWriter fileWriter=null;
		BufferedWriter bufferedWriter=null;
		FileReader fileReader=null;
		BufferedReader bufferedReader=null;
		try {
			fileWriter=new FileWriter("D:\\course\\java\\file\\"+simpleDateFormat.format(date)+".txt");
			bufferedWriter=new BufferedWriter(fileWriter);
			bufferedWriter.write("hahahahahaha delux bomba\r\nuaaaaaaaaak!!");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bufferedWriter.close();
				fileWriter.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		try {
			fileReader=new FileReader("D:\\course\\java\\file\\"+simpleDateFormat.format(date)+".txt");
			bufferedReader=new BufferedReader(fileReader);
			String str="";
			while((str=bufferedReader.readLine())!=null) {
				System.out.println(str);
			}
//			while(true) {
//				int i=bufferedReader.read();
//				if(i==-1) {break;}
//				System.out.print((char)i);
//			}
		} catch (IOException e) {
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
