package testa;

import java.io.Serializable;
					
public class Stu implements Serializable {	//���� �޴� source - generate getters and setters... - ���� üũ �� generate ������ �ڵ����� �Լ� ����.
				//����ȭ �������̽�.. �̰� ������ ��ü �������. ��ü�� �����ϰ� �������� Serializabel�� �ʿ���.
			//��ü�� ���Ͽ� �����Ѵ�.(objectOutputStream) -> ����ȭ��� ��.
			//���Ͽ� ������ ��ü�� ������ �۾�. (objectInputStream)-> �� ����ȭ.
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
