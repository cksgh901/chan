package chapter05;

public class Reference {

	public static void main(String[] args) {
		String name = null;
		
		// name 변수에 값을 대입
		
		System.out.println(name);
		
		if(name != null) {
		
		System.out.println(name.equals("admin"));
		}
		
		System.out.println(name!= null ? name : "이름없음");
		
		//배열
		//기호[]
		String[] names = {"홍길동","김길동","고길동","최길동","최길동","한길동"	};
		System.out.println("배열의길이:"+names.length);
		System.out.println("첫번째 값 :"+names[0]);
		
//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
//		System.out.println(names[3]);
//		System.out.println(names[4]);
//		System.out.println(names[5]);
		//배열을 for문으로 처리
		for( int i =0 ; i<names.length ;i++) {
			System.out.println(names[i]);
			
		}
		
		int[] age;
		age = null;
		
		//int scores [];
		//scores = {80,90,100} 
		
		int scores [] = new int[3];
		System.out.println(scores.length);
		System.out.println(scores[0]);
		//초기화가 아니라 새로운값으로 대입
		scores[0] = 90;
		scores[1] = 90;
		scores[2] = 0;
		
		int[] scores2 = new int [] {80,90,100};
		System.out.println(scores2.length) ;
		double a = avg(scores2);
		System.out.println(a);
		
		
		scores = new int[] {80,90,100,70};
		System.out.println(scores.length);
	}
		public static double avg(int[] scores) {
		int sum = 0;
		for (int i =0 ;i<scores.length; i++) {
			sum+= scores[i];
		}
		
		return (double)sum/scores.length;

		
			
		}
	}

