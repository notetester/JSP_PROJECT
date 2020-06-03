package quiz;

import java.util.Scanner;

public class Quiz13 {
	public static void main(String[] args) {
		int num1=0,num2=0;
		String calc="";
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("정수1>");
			if(sc.hasNextInt()) {
				num1=sc.nextInt();
				break;
			}else {
				System.out.println("정수로만 입력하세요.");
				sc.next();
				continue;
			}
		}
		while(true) {
			System.out.print("연산을 선택하세요.[+, -, *, /]>");
			boolean escape=false;
			calc=sc.next();
			switch(calc) {
			case "+":escape=true;break;
			case "-":escape=true;break;
			case "*":escape=true;break;
			case "/":escape=true;break;
			default:
				escape=false;
				System.out.println("[+, -, *, /]중에서 선택해주세요.");
				break;
			}
			if(escape) {
				break;
			}
		}
		while(true) {
			System.out.print("정수2>");
			if(sc.hasNextInt()) {
				num2=sc.nextInt();
				break;
			}else {
				System.out.println("정수로만 입력하세요.");
				sc.next();
				continue;
			}
		}
		switch(calc) {
		case "+":
			System.out.println("두 수의 덧샘은 "+(num1+num2));
			break;
		case "-":
			System.out.println("두 수의 뺄샘은 "+(num1-num2));
			break;
		case "*":
			System.out.println("두 수의 곱샘은 "+(num1*num2));
			break;
		case "/":
			System.out.println("두 수의 나눗샘은 "+(num1/num2));
			break;
		default:
			System.out.print("오류");
			break;
		}
		sc.close();
	}
}
