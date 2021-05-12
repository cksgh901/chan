package chapter06;

import java.util.Scanner;
public class TESTEX {
	private static Account1[] accountArray = new Account1[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int idx = 0 ;//인덱스 , 계좌 객체가 있는 배열의 길이
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
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
		System.out.println("-----------------------------");
		System.out.println("            계좌생성           ");
		System.out.println("-----------------------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		
		System.out.print("계좌주 : ");
		String owner = scanner.next();
		
		System.out.print("초기입금액 : ");
		int balance = scanner.nextInt();
		
		//계좌번호가 중복이 안되도록
		if(findAccount(ano) == null) {
		accountArray[idx] = new Account1(ano, owner, balance);
		idx++;
		} else {
			System.out.println("이미 등록된 계좌번호입니다.");
		}
	}

	private static void accountList() {
		System.out.println("-------------------------------");
		System.out.println("계좌목록");
		System.out.println("-------------------------------");
		for(int i=0;i<idx;i++) {
			Account1 account = accountArray[i];
		
			System.out.println(accountArray[i].getAno()+"\t"
								+ accountArray[i].getOwner() + "\t"
								+ accountArray[i].getBalance());
		}
	
		}
		
	
	private static void deposit() {
		System.out.println("-------------------------------");
		System.out.println("예금");
		System.out.println("-------------------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액 : ");
		int balance = scanner.nextInt();
		
		// 계좌번호가 올바르지 않은 경우 메세지
		Account1 acc = findAccount(ano);
		if(acc == null) {
			System.out.println("계좌번호를 확인해 주세요.");
		}else {
			acc.setBalance(acc.getBalance()+balance);
			System.out.println("예금이 성공되었습니다.");
		}
	}
	private static void withdraw() {
		System.out.println("-------------------------------");
		System.out.println("출금");
		System.out.println("-------------------------------");
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		System.out.print("출금액 : ");
		int balance = scanner.nextInt();
		Account1 acc = findAccount(ano);
		if(acc == null) {
			System.out.println("계좌번호를 확인해 주세요.");
		}else {
			if(balance<= acc.getBalance()) {
				acc.setBalance(acc.getBalance()-balance);
				System.out.println("출금이 성공되었습니다.");
		}else {
			System.out.println("잔액이 부족합니다.");
		}
		}

		
	}
	
	private static Account1 findAccount(String ano) {
		Account1 acc =null;
		for(int i = 0 ; i<idx; i++) {
			if(ano.equals(accountArray[i].getAno())){
				return accountArray[i];
			}
		}
		return acc;
	
		
	
	
	
	}
}





