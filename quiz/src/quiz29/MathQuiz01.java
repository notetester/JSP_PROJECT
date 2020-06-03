package quiz29;
public class MathQuiz01 {
	public static void main(String[] args) {
		/*
		 * Math.ceil을 사용해서 1-10이 전달되면 1이 반환되는 page 메서드 생성
		 * 11-20이 전달되면 2가 반환되면 됩니다.
		 * 21-30이 전달되면 3이 반환되면 됩니다.
		 */
		System.out.println(page(1));
		System.out.println(page(5));
		System.out.println(page(10));
		System.out.println(page(11));
		System.out.println(page(15));
		System.out.println(page(20));
		System.out.println(page(21));
		System.out.println(page(25));
		System.out.println(page(30));
	}
	public static int page(int num) {
		return (int)Math.ceil(num/10.0);
	}
}