package testa;

class People {		//부모클래스

	int age;
	String name;

	void show() {
		System.out.println(age + " " + name);
	}
}

class student extends People {		//자식 클래스. 상속할때 extends 필수
	
	String major;
	
	void pr() {
		show();		//부모에 있는 함수 끌어다 씀.
		System.out.println(major);
	}
}

public class ic {
	public static void main(String[] args) {

		People p = new People();
		
		p.age = 30;
		p.name = "나나";
		p.show();
		
		student st = new student();
		
		st.age = 20;
		st.name = "나나";
		st.major="집";
		st.pr();
		
		
	}

}
