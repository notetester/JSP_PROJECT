package quiz;

public class Quiz02 {
	public static void main(String[] args) {
		//quiz01
		int a=(int)(Math.random()*100+1);
		String res=a%2==0?"짝수":"홀수";
		System.out.println("랜덤수는: "+a);
		System.out.println("3항 연산의 결과: "+res);
	}
}
