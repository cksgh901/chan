package pratice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args)   {
		int pick = (int) (Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int selectNo = 0;
		int a = 0;
		while(run)  {
			a++;
			System.out.println("숫자 입력 >");
			try {
			 selectNo = sc.nextInt();
			}catch (InputMismatchException e) {
				continue;
				System.out.println("유효");
			}
			
			if(selectNo == pick) {
				run = false;
				
			}
		System.out.println(a);
	}

	}
}


	



