package quiz;

public class MethodQuiz03 {
	public static void main(String[] args) {
		String str=java(9);
		System.out.println(str);
	}
	static String java(int a) {
		String s="";
		for(int i=1;i<=a;i++) {
			if(i%2==0) {
				s+='바';
			}else {
				s+='자';
			}
		}
		return s;
	}
}
