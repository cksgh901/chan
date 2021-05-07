package chapter04;
import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		boolean run =true; // 반복 여부
		
		int balance = 0; // 잔고
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) { 
			{
				System.out.println("--------------------------");
				System.out.println("1.예금 | 2.출금| 3.잔고|4.종료");
				System.out.println("--------------------------");
				System.out.print("선택> ");
				
				/*
				 * 사용자가 입력
				 * 입력값을 저장
				 * 입력값이 1이면 - 예금입력, 예금액 + balance
				 * 입력값이 2이면 - 출금입력, balance - 출금액
				 * 입력밧이 3이면 - blance 출력
				 * 입력값이 4이면 - run =false
				 */
				int input = scanner.nextInt();
				if (input == 1) {
					System.out.print("예금액> ");
					int save = 0;
					save = scanner.nextInt();
					balance += save;
				} else if (input == 2) {
					System.out.print("출금액> ");
					int out = 0;
					out = scanner.nextInt();
					balance -= out;
				}else if (input == 3) {
					System.out.println("잔고> " + balance); 
				} else if (input == 4){
					System.out.println("프로그램 종료"); 
					break;
				}

			}
		}
	}
}

