package quiz39;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {
		/*
		 * 상품번호, GS25, (치킨도시락), 가력으로 분리해서 출력
		 */
		String str="123123-4564564 GS25(치킨도시락) 4,400원";
		String str2="123123-3453454 GS25(마늘햄쌈) 5,000원";
		String pattern="(\\d+-\\d+)|(GS25)|(\\([가-힣]+\\))|((\\d|,)*원)";
		Matcher matcher=Pattern.compile(pattern).matcher(str);
		while(matcher.find()) {System.out.println(matcher.group());}
		Matcher matcher2=Pattern.compile(pattern).matcher(str2);
		while(matcher2.find()) {System.out.println(matcher2.group());}
	}

}
