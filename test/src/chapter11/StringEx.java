package chapter11;

public class StringEx {

	public static void main(String[] args) {
		String title = "�ڹ� ���α׷���";
		System.out.println("���α׷���");
		
		String contents = "�ʴ� �̷���, ������ �׷��� �ٺ���.";
		System.out.println(contents.indexOf("�ٺ�"));
		if(contents.indexOf("�ٺ�") > -1){
			System.out.println("�ٺ���� �ܾ� ����");
		}
		
		String file = "������.jpg";
		System.out.println(file.substring(file.indexOf(".")));
		//ġȯ
		System.out.println(title.replace("�ڹ�","���̽�"));
		System.out.println(title); 
		//3�ε��� ���� 5�ε��� ������
		System.out.println(title.substring(3,5));
		//��������
		System.out.println(title.replace(" ", " "));
		//����
		String name = " ȫ�浿, ��浿 , �ֱ浿 , �ڱ浿";
		String[] names = name.split(",");
		System.out.println(names.length);
		
		for(String n : names) {
			System.out.println(n);
		}
		
		String email = "aa@tset.com bb@test.com ccc@test.com";
		String[] emails = email.split(" ");
		for(String n : emails) {
			System.out.println(n);
		}

	}

}
