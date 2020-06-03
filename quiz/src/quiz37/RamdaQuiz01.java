package quiz37;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RamdaQuiz01 {

	public static void main(String[] args) {
		/*
		 * 1. BufferedReader를 사용해서 읽어들이세요.
		 * 2. ,기준으로 잘라서 Data클래스에 한 줄 단위로 저장합니다.
		 * 3. list<Data>에 추가합니다.
		 * 4. 람다식을 이용해서, 지역:서울, 짝수:월의 분양가격 4000이상의 객체만 뽑아서
		 * 새로운 list를 생성
		 */
		FileInputStream fileInputStream=null;
		InputStreamReader inputStreamReader=null;
		BufferedReader bufferedReader=null;
		String add="D:\\course\\java\\file\\주택도시보증공사_전국 평균 분양가격(2020년 2월).csv";
		String data="";
		List<Data>list=new ArrayList<>();
		List<Data>filterList=new ArrayList<>();
		try {
			fileInputStream=new FileInputStream(add);
			inputStreamReader=new InputStreamReader(fileInputStream,"EUC-KR");
			bufferedReader=new BufferedReader(inputStreamReader);
			data=bufferedReader.readLine();
			while((data=bufferedReader.readLine())!=null) {
				String[]result=data.split(",",5);
				result[4]=result[4].replace(",","").replace("-","").replace(" ","").replace("\"","");
				if(result[4].equals("")) {
					result[4]="0";
				}
				list.add(new Data(result[0],result[1],Integer.parseInt(result[2]),Integer.parseInt(result[3]),Integer.parseInt(result[4])));
			}
			filterList=list.stream().filter((filterData)->(filterData.getLocal().equals("서울"))&&(filterData.getMonth()%2==0)&&(filterData.getPrice()>=4000)).collect(Collectors.toList());
			System.out.println("지역명, 규모구분, 연도, 월, 분양가격(㎡)");
			filterList.forEach((filterData)->filterData.print());
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
