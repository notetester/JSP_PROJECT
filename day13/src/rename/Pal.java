package rename;
public class Pal {
	public static void main(String[] args) {
		/*
		 * 아이티뱅크 친구 네오는 palindrome()를 함수를 만들었습ㄴ미다.
		 * - 매개변수로 String값을 받아서 회문 여부를 검사하는 메서드입니다.
		 * ex) 다시 합창 합시다, 아 좋다 좋아, 다시다
		 * 매개변수를 공백을 포함해서 받을 수 있습니다.
		 * 회문이라면 return "회문입니다."를 반환합니다.
		 * 회문이 아니라면 "회문이 아닙니다."를 반환합니다.
		 */
		System.out.println(palindrome("다시 합창 합시다"));
		System.out.println(palindrome("회문이 아닌자"));
		System.out.println(palindrome("아 좋다 좋아"));
		System.out.println(palindrome("종로"));
		System.out.println(palindrome("다시다"));
	}
	public static String palindrome(String s) {
//		return s.replace(" ","").equals(new StringBuffer(s.replace(" ","")).reverse().toString())?"회문입니다.":"회문이 아닙니다.";
//		return s.replace(" ","").equals(new StringBuilder(s.replace(" ","")).reverse().toString())?"회문입니다.":"회문이 아닙니다.";
		String r="";
		for(int i=s.replace(" ","").length()-1;i>=0;i--) {
			r+=s.replace(" ","").charAt(i);
		}
		return r.equals(s.replace(" ",""))?"회문입니다.":"회문이 아닙니다.";
	}
}