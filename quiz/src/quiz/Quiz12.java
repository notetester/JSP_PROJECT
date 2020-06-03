package quiz;

public class Quiz12 {
	public static void main(String[] args) {
		String[]arr= {"안녕","hello","니하오","#$%"};
		/*
		 * Math.random()을 이용해서 0~3랜덤수를 발생시킵니다.
		 * 해당 랜덤수를 배열의 index에 적용
		 * 선택된 단어가 한국어, 영어, 중국어인지 처리해주세요.
		 */
		switch((int)(Math.random()*4)) {
		case 0:System.out.println(arr[0]+"은 한국어입니다.");break;
		case 1:System.out.println(arr[1]+"은 영어입니다.");break;
		case 2:System.out.println(arr[2]+"은 중국어입니다.");break;
		case 3:System.out.println(arr[3]+"은 특수문자입니다.");break;
		default:System.out.println("오류");break;
		}
	}
}
