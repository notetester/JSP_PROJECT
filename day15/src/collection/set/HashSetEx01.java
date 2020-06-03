package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {

	public static void main(String[] args) {
		//HashSet 객체 생성
		//HashSet<String> set=new HashSet<>();
		Set<String> set=new HashSet<>();
		//set에 추가 add()
		set.add("JAVA");
		set.add("JSP");
		set.add("SPRING");
		set.add("ORACLE");
		set.add("JAVA"); //중복 x
		//set에 저장된 크기 size()
		System.out.println("set의 크기 : "+set.size());
		System.out.println(set.toString());
		//set에 저장된 객체를 검색하려면, 반복자를 통해서 한번씩 확인해봐야 합니다.
		Iterator<String> iter=set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		//contains
		if(set.contains("JAVA")) {
			System.out.println("JAVA가 포함되어 있음");
		}
		//set의 삭제 remove()
		set.remove("JABA");
		System.out.println(set.toString());
	}

}
