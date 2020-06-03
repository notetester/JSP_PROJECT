package itkorea;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataReader {

	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMdd");
		String add="D:\\course\\java\\file\\"+simpleDateFormat.format(date)+".csv";
		FileReader fileReader=null;
		BufferedReader bufferedReader=null;
		try {
			fileReader=new FileReader(add);
			bufferedReader=new BufferedReader(fileReader);
			String str="";
			while((str=bufferedReader.readLine())!=null) {
				String[]arr=str.split(",");
				for(int i=0;i<arr.length;i++) {
					System.out.print(arr[i]+" ");
				}
				System.out.println();
			}
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
