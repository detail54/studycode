package sol21_01_22;

public class boxing_unboxing2 {

	public static void main(String[] args) {

		Integer i = new Integer(10);
		int i1 = i.intValue();
		  
		Character c = new Character('a');
		char c1 = c.charValue();
				
		Boolean b = new Boolean(true);
		boolean b1 = b.booleanValue();
		
		//���ڿ��� �⺻�� ���� ��ȯ.
		int i2 = Integer.parseInt("123");		//parse �� �⺻ �ڷ������� ��ȯ.
		
		boolean b2 = Boolean.parseBoolean("true");
		
		double d2 = Double.parseDouble("3.14");
		
		int i3 = Integer.valueOf("123");		//��ü�� ��ȯ.
		int i4 = Integer.valueOf("10")+Integer.valueOf("20");
		
		System.out.println(i4);
		
		String s = Integer.toString(123);
		
		
	}

}
