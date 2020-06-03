package quiz;

import java.util.Arrays;

public class Quiz25 {
	public static void main(String[] args) {
		//1. 100개의 크기를 갖는 int배열에 3의 배수를 순서대로 저장
		int[] arr= new int[100];
		for(int a=0;a<arr.length;a++) {
			arr[a]=(a+1)*3;
		}
		System.out.println(Arrays.toString(arr));
	}
}
