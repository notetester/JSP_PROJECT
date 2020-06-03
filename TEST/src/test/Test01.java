package test;


public class Test01 {
	public static void main(String[] args) {
		//1. 100개의 크기를 갖는 int 배열에 2의 배수를 순서대로 저장
		int twobe[]= new int[100];
		for(int a=0;a<100;a++) {
			twobe[a]=(a+1)*2;
		}
		for(int b=0;b<100;b++) {
			System.out.println(twobe[b]);
		}
	}
}
