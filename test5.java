package sol21_01_22;

class In {

	private int a;

	In(int a) {
		this.a = a;
	}	//toString �Լ��� public �ʼ�
	public String toString() {
		return Integer.toString(a);
	}
}
  
public class test5 {

	public static void main(String[] args) {

		In i = new In(4);
		System.out.println(i);

	}

}
