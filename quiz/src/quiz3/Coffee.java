package quiz3;

public class Coffee {
	String ondo="핫";
	int ge=1;
	void oder(String a,int b) {
		ondo=a;
		ge=b;
	}
	void print() {
		System.out.println("온도 : "+ondo);
		System.out.println("갯수 : "+ge+"개");
	}
}
