package chapter11;

public class StringBufferEx {

	public static void main(String[] args) {
		//String은 값이 변경 불가(immutable)
//		String name = "홍길동";
//		for(int i=0 ; i<10; i++) {
//			name +=",김길동";
//		}
//		StringBuffer sb = new StringBuffer();
//		//메서드 체이닝
//		
//		sb.append("홍길동").append("김길동").append("박길동").append("동길동");
//		System.out.println(sb.toString());
//		
		//시작시간
		long start = System.currentTimeMillis();
		
//		String str = "";
//		for(int i=0;i<1000000;i++) {
//			str+=i;
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<1000000;i++) {
			sb.append(i);
		
		
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000);

	}

}
}
