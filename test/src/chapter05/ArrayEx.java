package chapter05;

public class ArrayEx {

	public static void main(String[] args) {
		String[] names = {"홍길동","김길동","최길동"};
		for(int i = 0; i<names.length ;i++) {
			System.out.println(names[i]);
		}
		//2차원 배열
		// 자바고 3학년에 반이 3개
		//1반 홍길동 김길동 최길동
		//2반 고길동 박길동 한길동
		//3반 강길동 이길동 서길동
		
		String[] class1 = {"홍길동","김길동","최길동"};
		String[] class2 = {"고길동","박길동","한길동"};
		String[] class3 = {"강길동","이길동","서길동"};
		
		
		
		String[][] gread3 = {class1,class2,class3};
		
		//3학년 반 몇개?
		System.out.println(gread3.length);
		//1반학생수
		System.out.println(class1.length);
		//1반 class 1= gread3[0]
		System.out.println(gread3[0].length);
		// gread3의 인덱스 0: 1반 1:2반 3:3반
		
		//3반의 두번째 학생이름
		System.out.println(gread3[2][1]);
		
		// 배열안에 배열
		// 중괄호 안에 중괄호
		// 배열의 값에 접근할때 인덱스 사용
		// 배열변수명[인덱스]
		// 배열(반)안에 배열(학생) -> 변수명[반][학생명]
		String[][] gread3_1 = {
				{"홍길동","김길동","최길동"},
				{"고길동","박길동","한길동"},
				{"강길동","이길동","서길동"}
		};
		System.out.println(gread3_1[0][0]);
		
		//3차원
		//학년 > 반 > 학생
		String[][][] school = {
				{
					{"홍길동1","김길동1","최길동1"},
					{"고길동1","박길동1","한길동1"},
					{"강길동1","이길동1","서길동1"}
				},
				{
					{"홍길동2","김길동2","최길동2"},
					{"고길동2","박길동2","한길동2"},
					{"강길동2","이길동2","서길동2"}
				},
				{
					{"홍길동3","김길동3","최길동3"},
					{"고길동3","박길동3","한길동3"},
					{"강길동3","이길동3","서길동3"}
				}
				
		};
		System.out.println(school[0][0][0]);
		
		//변수의 활용
		//String [] name ={"홍길동","김길동","최길동","고길동"};
		//학생명,전화번호
		
		String[] mobile = {"010","011","016","019"};
		String[] email = {"gmail","naver","daum","yahoo"};
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]+""+mobile[i]+""+email[i]);
		}
		
		
		// names 배열을 가지고 향상된 for뮨
		//기존 for문
		for(int i = 0 ; i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		//향상된 for문
		//for(임시변수 ; 반복객체)
		for(String name : names) {
			System.out.println(name);
		}
		
		
		
		

	}

}
