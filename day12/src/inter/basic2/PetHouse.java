package inter.basic2;

public class PetHouse {
	/*
	 * 1. carePet() 메서드 선언
	 * 매개변수는 모든 팻타입을 받을 수 있도록 선언
	 * 기능-instanceof를 사용해서 캐스팅을 해보고, "멍멍이를 돌봅니다"출력을 처리
	 */
	public void carePet(IPet iPet) {
		if(iPet instanceof Cat) {
			System.out.println("냐옹이를 돌봅니다.");
		}else if(iPet instanceof Dog) {
			System.out.println("멍멍이를 돌봅니다.");
		}else if(iPet instanceof GoldFish) {
			System.out.println("금붕어를 돌봅니다.");
		}
	}
	/*
	 * 2. petInfo() 메서드 선언
	 * 매개변수는 IPet배열을 받을 수 있도록 선언
	 * 기능-IPet배열을 회전해서 play()를 실행
	 */
	public void petInfo(IPet[]iPet) {
		for(IPet i:iPet) {
			i.play();
		}
	}
}
