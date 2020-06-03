package quiz;

public class Quiz04 {
	public static void main(String[] args) {
		int bucket=10;
		//1~150까지 랜덤한 정수르 발생시키고 사과의 개수라고 가정
		//bucket은 사과를 담을 수 있는 바구니
		//필요한 바구니의 개수를 구하세요. 
		int apple=(int)(Math.random()*150+1);
		int result=0;
		result=apple%bucket==0?apple/bucket:apple/bucket+1;
		System.out.println("사과의 개수 : "+apple);
		System.out.println("필요한 바구니의 개수 : "+result);
	}
}
