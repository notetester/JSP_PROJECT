package quiz38;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

	private static int total=0;
	public static void main(String[] args) {
		/*
		 * 1. BufferedReader를 통해서 파일을 읽어 들이세요.
		 * 2. 수출입 구분의 "수출" 항목의 품명 "오징어"가 포함되있는 데이터만 구분해서 list<Data>에 처리
		 * 3. 이 데이터의 수출입미화금액 총합계를 구하세요.
		 * if(data.indexOf("오징어")!=-1)
		 */
		FileInputStream fileInputStream=null;
		InputStreamReader inputStreamReader=null;
		BufferedReader bufferedReader=null;
		String add="D:\\course\\java\\file\\해양수산부_수산물 품목별 수출입 현황 - 2020년 02월(월간).csv";
		String data="";
		String[]result;
		List<Data>list=new ArrayList<>();
		try {
			fileInputStream=new FileInputStream(add);
			inputStreamReader=new InputStreamReader(fileInputStream,"EUC-KR");
			bufferedReader=new BufferedReader(inputStreamReader);
			System.out.println(data=bufferedReader.readLine());
			while((data=bufferedReader.readLine())!=null) {
				result=data.replace("'","").split(",");
				list.add(new Data(
						Long.parseLong(result[0]),
						Long.parseLong(result[1]),
						result[2],
						result[3],
						result[4],
						Long.parseLong(result[5]),
						Long.parseLong(result[6]),
						Long.parseLong(result[7]),
						Long.parseLong(result[8]),
						Long.parseLong(result[9])
						));
			}
			list.stream().filter((filterData)->filterData.getProductName().indexOf("오징어")!=-1&&filterData.getExpimp().equals("수출")).forEach((filterData)->filterData.print(total+=filterData.getMoney()));
			System.out.println("합계 금액 : "+total);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bufferedReader.close();
				inputStreamReader.close();
				fileInputStream.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
