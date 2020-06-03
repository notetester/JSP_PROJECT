package quiz18;

public class MyCart {
	//1. 모든 변수와 메서드에 접근제한자를 선언하세요.
	private int money;
	private Product[]cart=new Product[1];//상품을 저장할 배열
	private int i=0;
	//2. MyCart의 생성자는 money만 받아서 조회
	public MyCart(int money){
		this.money=money;
	}
	/*
	 * 3. buy(모든 상품을 받도록 선언)
	 * 가진돈과 전달된 물건의 가격을 비교해서 돈이 적으면 "금액부족" 출력후 종료
	 * 가진돈이 충분하면 물건의 가격을 money에서 빼고 add(상품) 메서드를 호출
	 */
	public void buy(Product product) {
		if(this.money<product.getPrice()) {
			System.out.println("금액부족");
		}else {
			this.money-=product.getPrice();
			this.i++;
			add(product);
		}
	}
	/*
	 * 4. add(모든 상품을 받도록 선언)
	 * 만약 i의 값이 장바구니의 크기보다 같거나 크다면
	 * 기존의 장바구니보다 크기가 *2큰 배열을 생성
	 * 기존의 장바구니 값을 새로운 배열에 복사.
	 * 새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 상품을 장바구니에 담는다.
	 * info()메서드 호출
	 */
	private void add(Product product) {
		if(this.i>=this.cart.length) {
			Product[]newCart=new Product[this.cart.length*2];
			for(int j=0;j<this.cart.length;j++) {
				newCart[j]=this.cart[j];
			}
			this.cart=newCart;
		}
		this.cart[i-1]=product;
		info();
	}
	/*
	 * 5. info()
	 * 장바구니 안에 담긴 물건의 목록(name)을 출력한다.
	 * 장바구니 안에 담긴 물건의 가격을 모두 다해서 출력
	 * 남은 금액 출력
	 * 매인에서 buy 메서드 실행
	 */
	private void info() {
		System.out.println("===============================");
		int sum=0;
		for(int j=0;j<i;j++) {
			System.out.println(this.cart[j].getName());
			sum+=this.cart[j].getPrice();
		}
		System.out.println("총 가격 : "+sum+"원");
		System.out.println("남은 금액 : "+this.money+"원");
		System.out.println("===============================");
	}
}
