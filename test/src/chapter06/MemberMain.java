package chapter06;

public class MemberMain {

	public static void main(String[] args) {
		MemberVo vo = new MemberVo();
		//vo.name = "홍길동"  .에러.
		vo.setName("홍길동");
		// 이름에 욕이 대입
		vo.setName("바보");
		System.out.println(vo.getName());

	}

}
