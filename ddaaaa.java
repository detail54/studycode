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
		super(name);		//super�� ������ ù �࿡ �������.
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

		Person p = new Person("������");
		p.name();
		Student s = new Student("�¼�", "��ǻ��", "�İ�");
		s.name();
		s.show();

	}

}
