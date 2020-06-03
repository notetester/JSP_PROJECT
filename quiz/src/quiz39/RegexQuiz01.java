package quiz39;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {

	public static void main(String[] args) {
		/*
		 * 가격형식만 찾아서 순서대로 출력해보세요
		 * ex)~~~원
		 */
		// *는 0회 이상반복 : 있어도 되고 없어도 되는 경우
		String str="헠4,500원 헿~ 1,200원엏? 6000원윀 120000원";
//		Matcher matcher=Pattern.compile("\\d+\\,*\\d+원").matcher(str);
//		Matcher matcher=Pattern.compile("[0-9|,]*원").matcher(str);
//		Matcher matcher=Pattern.compile("[\\d|,]*원").matcher(str);
		Matcher matcher=Pattern.compile("(\\d|,)*원").matcher(str);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}

}
