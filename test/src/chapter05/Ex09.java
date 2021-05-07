package chapter05;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0 ;
		int scores[] = null ;
		Scanner scanner = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3.점수리스트 | 4.분석| 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				// 학생수 > 사용자 입력
				System.out.print("학생수>");
				studentNum = scanner.nextInt();
				//studentNum 이 배열의 길이 -> 배열을 초기화
				scores = new int [studentNum];
				
			}else if (selectNo == 2) {
				for(int i =0; i<scores.length; i++) {
					System.out.print("scores["+i+"]>");
					scores[i] = scanner.nextInt();
				}
				
			}else if (selectNo == 3) {
				int idx =0 ;
				for(int i =0; i<scores.length; i++) {
					System.out.println("scores["+i+"] : "+scores[i]);
					idx++;
				}
			}else if (selectNo == 4) {
				int sum =0  ;
				double avg = 0 ; 
				int max = 0 ;
				for(int i = 0; i<scores.length ; i++) {
					sum += scores[i];
					avg = (double)sum / scores.length ;
					if(max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("최고점수 : "  + max);
				System.out.println("평균점수 : " + avg);
			}else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램종료");
		
	}

}
