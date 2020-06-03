package api.util.arrays;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6,7,8,9,10};
		int[]arr0= {9,11,15,12,1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr0));
		//배열의 정렬
		Arrays.sort(arr);
		Arrays.sort(arr0);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr0));
		//배열의 검색(선행조건 : 오름차순 정렬)
		int index=Arrays.binarySearch(arr,5);
		System.out.println("5가 있는 위치 : "+index);
		int index2=Arrays.binarySearch(arr,123);
		System.out.println("10이 있는 위치 : "+index2); //찾는 값이 없다면 쓰레기 값을 돌려줍니다.(배열 길이 +1 한 후 -붙이기)
		//배열 복사
		int[]copyArr=Arrays.copyOf(arr,arr.length);
		int[]copyArr1=Arrays.copyOf(arr,4);
		//배열 문자열로 확인
		System.out.println(Arrays.toString(copyArr));
		System.out.println(Arrays.toString(copyArr1));
		//배열복사
		int[]copyArr2=Arrays.copyOfRange(arr,3,arr.length);
		System.out.println(Arrays.toString(copyArr2));
		//배열의 내부요소가 동일한지 확인
		if(Arrays.equals(arr,copyArr)) {
			System.out.println("배열 요소가 같다.");
		}else {
			System.out.println("배열 요소가 같지 않다.");
		}
		if(Arrays.equals(arr,copyArr1)) {
			System.out.println("배열 요소가 같다.");
		}else {
			System.out.println("배열 요소가 같지 않다.");
		}
	}
}