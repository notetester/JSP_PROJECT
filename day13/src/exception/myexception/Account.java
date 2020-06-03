package exception.myexception;
public class Account {
	/*
	 * 1. 잔액(balance:long)으로 맴버변수를 선언 private 제한자
	 * 2. deposit 입금기능
	 *    withDraw 출금기능
	 *    getBalance:long 잔액확인기능
	 * 3. 출금 기능에서 잔액이 출금 금액보다 작다면 예외를 발생시키는 코드를 작성해보세요.
	 */
	private long balance=0;
	public void deposit(long money) {
		this.balance+=money;
	}
	public void withDraw(long money) throws MyException {
		if(this.balance<money) {
			throw new MyException("잔액이 부족합니다.");
		}
		this.balance-=money;
	}
	public long getBalance() {
		return this.balance;
	}
}