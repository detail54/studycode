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
									// 객체를 파일에 저장하는거.
			Stu s = new Stu(); // stu파일에서 저장한 내용을 끌어올수 있게 객체생성함.

			s.setName("대현");
			s.setId("하이");
			s.setAge(30);

			os.writeObject(s); // 오브젝트 객체를 파일에 작성.

		} catch (Exception e) {
			os.close();
		}

	}

}
