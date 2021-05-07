package pratice;
import java.util.Scanner;

import chapter06.Account1;



public class BankApplication {
	private static Account1[] accountArray = new Account1[100];
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scan.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if (selectNo == 3) {
				deposit();
			}else if (selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}
		}
	
			System.out.println("프로그램 종료");
	}
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");
		
		System.out.print("계좌번호 :");
		String ano = scan.next();
		
		System.out.print("계좌주 :");
		String owner = scan.next();
		
		System.out.print("초기입금액 :");
		int balance = scan.nextInt();
		
		Account1 a = new Account1(ano, owner, balance);
		for(int i = 0 ; i<accountArray.length;i++) {
		if(accountArray[i] == null) {
			accountArray[i] = a;
			System.out.println("결과 계좌가 생성되었습니다.");
			break;
		}
		}
		
		
	}
	private static void accountList() {
		
		System.out.println("--------------");
		System.out.println("계좌목록");
		System.out.println("--------------");
		
		for(int i = 0 ; i< accountArray.length ; i++) {
			Account1 a = accountArray[i];
			if(accountArray[i] == null) {
				break;
			}else {
				System.out.println(accountArray[i].getAno() +"/t" +
									accountArray[i].getOwner() + "/t"+
									accountArray[i].getBalance());
			}
		}
		}
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");
		
		System.out.print("계좌번호 :");
		String ano = scan.next();
		System.out.print("계좌주 :");
		String owner = scan.next();
		System.out.print("입금액 :");
		int balance = scan.nextInt();
		Account1 a = findAccount(ano);
		a.setBalance(a.getBalance()+balance);
		System.out.println("예금이 성공되었습니다.");
		
		
		
	}
	private static void withdraw() {
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		
		System.out.print("계좌번호 :");
		String ano = scan.next();
		System.out.print("계좌주 :");
		String owner = scan.next();
		System.out.print("출금액 :");
		int balance = scan.nextInt();
		Account1 a = findAccount(ano);
		a.setBalance(a.getBalance()-balance);
		System.out.println("예금이 성공되었습니다.");
		
	}
	private static Account1 findAccount(String ano) {
		Account1 b = null ;
		for(int i = 0 ; i<accountArray.length; i++) {
			Account1 a = accountArray[i];
			if(a != null) {
				if(a.getAno().equals(ano)) {
					b= a;
				}
			}
		}
		return b;

		}
}



