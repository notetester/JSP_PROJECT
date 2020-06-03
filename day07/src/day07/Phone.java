package day07;

public class Phone {
	String model;
	int price;
	String color;
	//생성자 : 생성자는 클래스 이름과 대/소문자 까지 동일
	//변환 유형은 없습니다.
	Phone() {
		System.out.println("생성자 호출");
		model="퓨리텔";
		price=200000;
		color="검정";
	}
	//생성자는 중복해서 여러 개 선언할 수 있습니다.
	//단, 매개 변수의 종류, 갯수가 달라야 합니다.
	Phone(String pColor) {
		model="애니콜";
		price=300000;
		color=pColor;
	}
	Phone(int pPrice) {
		model="가로본능";
		price=pPrice;
		color="검정";
	}
	Phone(String pColor,int pPrice) {
		model="가로본능";
		price=pPrice;
		color=pColor;
	}
	Phone(int pPrice,String pColor) {
		model="가로본능";
		price=pPrice;
		color=pColor;
	}
	Phone(String pColor,String pModel) {
		model=pModel;
		price=500000;
		color=pColor;
	}
	//모든 맴버변수를 초기화하는 생성자
	Phone(String model,int price,String color) {
		this.model=model;
		this.price=price;
		this.color=color;
	}
	Phone(String model,String color,int price) {
		this.model=model;
		this.price=price;
		this.color=color;
	}
	Phone(int price,String model,String color) {
		this.model=model;
		this.price=price;
		this.color=color;
	}
	void info() {
		System.out.println("---휴대폰 정보---");
		System.out.println("모델:"+model);
		System.out.println("가격:"+price);
		System.out.println("색상:"+color);
	}
}
