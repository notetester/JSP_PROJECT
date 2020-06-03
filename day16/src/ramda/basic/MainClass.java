package ramda.basic;

public class MainClass {

	public static void main(String[] args) {
		Person p=new Person();
		p.greeting(new Say01() {
			@Override
			public void talking() {
				System.out.println("안녕하세요~");
			}
		});
		p.greeting(new Say02() {
			
			@Override
			public String talking() {
				System.out.println("Hello");
				return "Hello";
			}
		});
		p.greeting(new Say03() {
			
			@Override
			public String talking(String greet) {
				System.out.println(greet);
				return greet;
			}
		});
		System.out.println("=============================================");
		//익명객체 Say01이 구현해야할 추상메서드를 람다식으로 표현
		p.greeting(()->{
			System.out.println("안녕하세요~");
		});
		p.greeting(()->{
			System.out.println("Hello");
			return "Hello";
		});
		p.greeting((greet)->{
			System.out.println(greet);
			return greet;
		});
		//greeting 메서드를 실행해서 결과로 HiHiHi를 반환받는 람다 표현식을 사용
		String str=p.greeting((w,i)->{
			String result="";
			for(int a=0;a<i;a++) {
				result+=w;
			}
			return result;
		});
		System.out.println(str);
	}

}
