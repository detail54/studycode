package sol21_01_22;

class Person {}
class Student extends Person {}
class Worker extends Student {}
class ITWorker extends Worker {}
  
public class interface1 {
	static void show(Person p) {
				// ��¥ Person�� �ڽ� Ŭ������ �´��� ���ϴ� ������.
		if (p instanceof Person) {
			System.out.println("���");
		}
		if (p instanceof Student) {
			System.out.println("�л�");
		}
		if (p instanceof Worker) {
			System.out.println("������");
		}
		if (p instanceof ITWorker) {
			System.out.println("IT������");
		}
	}

	public static void main(String[] args) {

		// Person p = new Student();
		// Person p = Worker();
		// Person p = ITWorker();

		show(new Student());
		show(new Worker());
		show(new ITWorker());

	}

}
