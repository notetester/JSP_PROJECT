package quiz;

import java.util.Arrays;

public class MethodQuiz05 {
	public static void main(String[] args) {
		/*
		 * 1. 크기가 6인 배열에 1~45까지 중복되지 않는 랜덤수를 출력해서
		 * 변환하는 lottoNum() 메서드를 생성하세요.
		 * 
		 * 2. lottoRun() 메서드는 1번에서 생성된 로또 번호를 매개변수로 받아서,
		 * 당첨되기 까지 금액을 구하는 메서드입니다.
		 * 
		 * 랜덤한 로또 번호를 무한히 생성해서, 매개변수로 전달 받은 번호와 비교해서
		 * 당첨되기 까지 실행된 금액을 반환하세요.
		 * 
		 * 당첨의 조건(순서는 상관없이 같은 번호만 배열에 담겨있다면 됩니다)
		 */
		int[]arr=LottoNum();
		long money=LottoRun(arr);
		System.out.println("당첨되기까지 사용한 금액 : "+money);
	}
	static int[]LottoNum(){
		int[]arr=new int[6];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*45+1);
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
		}
		return arr;
	}
	static long LottoRun(int[]arr) {
		Arrays.sort(arr);
		int count=0;
		long result=0;
		int[]select=new int[6];
		while(true) {
			result++;
			select=LottoNum();
			Arrays.sort(select);
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==select[i]) {
					count++;
				}
			}
			if(count==arr.length) {
				break;
			}
			count=0;
		}
		return result*1000;
	}
}
