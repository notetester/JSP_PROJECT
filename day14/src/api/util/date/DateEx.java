package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		//날짜 클래스
		Date date=new Date();
		System.out.println(date);
		System.out.println(date.toString());
		//날짜 포맷 클래스
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY년 MM월 DD일 HH시 MM분 SS초");
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy년 mm월 dd일 hh시 mm분 ss초");
		String s=sdf.format(date);
		String s2=sdf2.format(date);
		String s3=sdf3.format(date);
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		SimpleDateFormat sdf4=new SimpleDateFormat("yyyyMMdd");
		String s4=sdf4.format(date);
		System.out.println(s4);
		SimpleDateFormat sdf5=new SimpleDateFormat("yyMMdd");
		String s5=sdf5.format(date);
		System.out.println(s5);
	}
}