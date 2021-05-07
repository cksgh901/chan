package chapter04;

public class ex {

	public static void main(String[] args) {
		// 조건문
		// if문
		//카드가 있으면 택시 ,없으면 버스(돈이 1500원 있으면), 카드도없고 돈도없으면 걸어감
//		boolean card = false; //카드 소지 여부
//		int money =300; 
//		
//		if (card) { 
//			System.out.println("택시");
//			} else {
//				if  (money >= 1500) { 
//					System.out.println("버스");
//			} else {
//				System.out.println("걸어가");

		
		// 반복횟수가 정해져이다 => for
		// 반복횟수가 정해져있지않다 => while
//		for(int i=0; i<10;i++) {
//			for (int j=0; j<i;j++) {
//				System.out.print("철수야 ");
//			}
//				System.out.println(" ") ;
//		}
		
		// 10-1출력
//		for (int i = 10 ; i>=1;i--) {
//			System.out.println(i);
//			
			boolean run = true;
			int i =1;
			while (run) {
				System.out.println("철수야");
				if(i==10) break;
				i++;
			}
		}
	}
