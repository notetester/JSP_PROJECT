package quiz28;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringQuiz02 {
	public static void main(String[] args) {
		/*
		 * 1. 주민번호 13자리를 입력받습니다.
		 * 2. 주민번호는 -를 포함해서 받을 수 있습니다.
		 * 3. 13자리가 아니라면 다시 입력받습니다.
		 * 4. 남자인지 여자인지 구분해서 출력해주면 됩니다.
		 */
		Scanner sc=new Scanner(System.in);
		while(true) {
			String id=sc.nextLine();
			if(Pattern.matches("[0-9]{6}-[0-9]{7}",id)&&id.replace("-","").length()==13) {
				if(id.replace("-","").substring(6,7).equals("1")) {
					System.out.println("남자");
				}else {
					System.out.println("여자");
				}
				break;
			}else {
				System.out.println("다시 입력해주세요.");
			}
		}
		sc.close();
	}
}