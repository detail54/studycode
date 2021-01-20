package testa;

class AAA{
	void ride() {
		System.out.println("오버라이딩AAA");
	}
	void load() {
		System.out.println("오버로딩AAA");
	}
}

class BBB extends AAA{
	void ride() {			//메소드 명을 동일하게 하고, 내용을 재정의. 오버라이딩은 상속개념이 나온다.
		System.out.println("오버라이딩BBB");
	}
	void load(int a) {		//오버로딩. 파라미터 변경. 
		System.out.println("오버로딩BBB");
	}
}

public class Overridinggg {

	public static void main(String[] args) {

		AAA a = new AAA();
		a.ride();
		a.load();
		
		BBB b= new BBB();
		b.ride();
		b.load();

	}

}
