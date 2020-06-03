package modi.protec.pac1;

public class B {
	public B() {
		//같은 패키지라면 사용 가능
		A a=new A();
		a.bool=true;
		a.method();
	}
}
