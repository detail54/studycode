package sol21_01_22;

class Tv{
	public void on() {
		System.out.println("Ƽ�� ��");
	}
}  

interface Computer{
	public void m();
}
class Com{
	public void m() {
		System.out.println("��");
	}
}
class Ipad extends Tv implements Computer{
	
	Com c = new Com();
	public void m() {	//Computer m �Լ�.
		c.m();	//Com m �Լ�
	}
	public void ip() {
		m();
		on();
	}
	
}
public class interface2 {

	public static void main(String[] args) {

		Ipad i = new Ipad();
		
		i.ip();
		

	}

}
