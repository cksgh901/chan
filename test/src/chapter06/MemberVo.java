package chapter06;

public class MemberVo {
	/*
	 ���̵� , �̸� , �̸���, ����
	 */
	private String id;
	private String name;
	private String email;
	private int gender;
	
	MemberVo() {
	}
	
	/*
	 �ܺο��� ������ �����Ҷ�
	 ��ü.name �Ұ���
	 */
	//�̸��� ����
//	public void setName(String name) {
//		if("�ٺ�".equals(name)) {
//			this.name = "00";
//			return;
//		}
//		this.name = name;
//	}
//	public String getName() {
//		return name;
//	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	//getter/setter �ڵ�����
	//souce > generate getters and setters >select all >generate
	//shift+alt+s > r >alt+a> r
	
	
	
	
}
