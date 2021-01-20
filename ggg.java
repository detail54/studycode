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

		Movie m1 = new Movie("해리포터");
		Movie m2 = new Movie("기생충",20000);		//(title, price) 임.
		
		System.out.println(m1.title);		//변수를 title로 호출했기 떄문에 클래스 변수도 title로 지정해야함.
		System.out.println(m2.title+" "+m2.price);
		
	}

}
