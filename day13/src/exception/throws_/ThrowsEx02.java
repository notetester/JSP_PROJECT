package exception.throws_;
public class ThrowsEx02 {
	public void aaa(int i) throws Exception{
		System.out.println("aaa 호출");
//		try {
			System.out.println(10/i);
//		}catch(Exception e) {
//			System.out.println("0 나누기 안 되요");
//		}
		System.out.println("aaa 종료");
	}
	public void bbb() throws Exception{
		System.out.println("bbb 호출");
//		try {
			aaa(0);
//		} catch (Exception e) {
//			System.out.println("0으로 나눌 수 없어요.");
//		}
		System.out.println("bbb 종료");
	}
	public ThrowsEx02() throws Exception{
		System.out.println("생성자 호출");
		bbb();
		System.out.println("생성자 종료");
	}
	public static void main(String[] args) {
	}
}
