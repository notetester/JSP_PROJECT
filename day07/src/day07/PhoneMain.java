package day07;

public class PhoneMain {
	public static void main(String[] args) {
		Phone basic=new Phone();
		basic.info();
		Phone black=new Phone("검정");
		black.info();
		Phone white=new Phone("하얀",400000);
		white.info();
		Phone iPhone=new Phone("그레이","아이폰PRO");
		iPhone.info();
		//모든 맴버변수를 받는 생성자를 생성
		//그린,1000000,샤오미 전달해서 객체를 생성
		Phone green=new Phone("샤오미",1000000,"그린");
		green.info();
	}
}
