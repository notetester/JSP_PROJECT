package day04;

public class ForEx1 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println("1~10까지의 합 : "+sum);
		System.out.println("================");
		for(int j=10;j>0;j--) {
			System.out.println(j);
		}
	}
}
