package quiz;

import java.util.Scanner;

public class StudentManager {
	//프로그램 전체에서 사용할 변수를 클래스 바로 아래에 선언.
	static Scanner scan=new Scanner(System.in);
	static String[]nameList=new String[100];
	static String[]genderList=new String[100];
	static String[]emailList=new String[100];
	static int[]birthList=new int[100];
	//현재 고객수가 몇명이 저장 되었는지 알기 위한 변수 count 선언
	static int count=0;
	//index를 조정할 변수 선언
	static int index=-1;
	public static void main(String[] args) {
		end:while(true) {
			System.out.println("[Info]-고객수:"+count+", 현재위치:"+index);
			System.out.println("[메뉴]1.Insert, 2.Prev, 3.Next, 4.Current, 5.Update, 6.Delete, 7.Quit");
			System.out.print("메뉴입력>");
			int menu=scan.nextInt();
			switch (menu) {
			case 1:
				System.out.println("==========고객정보 입력을 시작합니다.==========");
				/*
				 * 이름, 성별, 이메일, 출생년도를 입력받아서 각각 배열에 저장
				 * 사람 수를 증가 시킨다.
				 */
//				System.out.print("이름 : ");
//				nameList[count]=scan.next();
//				System.out.print("성별 : ");
//				genderList[count]=scan.next();
//				System.out.print("이메일 : ");
//				emailList[count]=scan.next();
//				System.out.print("출생년도 : ");
//				birthList[count]=scan.nextInt();
//				System.out.println("입력이 완료되었습니다.");
//				count++;
				insertData();
				System.out.println("========================================");
				break;
			case 2:
				System.out.println("==========이전 고객정보를 출력합니다.==========");
				/*
				 * index가 0이하라면 "이전 고객정보가 없습니다."
				 * 그렇지 않으면 index를 이동해서 이전 고객 정보를 출력하면 됩니다.
				 */
//				if(index<=0) {
//					index=0;
//					System.out.println("이전 고객정보가 없습니다.");
//				}else if(index>count){
//					index=count-1;
//					System.out.println("이전 고객정보가 없습니다.");
//				}else {
//					index--;
//					System.out.println("이름 : "+nameList[index]);
//					System.out.println("성별 : "+genderList[index]);
//					System.out.println("이메일 : "+emailList[index]);
//					System.out.println("출생년도 : "+birthList[index]);
//				}
				if(index<=0) {
					index=0;
					System.out.println("이전 고객정보가 없습니다.");
				}else if(index>count){
					index=count-1;
					System.out.println("이전 고객정보가 없습니다.");
				}else {
					index--;
					printData();
				}
				System.out.println("========================================");
				break;
			case 3:
				System.out.println("==========다음 고객정보를 출력합니다.==========");
				/*
				 * 다음 고객정보를 출력할 수 없는 조건을 생각해서 "다음 고객정보가 없습니다."
				 * 그렇지 않으면 index를 이동해서 다음 고객 정보를 출력하면 됩니다.
				 */
//				if(index>=count-1) {
//					index=count-1;
//					System.out.println("다음 고객정보가 없습니다.");
//				}else if(index<-1) {
//					index=0;
//					System.out.println("다음 고객정보가 없습니다.");
//				}else{
//					index++;
//					System.out.println("이름 : "+nameList[index]);
//					System.out.println("성별 : "+genderList[index]);
//					System.out.println("이메일 : "+emailList[index]);
//					System.out.println("출생년도 : "+birthList[index]);
//				}
				if(index>=count-1) {
					index=count-1;
					System.out.println("다음 고객정보가 없습니다.");
				}else if(index<-1) {
					index=0;
					System.out.println("다음 고객정보가 없습니다.");
				}else{
					index++;
					printData();
				}
				System.out.println("========================================");
				break;
			case 4:
				System.out.println("==========현재 고객정보를 출력합니다.==========");
				/*
				 * 현재 정보를 출력할 수 있는 조건을 생각해서 현재 정보를 출력하면 됩니다.
				 * 그렇지 않으면 "현재 고객 정보가 없습니다."를 출력하면 됩니다.
				 */
//				if(index>count-1) {
//					index=count-1;
//					System.out.println("현재 고객정보가 없습니다.");
//				}else if(index<0) {
//					index=0;
//					System.out.println("현재 고객정보가 없습니다.");
//				}else{
//					System.out.println("이름 : "+nameList[index]);
//					System.out.println("성별 : "+genderList[index]);
//					System.out.println("이메일 : "+emailList[index]);
//					System.out.println("출생년도 : "+birthList[index]);
//				}
				if(index>count-1) {
					index=count-1;
					System.out.println("현재 고객정보가 없습니다.");
				}else if(index<0) {
					index=0;
					System.out.println("현재 고객정보가 없습니다.");
				}else{
					printData();
				}
				System.out.println("========================================");
				break;
			case 5:
				System.out.println("==========현재 고객정보를 수정합니다.==========");
				/*
				 * 현재 정보를 출력할 수 있는 조건을 생각해서
				 * 스캐너를 통해서 순서대로 이름, 성별, 이메일, 출생년도를 입력 받아서 배열의 값을 수정하세요.
				 * 
				 * 그렇지 않으면 "수정할 데이터가 없습니다."를 출력하면 됩니다.
				 */
//				if(index>count-1) {
//					index=count-1;
//					System.out.println("수정할 데이터가 없습니다.");
//				}else if(index<0){
//					index=0;
//					System.out.println("수정할 데이터가 없습니다.");
//				}else{
//					System.out.print("이름 : ");
//					nameList[index]=scan.next();
//					System.out.print("성별 : ");
//					genderList[index]=scan.next();
//					System.out.print("이메일 : ");
//					emailList[index]=scan.next();
//					System.out.print("출생년도 : ");
//					birthList[index]=scan.nextInt();
//					System.out.println("수정이 완료되었습니다.");
//				}
				updateData();
				System.out.println("========================================");
				break;
			case 6:
				/*
				 * 현재 정보를 삭제할 수 있는 조건을 생각해서
				 * 현재 index부터 ~~뒤에 있는 배열 요소를 당겨와서 덮어 씌웁니다.
				 * 고객수를 감소시킵니다.
				 * 
				 * 그렇지 않으면 "삭제할 데이터가 존재하지 않습니다."를 출력하면 됩니다.
				 */
//				if(index>count-1) {
//					index=count-1;
//					System.out.println("삭제할 데이터가 없습니다.");
//				}else if(index<0){
//					index=0;
//					System.out.println("삭제할 데이터가 없습니다.");
//				}else {
//					for(int i=index;i<count;i++) {
//						nameList[i]=nameList[i+1];
//						genderList[i]=genderList[i+1];
//						emailList[i]=emailList[i+1];
//						birthList[i]=birthList[i+1];
//					}
//					count--;
//					System.out.println("삭제가 완료되었습니다.");
//				}
				deleteData();
				System.out.println("========================================");
				break;
			case 7:
				System.out.println("프로그램을 종료합니다.");
				/*
				 * 무한 루프를 완전히 탈출
				 */
				break end;
			default:
				System.out.println("메뉴를 잘 못 입력했습니다.");
				System.out.println("========================================");
				break;
			}
		}
		scan.close();
	}
	//고객정보를 입력받는 메서드
	static void insertData() {
		System.out.print("이름 : ");
		nameList[count]=scan.next();
		System.out.print("성별 : ");
		genderList[count]=scan.next();
		System.out.print("이메일 : ");
		emailList[count]=scan.next();
		System.out.print("출생년도 : ");
		birthList[count]=scan.nextInt();
		System.out.println("입력이 완료되었습니다.");
		count++;
	}
	//고객정보를 출력해주는 메서드
	static void printData() {
		System.out.println("이름 : "+nameList[index]);
		System.out.println("성별 : "+genderList[index]);
		System.out.println("이메일 : "+emailList[index]);
		System.out.println("출생년도 : "+birthList[index]);
	}
	//고객정보를 수정해주는 메서드
	static void updateData() {
		if(index>count-1) {
			index=count-1;
			System.out.println("수정할 데이터가 없습니다.");
		}else if(index<0){
			index=0;
			System.out.println("수정할 데이터가 없습니다.");
		}else{
			System.out.print("이름 : ");
			nameList[index]=scan.next();
			System.out.print("성별 : ");
			genderList[index]=scan.next();
			System.out.print("이메일 : ");
			emailList[index]=scan.next();
			System.out.print("출생년도 : ");
			birthList[index]=scan.nextInt();
			System.out.println("수정이 완료되었습니다.");
		}
	}
	//고객정보를 삭제해주는 메서드
	static void deleteData() {
		if(index>count-1) {
			index=count-1;
			System.out.println("삭제할 데이터가 없습니다.");
		}else if(index<0){
			index=0;
			System.out.println("삭제할 데이터가 없습니다.");
		}else {
			for(int i=index;i<count;i++) {
				nameList[i]=nameList[i+1];
				genderList[i]=genderList[i+1];
				emailList[i]=emailList[i+1];
				birthList[i]=birthList[i+1];
			}
			count--;
			System.out.println("삭제가 완료되었습니다.");
		}
	}
}
