package quiz;

public class Quiz05 {
	public static void main(String[] args) {
		//-5~5까지 랜덤 값을 만들고 0이라면 0출력 양수라면 양수, 음수라면 음수 출력
		int a=(int)(Math.random()*11-5);
		System.out.println(a==0?0:a>0?"양수":"음수");
	}
}