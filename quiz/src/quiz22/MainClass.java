package quiz22;

public class MainClass {

	public static void main(String[] args) {
		Child a=new Child(true,false,false);
		Child b=new Child(false,false,false);
		Child c=new Child(false,true,true);
		a.calculating();
		b.calculating();
		c.calculating();
	}

}
