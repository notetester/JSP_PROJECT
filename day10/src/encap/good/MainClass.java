package encap.good;

//import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		//맴버변수를 public으로 선언하면 잘못된 값이 저장 될 수도 있음.
		MyDate me=new MyDate();
		me.setYear(2020);
//		int year=me.getYear();
//		System.out.println("년 : "+year);
		me.setMonth(4);
		me.setDay(6);
		me.setSsn("2004061000000");
		me.info();
		/////////////////////////////////////////////////////////////////
		Member m1=new Member("hh123", "1234", "홍길동", "google", "서울", 010, 20);
		Member m2=new Member("kk123", "12345", "홍길자", "naver", "경기", 010, 30);
		Member[]arr2=new Member[2];
		arr2[0]=m1;
		arr2[1]=m2;
		for(int i=0;i<arr2.length;i++) {
			Member m=arr2[i];
			System.out.println(m.getId());
			System.out.println(m.getPw());
		}
//		System.out.println(Arrays.toString(arr2));
//		int a=1;
//		int b=2;
//		int[]arr=new int[2];
//		arr[0]=a;
//		arr[1]=b;
	}
}
