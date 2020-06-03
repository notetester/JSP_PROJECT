package quiz11;

public class MyCart extends Cart{
	//1. MyCart의 생성자에서는 int 매개변수를 하나 받으며, 금액을 초기화합니다. tv=300원, com=400원, radio=500원으로 초기화
	MyCart(){
		money=0;
		i=0;
		tv=300;
		com=400;
		radio=500;
	}
	MyCart(int money){
		this.money=money;
		i=0;
		tv=300;
		com=400;
		radio=500;
	}
	//2. buy(), add(), info() 메서드를 오버라이딩 합니다.
	/*
	 * buy()의 기능
	 * 1. money가 300보다 작으면 "금액부족" 출력후 메서드를 종료.
	 *    매개변수가 tv, com, radio가 아니더라도 "상품 없음" 출력 후 종료
	 * 2. 매개변수가 tv라면 금액에서 tv가격을 빼고 add(상품)을 호출
	 *    매개변수가 com라면 금액에서 com가격을 빼고 add(상품)을 호출
	 *    매개변수가 radio라면 금액에서 radio가격을 빼고 add(상품)을 호출
	 */
	void buy(String product) {
		if(product.equals("tv")) {
			if(money<tv) {
				System.out.println("금액부족");
				return;
			}
			money-=tv;
			i++;
			add(product);
		}else if(product.equals("com")) {
			if(money<com) {
				System.out.println("금액부족");
				return;
			}
			money-=com;
			i++;
			add(product);
		}else if(product.equals("radio")) {
			if(money<radio) {
				System.out.println("금액부족");
				return;
			}
			money-=radio;
			i++;
			add(product);
		}else {
			System.out.println("상품 없음");
		}
	}
	/*
	 * add()의 기능
	 * 1. 만약 i의 값이 장바구니의 크기보다 같거나 크다면
	 *    -기존의 장바구니보다 크기가 *2큰 배열을 생성.
	 *    -기존의 강바구니 값을 새로운 배열에 복사.
	 *    -새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 2. product를 장바구니에 담는다.
	 * 3. info() 메서드를 호출
	 */
	void add(String product) {
		if(i>=cart.length) {
			String[]newCart=new String[cart.length*2];
			for(int j=0;j<cart.length;j++) {
				newCart[j]=cart[j];
			}
			cart=newCart;
		}
		cart[i-1]=product;
		info();
	}
	/*
	 * info()의 기능
	 * 1. 물건을 사고 남은 금액을 구하고
	 * 2. 장바구니에 담긴 물건 목록을 반환 + 금액을 더해서 출력
	 * 3. 메인에서 buy()를 실행 시킨다.
	 */
	void info() {
		System.out.println("======장바구니에 담긴 물건 목록======");
		for(int j=0;j<i;j++) {
			System.out.println(cart[j]);
		}
		System.out.println("남은 금액 : "+money);
		System.out.println("==============================");
	}
}
