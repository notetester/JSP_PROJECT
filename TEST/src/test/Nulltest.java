package test;

import java.util.Arrays;

public class Nulltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]arr;
		String[]a="1 2 3,000원".split("(\\d|,)*원");
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
		System.out.println("9,7".replace(",",""));
		System.out.println("  ".trim().equals(""));
		System.out.println("  ".replace(" ","").equals(""));
		System.out.println(Integer.parseInt("1"));
		System.out.println("\t");
		arr="1,2,3,4,".split(",",5);
		System.out.println(Arrays.toString(arr));
		arr="1,2,3,4,5,6".split(",",5);
		System.out.println(Arrays.toString(arr));
		System.out.println(Integer.MAX_VALUE);
		System.out.println("   1 2 3 ".trim());
		System.out.println("****************************************************************************************************".length());
	}

}
