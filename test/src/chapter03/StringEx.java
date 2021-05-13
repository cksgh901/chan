package chapter03;

public class StringEx {

	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = "홍길동";
		String name3 = new String("홍길동");
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		System.out.println(name1==name2);
		System.out.println(name1==name3);
		
		String name4 = new String("홍길동");
		System.out.println(name3==name4);
		
		String name5 = name4;
		System.out.println(name4 == name5);
		System.out.println( name5);
		
		
		//논리연산
		int b1 = 10;
		int b2 = 20;
		// and : && 양쪽 다 참이면 ture
		// or  : || 하나라도 참이면 ture 
		// not : !  반대
		if (b1<b2 && b1== 10) {
			System.out.println("ture");
		}
		System.out.println((!(b1<b2)));
		
		String name = null;
		//System.out.println(name.equals("admin"));
		//shorcut
		// and 연산에서 왼쪽항이 false이면 오른쪽항 확인 불필요
		// or  연산에서 왼쪽항이 true 이면  오른쪽항 확인 불필요
		if(b1>10 && name.equals("admin")) {
			System.out.println("ture");
		}
		
		 // 문자열이 값이 있으면 true 출력
		String id = null;
		
		if(id != null && !id.equals("")) {
			System.out.println("ture");
		}
		
		

	}

}
