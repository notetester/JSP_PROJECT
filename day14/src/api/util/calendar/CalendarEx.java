package api.util.calendar;
import java.util.Calendar;
public class CalendarEx {
	public static void main(String[] args) {
		//Calendar cal=new Calendar();
		Calendar cal=Calendar.getInstance();//달력관련 클래스 싱글톤 형식
		System.out.println(Calendar.SECOND);
		System.out.println(cal.get(13));
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH)+1;
		int date=cal.get(Calendar.DATE);
		System.out.println(year+"년"+month+"월"+date+"일");
		int hour=cal.get(Calendar.HOUR);
		int minute=cal.get(Calendar.MINUTE);
		int second=cal.get(Calendar.SECOND);
		System.out.println(hour+"시"+minute+"분"+second+"초");
		System.out.println(Calendar.YEAR);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DATE);
		System.out.println(Calendar.HOUR);
		System.out.println(Calendar.MINUTE);
		System.out.println(Calendar.SECOND);
		System.out.println(cal.get(13));
	}
}