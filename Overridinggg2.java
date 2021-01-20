package testa;

class Number{
	static void show(int n) {
		System.out.println(n);
	}
	void show(double n) {
		System.out.println(n);
	}
}

public class Overridinggg2 {

	public static void main(String[] args) {

		Number.show(20);		//show(int n) 함수에 static을 입력하여 클래스로 함수에 바로 접근할 수 있게함.
		Number n = new Number();
		n.show(3.14);			//객체 만들어 show 함수 접근시에는 static 굳이 필요없음.

	}

}
