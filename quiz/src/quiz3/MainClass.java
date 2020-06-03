package quiz3;

public class MainClass {
	public static void main(String[] args) {
		//현실에서 찾아볼 수 있는 물건, 생각해서 클래스로 표현 2개 이상
		//멤버변수 2개 이상, 메서드 2개 이상
		//생성해서 사용.
		Coffee co=new Coffee();
		co.oder("아이스", 2);
		co.print();
		Com com=new Com();
		com.sangte();
		com.power();
		com.sangte();
		com.gojang();
		com.sangte();
		com.gochim();
		com.sangte();
	}
}
