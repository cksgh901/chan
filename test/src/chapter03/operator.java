package chapter03;

public class operator {

	public static void main(String[] args) {
	 
		int a = 1;
		int b = 2;
		int c = 3;
		int d = a +( b * c);
		System.out.println(d);
		
		int e = -100;
		int f = e*-1 ;
		System.out.println(f);
				
		// 증감연산
		// ++ : 1 더하기
		// -- : 1 빼기
		int g = 10;
		//int h = ++g;
		++g;
		g++;
		System.out.println(g);
		--g ;
		g-- ;
		System.out.println(g);
		
		// g = 10  전위 연산
		//현제 실행문이 실행되기전에 증감
		//int h = ++g;
		//System.out.println(h);
		//System.out.println(g);
		
	    // 후위 연산
		// 후위연산은 현재식이 실행이 끝나고 1 더함
		int h = g++;
		System.out.println(h);
		System.out.println(g);
		
		int i = 10;
		System.out.println(++i);
		System.out.println(i++); // 전위 , 후위 i = 11
		
		i = 10;
		i++;
		
		System.out.println(i); 
		
		//산술연산 나머지
		System.out.println(10/3); // 나누기 (몫) 
		System.out.println(10%3); // 나머지 
		
		
		// 대입연산
		int aa = 1;
		// += , -= , *= , /= , %=...
		//aa += 10; // 1+ 10값을 대입
		aa = aa +10 ;
		System.out.println(aa);
		
		// 문자열 연산 +
		//문자열 +숫자 : 숫자가 문자열로 형변환
		//숫자+문자열  :  숫자가 문자열로 형변환s
		//문자열 +문자열 : 문자열
		
		int grade = 1;
		String number ="1";;
		String str = number + grade + "학년";
		System.out.println(str);
		
		String n1 = "1"+1;
		String n2 = 1+"1";
		System.out.println(n1);
		System.out.println(n2);
		
		//숫자 -> 문자로 변환
		String n3 = grade + "";
		System.out.println(n3);
		
	}

}
