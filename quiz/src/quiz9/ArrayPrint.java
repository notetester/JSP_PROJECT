package quiz9;

//import java.util.Arrays;

public class ArrayPrint {
	String printArray(String[]s) {
//		String result="";
//		for(int j=0;j<s.length;j++) {
//			result+=s[j]+" ";
//		}
//		System.out.println(result);
//		return result;
//		return Arrays.toString(s);
		String result="[";
		for(int j=0;j<s.length;j++) {
			result+=j==s.length-1?s[j]:s[j]+", ";
		}
		result+="]";
		return result;
	}
	String printArray(int[]s) {
//		String result="";
//		for(int j=0;j<s.length;j++) {
//			result+=s[j]+" ";
//		}
//		System.out.println(result);
//		return result;
//		return Arrays.toString(s);
		String result="[";
		for(int j=0;j<s.length;j++) {
			result+=j==s.length-1?s[j]:s[j]+", ";
		}
		result+="]";
		return result;
	}
	String printArray(char[]s) {
//		String result="";
//		for(int j=0;j<s.length;j++) {
//			result+=s[j]+" ";
//		}
//		System.out.println(result);
//		return result;
//		return Arrays.toString(s);
		String result="[";
		for(int j=0;j<s.length;j++) {
			result+=j==s.length-1?s[j]:s[j]+", ";
		}
		result+="]";
		return result;
	}
}
