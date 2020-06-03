package day04;

public class WhileEx04 {
	public static void main(String[] args) {
//		int[]arr= {1,2,3,4,5,6,7,8,9,10};
		int[]arr= {10,9,8,7,6,5,4,3,2,1};
		int i=0;
		int sum=0;
		while(i<arr.length) {
//			System.out.println(arr[i]);
			sum+=arr[i];
			i++;
		}
		System.out.println("배열 요소의 합 : "+sum);
	}
}
