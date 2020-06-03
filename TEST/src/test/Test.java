package test;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		int k = 3;
		char c = 'A'; // 'A'의 문자코드는 65

		System.out.println(y += 10 - x++ + ++k);
		System.out.println( !('A' <= c && 'B' <= c && c <='Z' ) );
		System.out.println( ++c + 1); 
		System.out.println( c++);
		System.out.println( c);
		int [] arr= {5,23,1,43,100,200,40};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=0;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		String str1="kim";
		String str2="kim";
		String str3=new String(str1);
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str2==str3);
		System.out.println("=====");
		Tv tv=new Tv();
		System.out.println(tv.isPower());
	}
}
