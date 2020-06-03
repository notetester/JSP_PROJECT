package test;

public class House {
	private Person[] persons;
	private int count;
	public House() {
		this.persons=new Person[10];
	}
	public void getIn(Person person) {
		this.persons[count] = person;
		count++;
	}
	public void print() {
		for(int i=0;i<count;i++) {
			System.out.println("이름 : "+this.persons[i].getName());
			System.out.println("나이 : "+this.persons[i].getAge());
		}
	}
	public Person[] getPersons() {
		return persons;
	}
}
