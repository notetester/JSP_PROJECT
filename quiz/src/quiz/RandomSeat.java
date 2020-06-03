package quiz;

import java.util.Scanner;

public class RandomSeat {
	public static void main(String[] args) {
		/*
		 * 1. 사람 수를 입력 받을 수 있습니다.
		 * 2. 입력받은 사람 수 만큼 랜덤값을 생성해서 배열에 중복되지 않게 랜덤으로 저장합니다.
		 * 
		 * 3. 해당 배열의 크기만큼 ○으로 출력해주세요. ㅁ한자9
		 * 4. 스캐너를 통해서 랜덤으로 배정된 좌석을 선택할 수 있습니다.
		 * 5. 제대로 선택된 좌석이라면 자리번호를 공개하고, 제대로 선택되지 않은 좌석이면 "경고문을 띄어주세요"
		 * 
		 * 선택된 자리는 ●로 다시 표시해 주세요.
		 */
		Scanner sc=new Scanner(System.in);
		System.out.print("사람 수를 입력하세요.>");
		int a=0;
		int [] arr;
		boolean [] sel;
		while(true){
			if(sc.hasNextInt()) {
				a=sc.nextInt();
				if(a>0) {
					arr=new int[a];
					sel=new boolean[a];
					break;
				}else {
					System.out.print("양의 정수를 입력하세요.>");
				}
			}else {
				System.out.print("숫자를 입력하세요.>");
				sc.next();
			}
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			sel[i]=true;
		}
		for(int i=0;i<arr.length;i++) {
			int j=(int)(Math.random()*arr.length);
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		end:while(true) {
			for(int i=1;i<=arr.length;i++) {
				if(i<=9) {
					System.out.print(i+"  ");
				}else {
					System.out.print(i+" ");
				}
			}
			System.out.println();
			for(int i=0,j=0;i<arr.length;i++) {
				if(sel[i]) {
					System.out.print("○  ");
				}else {
					System.out.print("●  ");
					j++;
				}
				if(j==arr.length) {
					System.out.println();
					System.out.println("모든 좌석이 선택되었습니다. 프로그램을 종료합니다.");
					System.out.println("===================================");
					break end;
				}
			}
			System.out.println();
			System.out.print("좌석을 선택해주세요.>");
			while(true){
				if(sc.hasNextInt()) {
					a=sc.nextInt();
					if(a>0&&a<=arr.length) {
						break;
					}else {
						System.out.print("범위내의 정수를 입력하세요.>");
					}
				}else {
					System.out.print("숫자를 입력하세요.>");
					sc.next();
				}
			}
			if(sel[a-1]) {
				System.out.println(a+"의 좌석은 "+arr[a-1]+"번 좌석입니다.");
				sel[a-1]=false;				
			}else {
				System.out.println("이미 선택된 좌석입니다.");
			}
			System.out.println("===================================");
		}
		sc.close();
	}
}
