package day02;

public class CastingEx02 {
	public static void main(String[] args) {
		/*
		 * 크기가 큰 타입을 작은 타입에 변환 할 때는 (type) 캐스팅을 이용해서
		 * 명시적 형변환을 해야합니다.
		 */
		int i=70;
		char c=(char)i;
		short s=(short)i;
		
		float f=3.14F;
		int j=(int)f;
		int k=(int)f;
		//System.out.println(j);
		
		/*
		 * 강제 타입 변환시 주의할 점은 해당 값을 받을 수 없는 범위가 들어오면
		 * 잘려나간 값(쓰레기 값)을 저장합니다.
		 */
		int a=1000;
		byte b=(byte)a;
		System.out.println(b);
		
		/*
		 * char형을 short형으로 바꿀 때도 명시적 형변환이 필요합니다.
		 */
		char cc='A';
		short ss=(short)cc;
		System.out.println(c+s+j+k+ss);
	}
}
