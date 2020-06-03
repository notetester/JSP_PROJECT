package rename;
public class Palindrome {
	public static String palindrome(String s) {
		String r="";
		for(int i=s.replace(" ","").length()-1;i>=0;i--) {
			r+=s.replace(" ","").charAt(i);
		}
		return r.equals(s.replace(" ",""))?"회문입니다.":"회문이 아닙니다.";
	}
}