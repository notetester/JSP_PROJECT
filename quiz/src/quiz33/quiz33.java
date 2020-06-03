package quiz33;
import java.util.HashSet;

public class quiz33 {

	public static void main(String[] args) {
		/*
		 * 1. Random 객체를 이용해서 1~45까지 랜덤수를 생성
		 * 2. Set을 이용해서 6개의 로또 번호를 만들어내는 코드를 작성.
		 */
		HashSet<Integer> set=new HashSet<>();
		while(set.size()!=6) {
			set.add((int)(Math.random()*45+1));
		}
		System.out.println(set.toString());
	}

}
