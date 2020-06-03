package collection.list;

import java.util.LinkedList;

public class LinkedListEx02 {

	public static void main(String[] args) {
		//링크리스트 객체생성
		LinkedList<String> list=new LinkedList<>();
		//추가
		list.add("홍길동");
		list.add("홍길자");
		list.add("홍길동");
		//확인
		System.out.println(list.toString());
		//처음에 추가
		list.addFirst("이순신");
		//마지막에 추가
		list.addLast("신사임당");
		//확인
		System.out.println(list.toString());
		//임의 위치 추가
		list.add(3,"으악새");
		list.add("홍길동자");
		System.out.println(list.toString());
		//값 얻기
		String name=list.get(0);
		System.out.println("0번째 인덱스의 값 : "+name);
		//삭제
		list.remove(0);
		System.out.println(list.toString());
	}

}
