package exception.myexception;
public class MyException extends Exception{
	private static final long serialVersionUID = 1L;
	public MyException() {
		
	}
	public MyException(String messege) {
		super(messege);
	}
}