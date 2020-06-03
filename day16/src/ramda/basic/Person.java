package ramda.basic;

public class Person {
	public void greeting(Say01 say) {
		System.out.println("1번");
		say.talking();
	}
	public void greeting(Say02 say) {
		System.out.println("2번");
		say.talking();
	}
	public void greeting(Say03 say) {
		System.out.println("3번");
		say.talking("니하오");
	}
//	public void greeting(Say00 say) {
//		System.out.println("0번");
//		say.talking2();
//	}
	public String greeting(Say04 say) {
		String result=say.talking("Hi",3);
		return result;
	}
}
