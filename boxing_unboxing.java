package sol21_01_22;

public class boxing_unboxing {

	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		Double b = new Double(3.14);
		  
		Integer a = 10;
		Double c = 3.14;		//�ڵ� �ڽ�. 
		//�⺻ �ڷ����� ��ü�� ����.(boxing)
		
		System.out.println(i);
		System.out.println(b);
		
		System.out.println(a);
		System.out.println(c);
		
		i = new Integer(i.intValue());
		b = new Double(b.doubleValue());
		
		a = new Integer(a.intValue());
		c = new Double(c.doubleValue());
		//��ü�� �⺻ �ڷ������� ����.(unboxing)
		
		System.out.println(i);
		System.out.println(b);
		
		System.out.println(a);
		System.out.println(c);
	}

}
