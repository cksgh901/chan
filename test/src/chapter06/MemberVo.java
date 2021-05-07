package chapter06;

public class MemberVo {
	/*
	 아이디 , 이름 , 이메일, 성별
	 */
	private String id;
	private String name;
	private String email;
	private int gender;
	
	MemberVo() {
	}
	
	/*
	 외부에서 데이터 접근할때
	 객체.name 불가능
	 */
	//이름을 대입
//	public void setName(String name) {
//		if("바보".equals(name)) {
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
	//getter/setter 자동생성
	//souce > generate getters and setters >select all >generate
	//shift+alt+s > r >alt+a> r
	
	
	
	
}
