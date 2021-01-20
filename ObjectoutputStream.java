package testb;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import testa.Stu;

public class ObjectoutputStream {

	public static void main(String[] args) throws IOException {

		ObjectOutputStream os = null;
		try {
			os = new ObjectOutputStream(new FileOutputStream("ob.txt"));
									// ��ü�� ���Ͽ� �����ϴ°�.
			Stu s = new Stu(); // stu���Ͽ��� ������ ������ ����ü� �ְ� ��ü������.

			s.setName("����");
			s.setId("����");
			s.setAge(30);

			os.writeObject(s); // ������Ʈ ��ü�� ���Ͽ� �ۼ�.

		} catch (Exception e) {
			os.close();
		}

	}

}
