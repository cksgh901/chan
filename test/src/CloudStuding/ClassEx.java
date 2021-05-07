package CloudStuding;

public class ClassEx {

	public static void main(String[] args) {
		//TopScoreStudent.class (설계도)
		//설계도로 객체를 생성
		//생성된 객체를 변수에 대입
		new TopScoreStudent(); // 객체를 생성
		TopScoreStudent a = new TopScoreStudent();
		TopScoreStudent b = new TopScoreStudent();
		Gamble g = new Gamble();
		
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
		TopScoreStudent d; //변수 선언
		d = new TopScoreStudent(); // 초기화
		
	}

}
