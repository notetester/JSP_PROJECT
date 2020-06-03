package quiz27;

public class MainClass {

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		try {
			System.out.println(calculator.input());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
