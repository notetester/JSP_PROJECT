package quiz22;

public class Child {
//	private static final int RICE=1500;
//	private static final int BULGOGI=3000;
//	private static final int YOGURT=400;
//	private static final int ICECREAM=600;
//	private static final int MILK=300;
	private int price=0;
//	public static void main(String[] args) {
//		Child a=new Child(true,false,false);
//		Child b=new Child(false,false,false);
//		Child c=new Child(false,true,true);
//		a.calculating();
//		b.calculating();
//		c.calculating();
//	}
	public Child(boolean YOGURT,boolean ICECREAM,boolean MILK) {
		this.price+=Price.RICE;
		this.price+=Price.BULGOGI;
		if(YOGURT) {this.price+=Price.YOGURT;}
		if(ICECREAM) {this.price+=Price.ICECREAM;}
		if(MILK) {this.price+=Price.MILK;}
	}
	public void calculating(){
		System.out.println(this.price);
	}
}
