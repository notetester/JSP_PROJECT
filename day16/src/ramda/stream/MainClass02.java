package ramda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MainClass02 {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		for(int i=0;i<100;i++) {
			list.add(new Random().nextInt(100)+1);
		}
		System.out.println(list.toString());
		System.out.println("----------------------------------------------------------------------");
		//중복제거 distinct()
		list.stream().distinct().forEach((num)->System.out.print(num+" "));
		System.out.println("\n----------------------------------------------------------------------");
		//걸러내는 기능 filter()
		list.stream().filter((num)->num%2==0).forEach((num)->System.out.print(num+" "));
		System.out.println("\n----------------------------------------------------------------------");
		//정렬 sorted()
		list.stream().sorted().forEach((num)->System.out.print(num+" "));
		System.out.println("\n----------------------------------------------------------------------");
		//map()은 메서드의 안에 정의된 새로운 stream으로 변환
		list.stream().map((num)->num%2==0?"짝수":"홀수").forEach((num)->System.out.print(num+" "));
		System.out.println("\n----------------------------------------------------------------------");
		List<Integer>result=list.stream().filter((num)->num%3==0).collect(Collectors.toList());
		System.out.println(result.toString());
		System.out.println("----------------------------------------------------------------------");
		//list의 중복을 제거하고, 짝수만 찾아낸다음, 정렬하고,
		//짝홀수로 변경한 결과를 List로 반환받고 forEach구문으로 처리
		list.stream().distinct().filter((num)->num%2==0).sorted().map((num)->num%2==0?"짝수":"홀수").collect(Collectors.toList()).forEach((num)->System.out.print(num+" "));
	}

}
