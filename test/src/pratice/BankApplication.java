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
			System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
			System.out.println("------------------------------------");
			System.out.print("����> ");
			
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
	
			System.out.println("���α׷� ����");
	}
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("���»���");
		System.out.println("--------------");
		
		System.out.print("���¹�ȣ :");
		String ano = scan.next();
		
		System.out.print("������ :");
		String owner = scan.next();
		
		System.out.print("�ʱ��Աݾ� :");
		int balance = scan.nextInt();
		
		Account1 a = new Account1(ano, owner, balance);
		for(int i = 0 ; i<accountArray.length;i++) {
		if(accountArray[i] == null) {
			accountArray[i] = a;
			System.out.println("��� ���°� �����Ǿ����ϴ�.");
			break;
		}
		}
		
		
	}
	private static void accountList() {
		
		System.out.println("--------------");
		System.out.println("���¸��");
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
		System.out.println("����");
		System.out.println("--------------");
		
		System.out.print("���¹�ȣ :");
		String ano = scan.next();
		System.out.print("������ :");
		String owner = scan.next();
		System.out.print("�Աݾ� :");
		int balance = scan.nextInt();
		Account1 a = findAccount(ano);
		a.setBalance(a.getBalance()+balance);
		System.out.println("������ �����Ǿ����ϴ�.");
		
		
		
	}
	private static void withdraw() {
		System.out.println("--------------");
		System.out.println("���");
		System.out.println("--------------");
		
		System.out.print("���¹�ȣ :");
		String ano = scan.next();
		System.out.print("������ :");
		String owner = scan.next();
		System.out.print("��ݾ� :");
		int balance = scan.nextInt();
		Account1 a = findAccount(ano);
		a.setBalance(a.getBalance()-balance);
		System.out.println("������ �����Ǿ����ϴ�.");
		
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



