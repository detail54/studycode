package testa;

class Person {

	String name;

	Person(String name) {
		this.name = name;
	}
	void name() {
		System.out.println(name);
	}
}

class Student extends Person {

	private String major;
	private String school;
	
	Student(String name, String major, String school) {
		super(name);		//super는 무조건 첫 행에 적어야함.
		this.major = major;
		this.school = school;
	}

	void show() {
		System.out.println(major);
		System.out.println(school);
		name();
	}
}

public class ddaaaa {

	public static void main(String[] args) {

		Person p = new Person("전대현");
		p.name();
		Student s = new Student("태수", "컴퓨터", "컴공");
		s.name();
		s.show();

	}

}
