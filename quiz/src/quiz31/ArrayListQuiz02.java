package quiz31;

import java.util.List;
import java.util.ArrayList;

public class ArrayListQuiz02 {

	public static void main(String[] args) {
		/*
		 * 1. User 클래스는 은닉된 변수로 name, age를 선언.
		 *    User 클래스의 생성자도 선언.
		 * 
		 * 2. User 클래스를 저장할 수 있는 ArrayList 선언.
		 * 3. User 객체를 2개 생성해서 리스트에 추가하세요.
		 * 
		 * 4. list에 저장된 모든 이름, 나이를 for문으로 출력, 향상된 for문으로 출력
		 * 5. list에 "홍길자"가 있다면 홍길자의 이름, 나이만 출력
		 * 
		 * 6. list에 "홍길동"이 있다면 객체를 삭제.
		 */
		List<User> list=new ArrayList<>();
		User u1=new User("홍길자",20);
		User u2=new User("홍길순",30);
		User u3=new User("이순신",40);
		list.add(u1);
		list.add(u2);
		list.add(u3);
		System.out.println("----------------------------------------");
		for(int i=0;i<list.size();i++) {
			System.out.println("===================");
			System.out.println("이름 : "+list.get(i).getName());
			System.out.println("나이 : "+list.get(i).getAge());
			System.out.println("===================");
		}
		System.out.println("----------------------------------------");
		for(User u:list) {
			System.out.println("===================");
			System.out.println("이름 : "+u.getName());
			System.out.println("나이 : "+u.getAge());
			System.out.println("===================");
		}
		System.out.println("----------------------------------------");
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals("홍길자")) {
				System.out.println("===================");
				System.out.println("이름 : "+list.get(i).getName());
				System.out.println("나이 : "+list.get(i).getAge());
				System.out.println("===================");
			}
		}
		System.out.println("----------------------------------------");
		for(User u:list) {
			if(u.getName().equals("홍길자")) {
				System.out.println("===================");
				System.out.println("이름 : "+u.getName());
				System.out.println("나이 : "+u.getAge());
				System.out.println("===================");
			}
		}
		System.out.println("----------------------------------------");
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals("홍길동")) {
				list.remove(i);
			}
		}
		System.out.println("----------------------------------------");
	}

}
