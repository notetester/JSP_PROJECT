package quiz5;

public class Account {
	String name="";
	String password="";
	int balance=0;
	Account() {
		name="";
		password="";
		balance=0;
	}
	Account(String name,String password,int balance) {
		this.name=name;
		this.password=password;
		this.balance=balance;
	}
	void deposit(int mon) {
		balance+=mon;
	}
	void withDraw(int mon) {
		balance-=mon;
	}
	int getBalance() {
		return balance;
	}
}
