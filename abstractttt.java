package soldesk;

abstract class A {
	int left, right;

	public void aa(int left, int right) {
		this.left = left;
		this.right = right;
	}

	int out() {
		return this.left + this.right;
	}

	public abstract void sum();

	public abstract void avg();

	public void run() {
		sum();
		avg();
	}
}

class BB extends A {
	public void sum() {
		System.out.println("+ sum : " + out());
	}

	public void avg() {
		System.out.println("+ avg : " + out() / 2);
	}
}

class CC extends A {
	public void sum() {
		System.out.println("- sum : " + out());
	}

	public void avg() {
		System.out.println("- avg : " + out() / 2);
	}
}

public class abstractttt {

	public static void main(String[] args) {

		BB b = new BB();
		b.aa(10, 20);
		b.run();

		CC c = new CC();
		c.aa(10, 20);
		c.run();
	}

}
