package chapter11;

public class StringBufferEx {

	public static void main(String[] args) {
		//String�� ���� ���� �Ұ�(immutable)
//		String name = "ȫ�浿";
//		for(int i=0 ; i<10; i++) {
//			name +=",��浿";
//		}
//		StringBuffer sb = new StringBuffer();
//		//�޼��� ü�̴�
//		
//		sb.append("ȫ�浿").append("��浿").append("�ڱ浿").append("���浿");
//		System.out.println(sb.toString());
//		
		//���۽ð�
		long start = System.currentTimeMillis();
		
//		String str = "";
//		for(int i=0;i<1000000;i++) {
//			str+=i;
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<1000000;i++) {
			sb.append(i);
		
		
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000);

	}

}
}
