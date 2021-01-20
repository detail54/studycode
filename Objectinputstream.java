package testb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import testa.Stu;

public class Objectinputstream {

	public static void main(String[] args) throws ClassNotFoundException {
		
		ObjectInputStream is = null;
		
		try {
			is = new ObjectInputStream(new FileInputStream("ob.txt"));
			Stu s=(Stu)is.readObject();	//형변환. object 형을 stu로 형변환
			
			System.out.println(s.getName());
			System.out.println(s.getId());
			System.out.println(s.getAge());
			
			is.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
