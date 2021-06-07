package oo;
import java.util.Scanner;
public class NumberGame {
	public static void main(String[] args)   {
		int pick = (int) (Math.random()*100)+1;
		boolean run = true;
		int selectNo = 0;
		int a = 0;
		while(run) {
		a++;
		try {
			System.out.println("숫자 입력 >");
			Scanner scanner = new Scanner(System.in);
			selectNo=scanner.nextInt();
		}catch (Exception e) {
				System.out.println("유효하지않음 다시입력");
				a--;
				continue;
			}
<<<<<<< HEAD
			if(selectNo>pick) {
				System.out.println("입력하신 숫자는 적습니다.");
			}
			else if (selectNo<pick) {
=======
			if(selectNo<pick) {
				System.out.println("입력하신 숫자는 적습니다.");
			}
			else if (selectNo>pick) {
>>>>>>> refs/remotes/origin/master
				System.out.println("입력하신 숫자는 큽니다.");
			}
			else if(selectNo == pick) {
				run = false;
				System.out.println("정답입니다. 시도횟수 " + a + "회");
			}
		}
	}
}

	
