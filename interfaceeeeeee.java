package interfaceee;

interface I1{
	public void x();
}
		//���� �����ڴ� �ݵ�� public �̾�� �Ѵ�.
interface I2{
	public void z();
}
		//implements - Ŭ������ �������̽� ����. (Ŭ���� A�� �������̽� I�� �����Ѵ�.)
class A implements I1, I2{
	public void x() {}
	public void z() {}
}
		//Ŭ������ ���� Ŭ������ ����Ҷ� �Ѱ��� ����Ŭ������ ��� �Ҽ� ������,
		//�������̽��� ������ ������ �� �ִ�. ��, ������ �������̽��� �޼ҵ带 �ݵ�� ������ �ؾ���.

interface I3{
	public void a();
}

interface I4 extends I3{		//�������̽��� ��Ӱ���. ����� �������̽��� �Ѱ��� �������̽��� ��Ӱ���.
	public void b();			//��, ��ӹ��� ���� �������̽��� Ŭ������ ���� ��Ű�� ���� �������̽��� ���� �������̽��� �޼ҵ带 ��� �����ؾ���.
}

class B implements I4{
	public void a() {}
	public void b() {}
}