package chapter06;

public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum+= values[i];
		}
		return sum;
	}
	int sum2(int ... values) {
		int sum =0;
		for(int i = 0 ; i<values.length; i ++ ) {
			sum+= values[i];
		}
		return sum;
	}
	void memberPrint(String ... values) {
		System.out.println("이름 :" + values[0]);
		System.out.println("이름 :" + values[1]);
		System.out.println("이름 :" + values[2]);
		
	}
	void memberPrint (String name , String id, String email) {
		System.out.println("이름 :" + name);
		System.out.println("아이디 :" + id);
		System.out.println("이메일 :" + email);


}
}
