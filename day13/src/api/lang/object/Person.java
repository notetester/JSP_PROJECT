package api.lang.object;
public class Person {
	private String name;
	public Person(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	@Override
	public String toString() {
		return "이름 : "+this.name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			return this.name.equals(((Person)obj).getName());
		}else {
			return super.equals(obj);
		}
	}
	public boolean equals(Person person) {
		return this.name.equals(person.name);
	}
	@Override
	protected void finalize() throws Throwable {
		//생성된 객체가 사라지는 시점에서 자동 실행
		System.out.println(this.name+"님이 소멸되었습니다.");
	}
}