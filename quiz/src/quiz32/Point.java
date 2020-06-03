package quiz32;

import java.util.List;
import java.util.Scanner;

public class Point implements InterPoint {
	private static Scanner scan=new Scanner(System.in);

	@Override
	public void showPointUI() {
		System.out.println("===========================================================");
		System.out.printf("%4s%10s%10s%10s %11s%11s%11s %11s\n"
				, "학번", "이름", "국어", "영어", "수학", "총점"
				, "평균", "학점");
		System.out.println("===========================================================");
	}

	@Override
	public void input(List<Student> students) {
		Student student=new Student();
		System.out.print("학번을 입력하세요. >");
		student.setStuId(scan.next());
		for(int i=0;i<students.size();i++) {
			if(student.getStuId().equals(students.get(i).getStuId())) {
				System.out.println("이미 등록된 학번입니다.");
				return;
			}
		}
		System.out.print("이름을 입력하세요. >");
		student.setName(scan.next());
		while(true) {
			try{
				System.out.print("국어 점수를 입력하세요. >");
				student.setKor(scan.nextInt());
				break;
			}catch(Exception e) {
				scan.next();
				System.out.println("잘 못 입력했습니다. 다시 입력해주세요.");
			}
		}
		while(true) {
			try{
				System.out.print("영어 점수를 입력하세요. >");
				student.setEng(scan.nextInt());
				break;
			}catch(Exception e) {
				scan.next();
				System.out.println("잘 못 입력했습니다. 다시 입력해주세요.");
			}
		}
		while(true) {
			try{
				System.out.print("수학 점수를 입력하세요. >");
				student.setMath(scan.nextInt());
				break;
			}catch(Exception e) {
				scan.next();
				System.out.println("잘 못 입력했습니다. 다시 입력해주세요.");
			}
		}
		student.calcTotAvg();
		students.add(student);
		System.out.println(student.getName()+"님의 성적 정보가 정상적으로 입력되었습니다.");
	}

	@Override
	public void showAll(List<Student> students) {
		if(students.size()==0) {System.out.println("입력된 성적이 없습니다.");}
		else {
			showPointUI();
			double totalAvg=0;
			for(int i=0;i<students.size();i++) {
				students.get(i).outputInfo();
				totalAvg+=students.get(i).getAvg();
			}
			totalAvg/=(double)students.size();
			System.out.println("전체 평균 : "+totalAvg);
		}
	}

	@Override
	public void search(List<Student> students) {
		System.out.print("찾는 학생의 학번을 입력하세요. >");
		String search=scan.next();
		for(int i=0;i<students.size();i++) {
			if(search.equals(students.get(i).getStuId())) {
				showPointUI();
				students.get(i).outputInfo();
				return;
			}
		}
		System.out.println("찾는 학번이 없어 검색하지 못 했습니다.");
	}

	@Override
	public void modify(List<Student> students) {
		System.out.print("수정할 학생의 학번을 입력하세요. >");
		String search=scan.next();
		for(int i=0;i<students.size();i++) {
			if(search.equals(students.get(i).getStuId())) {
				while(true) {
					try{
						System.out.print("국어 점수를 입력하세요. >");
						students.get(i).setKor(scan.nextInt());
						break;
					}catch(Exception e) {
						scan.next();
						System.out.println("잘 못 입력했습니다. 다시 입력해주세요.");
					}
				}
				while(true) {
					try{
						System.out.print("영어 점수를 입력하세요. >");
						students.get(i).setEng(scan.nextInt());
						break;
					}catch(Exception e) {
						scan.next();
						System.out.println("잘 못 입력했습니다. 다시 입력해주세요.");
					}
				}
				while(true) {
					try{
						System.out.print("수학 점수를 입력하세요. >");
						students.get(i).setMath(scan.nextInt());
						break;
					}catch(Exception e) {
						scan.next();
						System.out.println("잘 못 입력했습니다. 다시 입력해주세요.");
					}
				}
				students.get(i).calcTotAvg();
				System.out.println(students.get(i).getName()+"님의 성적 정보가 정상적으로 수정되었습니다.");
				return;
			}
		}
		System.out.println("찾는 학번이 없어 검색하지 못 했습니다.");
	}

	@Override
	public void delete(List<Student> students) {
		System.out.print("삭제할 학생의 학번을 입력하세요. >");
		String search=scan.next();
		for(int i=0;i<students.size();i++) {
			if(search.equals(students.get(i).getStuId())) {
				String name=students.get(i).getName();
				students.remove(i);
				System.out.println(name+"님의 성적 정보가 정상적으로 삭제되었습니다.");
				return;
			}
		}
		System.out.println("찾는 학번이 없어 검색하지 못 했습니다.");
	}

}
