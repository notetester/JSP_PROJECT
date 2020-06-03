package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz20 {
	public static void main(String[] args) {
		//Quiz10
		Scanner sc=new Scanner(System.in);
		System.out.print("수를 입력하세요>");
		int[]num=new int[sc.nextInt()];
		int i=0;
		while(i<num.length) {
			num[i]=i+1;
			i++;
		}
		System.out.print("배열 iarr는:"+Arrays.toString(num));
		sc.close();
	}
}
