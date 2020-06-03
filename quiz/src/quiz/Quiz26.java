package quiz;

import java.util.Arrays;

public class Quiz26 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		//1, 1~9까지 절대 중복되지 않는 숫자로 만들어진 3개의 크기의 배열을 만들어내는 프로그램
		// arr에서 절대 중복되지 않게 끔 3개의 숫자를 추출 합니다.
		// 새로운 배열에 옮겨 담습니다.

		//arr에서 임의의 요소를 뽑아서 0, 1, 2 인덱스로 옮깁니다.
		
		//for문을 통해서 0, 1, 2 인덱스의 값을 옮깁니다.
		int[] arr2= {0,0,0,0,0,0,0,0};
		for(int i=0;i<arr2.length;i++) {
			int j=(int)(Math.random()*9);
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=arr[i];
		}
		System.out.println(Arrays.toString(arr2));
	}
}
