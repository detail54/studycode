package testa;

class People {		//�θ�Ŭ����

	int age;
	String name;

	void show() {
		System.out.println(age + " " + name);
	}
}

class student extends People {		//�ڽ� Ŭ����. ����Ҷ� extends �ʼ�
	
	String major;
	
	void pr() {
		show();		//�θ� �ִ� �Լ� ����� ��.
		System.out.println(major);
	}
}

public class ic {
	public static void main(String[] args) {

		People p = new People();
		
		p.age = 30;
		p.name = "����";
		p.show();
		
		student st = new student();
		
		st.age = 20;
		st.name = "����";
		st.major="��";
		st.pr();
		
		
	}

}
