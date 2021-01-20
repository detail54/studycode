package testa;

import java.io.Serializable;
					
public class Stu implements Serializable {	//위에 메뉴 source - generate getters and setters... - 변수 체크 후 generate 누르면 자동으로 함수 생성.
				//직렬화 인터페이스.. 이거 없으면 객체 저장못함. 객체를 저장하고 꺼내려면 Serializabel이 필요함.
			//객체를 파일에 저장한다.(objectOutputStream) -> 직렬화라고 함.
			//파일에 저장한 객체를 꺼내는 작업. (objectInputStream)-> 역 직렬화.
	private String name;
	private String id;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	
}
