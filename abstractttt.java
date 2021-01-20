package soldesk;

class Circle{
	private int in;
	
	Circle(int a){
		this.in = a;
	}
	int get() {
		return in;
	}
}

class NCircle extends Circle{
	private String color;
	
	NCircle(int a, String b){
		super(a);
		this.color = b;
	}
	void show() {
		System.out.println("반지름"+get()+"색"+color);
	}
}

public class abstractttt {

	public static void main(String[] args) {

		NCircle n = new NCircle(10, "red");
		n.show();

	}

}
