package quiz40;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegexQuiz {

	public static void main(String[] args) {
		/*
		 * 1. day, store, grade, detail, price를 맴버로 갖는 Product 클래스를 생성합니다.
		 * 2. getter, setter를 선언합니다.
		 * 3. Product를 제네릭으로 갖는 ArrayList를 생성합니다.
		 * 4. BufferedReader를 통해서 건담.txt파일을 읽어들입니다.
		 * 5. while문 안에서는 readLine()메서드를 이용해서 한줄씩 읽도록 처리합니다.
		 * 6. 날짜, 지점, 등급, 상세, 가격 패턴분석을 통해서 Product에 저장후 리스트에 추가합니다.
		 * 7. 외부라이브러리를 사용해서 분석한 패턴을 xlsx엑셀파일로 추출합니다.
		 */
		List<Product> list=new ArrayList<>();
		FileReader fileReader=null;
		BufferedReader bufferedReader=null;
		FileOutputStream fileOutputStream=null;
		String path="D:\\course\\java\\file\\건담.txt";
		String path2="D:\\course\\java\\file\\건담.xlsx";
		String data="";
		String[]result;
		Matcher matcher;
		String day="날짜", store="지점", grade="등급", detail="상세", price="가격";
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.createSheet("Product");
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue(day);
		row.createCell(1).setCellValue(store);
		row.createCell(2).setCellValue(grade);
		row.createCell(3).setCellValue(detail);
		row.createCell(4).setCellValue(price);
		try {
			fileReader=new FileReader(path);
			bufferedReader=new BufferedReader(fileReader);
			fileOutputStream=new FileOutputStream(path2);
			while((data=bufferedReader.readLine())!=null) {
				result=data.split("\\[");
				result=result[0].split(" ",2);
				day=result[0];
				store=result[1].trim();
				matcher=Pattern.compile("\\[\\S+\\]").matcher(data);
				if(matcher.find()) {
					grade=matcher.group();
				}
				result=data.split("\\]",2);
				matcher=Pattern.compile("(\\d|,)*원").matcher(result[1]);
				if(matcher.find()) {
					price=matcher.group();
				}
				result=result[1].split("(\\d|,)*원");
				detail=result[0].trim();
				list.add(new Product(day, store, grade, detail, price));
			}
			for(int i=0;i<list.size();i++) {
				row = sheet.createRow(i+1);
				row.createCell(0).setCellValue(list.get(i).getDay());
				row.createCell(1).setCellValue(list.get(i).getStore());
				row.createCell(2).setCellValue(list.get(i).getGrade());
				row.createCell(3).setCellValue(list.get(i).getDetail());
				row.createCell(4).setCellValue(list.get(i).getPrice());
			}
			wb.write(fileOutputStream);
			wb.close();
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
