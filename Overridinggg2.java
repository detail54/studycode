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

		Number.show(20);		//show(int n) �Լ��� static�� �Է��Ͽ� Ŭ������ �Լ��� �ٷ� ������ �� �ְ���.
		Number n = new Number();
		n.show(3.14);			//��ü ����� show �Լ� ���ٽÿ��� static ���� �ʿ����.

	}

}
