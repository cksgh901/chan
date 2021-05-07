package chapter20;

import java.util.List;

public class StudentMain {

	public static void main(String[] args) throws Exception {
		StudentDAO dao = new StudentDAO();
		
		StudentVo vo = new StudentVo();
		vo.setStudno(999999);
		vo.setName("홍길동");
		vo.setId("hong");
		vo.setGrade(1);
		vo.setJumin("200101");
		
//		int r = dao.insert(vo);
//		if(r>0) {
//			System.out.println("정상적으로 등록되었습니다.");
//		}else {
//			System.out.println("등록 실패");
	//}
		
		StudentVo data = dao.selectOne(999999);
		System.out.println("이름 :" + data.getName());
		System.out.println(("id :" + data.getId()));
		System.out.println("학년 :" + data.getGrade());
		System.out.println("주민번호 : " + data.getJumin());
		
		vo = new StudentVo();
		
		List<StudentVo> list = dao.select();
		
		for(int i = 0 ; i<list.size();i++) {
			StudentVo student = list.get(i);
			System.out.println(student.getName()+" " + student.getId()+ " " + student.getGrade()+" "+ student.getJumin());
		}
		
		
		vo = new StudentVo();
		vo.setStudno(999999);
		vo.setName("김길동");
		vo.setId("kim");
		vo.setGrade(2);
		vo.setJumin("200202");
		int r =dao.update(vo);
				if(r>0) {
					System.out.println("정상적으로 수정되었습니다.");
				}else
					System.out.println("수정실패");
				
		
		dao.close();

	}
}


