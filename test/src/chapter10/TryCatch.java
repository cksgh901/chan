package chapter10;

public class TryCatch {
	public static void main(String[] args)  throws Exception{
		System.out.println("프로그램 시작");
		try {
			
			int a = 3 /1 ;
			int [] b = new int [2];
			//System.out.println(b[2]);
			//강제 예회 발생
			//throw new Exception();
			test();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println("입셉션 발생");
		} finally {
			System.out.println("무조건 실행");
		}
		System.out.println("프로그램 끝");
		

		
}
	// 예외 떠넘기기 (실행한곳으로)
	public static void test() throws Exception{
		//try {
		int a = 3/0; //예외 발생
		Class clazz = Class.forName("java.lang.String2");
		//} catch (Exception e) {}
		
		
	}
}