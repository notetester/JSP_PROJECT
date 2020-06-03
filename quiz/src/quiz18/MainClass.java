package quiz18;

public class MainClass {
	public static void main(String[] args) {
		MyCart myCart=new MyCart(10000);
		Radio radio=new Radio();
		Tv tv=new Tv();
		Computer computer=new Computer();
		myCart.buy(radio);
		myCart.buy(tv);
		myCart.buy(computer);
		myCart.buy(radio);
		myCart.buy(tv);
		myCart.buy(computer);
		myCart.buy(radio);
		myCart.buy(tv);
		myCart.buy(computer);
		myCart.buy(radio);
		myCart.buy(tv);
		myCart.buy(computer);
		myCart.buy(radio);
		myCart.buy(tv);
		myCart.buy(computer);
		myCart.buy(radio);
		myCart.buy(tv);
		myCart.buy(computer);
		myCart.buy(radio);
		myCart.buy(tv);
		myCart.buy(computer);
	}
}
