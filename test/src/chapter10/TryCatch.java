package chapter10;

public class TryCatch {
	public static void main(String[] args)  throws Exception{
		System.out.println("���α׷� ����");
		try {
			
			int a = 3 /1 ;
			int [] b = new int [2];
			//System.out.println(b[2]);
			//���� ��ȸ �߻�
			//throw new Exception();
			test();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println("�Լ��� �߻�");
		} finally {
			System.out.println("������ ����");
		}
		System.out.println("���α׷� ��");
		

		
}
	// ���� ���ѱ�� (�����Ѱ�����)
	public static void test() throws Exception{
		//try {
		int a = 3/0; //���� �߻�
		Class clazz = Class.forName("java.lang.String2");
		//} catch (Exception e) {}
		
		
	}
}