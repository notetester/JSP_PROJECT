package quiz;

public class Quiz03 {
	public static void main(String[] args) {
		//quiz02
		int a=(int)(Math.random()*11-5);
		System.out.println("랜덤값: "+a);
		//System.out.println(a+"의 절대값은: "+Math.abs(a));
		System.out.println(a+"의 절대값은: "+(a>=0?a:-a));
	}
}
