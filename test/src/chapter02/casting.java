package chapter02;

public class casting {

	public static void main(String[] args) {
		
		int a = 10;
		long b = a; // 자동형변환(작은자료형을 큰자료형으로 담을떄)
		long b2 = (long)a; // ,강제형변환으로도 가능
		
		//int c = b; // 에러 발생 큰자료형을 작은자료형에 담으려고 하면
		int c = (int)b; // 강제 형변환
		
		// 담을수 없을떄?
		double d = 3.14;
		int e = (int)d;
		System.out.println(e);
		
		// 정수 -> 실수
		double f = e; 
		System.out.println(f);
		
		int kor = 90;
		int eng = 80;
		int math = 75;
		
		int sum = kor + eng+ math;
		
		double avg = sum/3.0; // 정수와 정수의 연산결과는 무조건 정수로 출력
		System.out.println(sum/3.0);
		System.out.println(avg);

	}

}
