package test;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ex {
	public static void main(String[] args) {
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.createSheet("new sheet");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue(1);
		row.createCell(3).setCellValue("a string");
		try (OutputStream fileOut = new FileOutputStream("D:\\course\\java\\file\\workbook.xlsx")) {
		    wb.write(fileOut);
		    wb.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}