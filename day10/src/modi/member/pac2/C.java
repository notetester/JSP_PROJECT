package modi.member.pac2;

import modi.member.pac1.A;

public class C {
	public C() {
		A a=new A();
		a.var1=1;
//		a.var2=1; //default (X)
//		a.var3=1; //private (X)
		a.method1();
//		a.method2(); //default (X)
//		a.method3(); //private (X)
	}
}
