package chapter06;

public class MemberMain {

	public static void main(String[] args) {
		MemberVo vo = new MemberVo();
		//vo.name = "ȫ�浿"  .����.
		vo.setName("ȫ�浿");
		// �̸��� ���� ����
		vo.setName("�ٺ�");
		System.out.println(vo.getName());

	}

}
