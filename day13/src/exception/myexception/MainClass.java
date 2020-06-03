package exception.myexception;
public class MainClass {
	public static void main(String[] args) {
		Account account=new Account();
		account.deposit(10000);
		System.out.println("잔액 : "+account.getBalance());
		try {
			account.withDraw(5000);
		} catch (MyException e) {
			e.printStackTrace();
		}
		System.out.println("잔액 : "+account.getBalance());
		try {
			account.withDraw(6000);
		} catch (MyException e) {
			e.printStackTrace();
		}
		System.out.println("잔액 : "+account.getBalance());
	}
}