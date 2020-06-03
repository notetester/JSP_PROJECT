package ramda.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.util.function.Consumer;
import java.util.stream.Stream;

public class MainClass01 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("홍길자");
		list.add("홍길동");
		list.add("이순신");
		list.add("박찬호");
		list.add("김유신");
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("--------------------------------------");
		Stream<String> stream=list.stream();
//		stream.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//		});
//		System.out.println("--------------------------------------");
//		stream.forEach((t)->{
//			System.out.println(t);
//		});
		//forEach메서드는 매개변수로 람다식의 표현을 쓸 수 있습니다.
		//한줄이면 {}하고 ;생략 가능
		stream.forEach((t)->System.out.println(t));
	}

}
