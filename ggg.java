package aaaaaaaaa;

class Movie{
	
	String title;
	int price;
	
	Movie(String title){
		this.title = title;
	}
	Movie(String title,int price){
		this.title = title;
		this.price = price;
	}
	
}

public class ggg {

	public static void main(String[] args) {

		Movie m1 = new Movie("�ظ�����");
		Movie m2 = new Movie("�����",20000);		//(title, price) ��.
		
		System.out.println(m1.title);		//������ title�� ȣ���߱� ������ Ŭ���� ������ title�� �����ؾ���.
		System.out.println(m2.title+" "+m2.price);
		
	}

}
