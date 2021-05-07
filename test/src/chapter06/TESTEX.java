package chapter06;

import java.util.Scanner;
public class TESTEX {
	private static Account1[] accountArray = new Account1[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int idx = 0 ;//�ε��� , ���� ��ü�� �ִ� �迭�� ����
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
			System.out.println("------------------------------------");
			System.out.print("����> ");
			
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
		System.out.println("���α׷� ����");
	}
	private static void createAccount() {
		System.out.println("-----------------------------");
		System.out.println("            ���»���           ");
		System.out.println("-----------------------------");
		
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		
		System.out.print("������ : ");
		String owner = scanner.next();
		
		System.out.print("�ʱ��Աݾ� : ");
		int balance = scanner.nextInt();
		
		//���¹�ȣ�� �ߺ��� �ȵǵ���
		if(findAccount(ano) == null) {
		accountArray[idx] = new Account1(ano, owner, balance);
		idx++;
		} else {
			System.out.println("�̹� ��ϵ� ���¹�ȣ�Դϴ�.");
		}
	}

	private static void accountList() {
		System.out.println("-------------------------------");
		System.out.println("���¸��");
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
		System.out.println("����");
		System.out.println("-------------------------------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("���ݾ� : ");
		int balance = scanner.nextInt();
		
		// ���¹�ȣ�� �ùٸ��� ���� ��� �޼���
		Account1 acc = findAccount(ano);
		if(acc == null) {
			System.out.println("���¹�ȣ�� Ȯ���� �ּ���.");
		}else {
			acc.setBalance(acc.getBalance()+balance);
			System.out.println("������ �����Ǿ����ϴ�.");
		}
	}
	private static void withdraw() {
		System.out.println("-------------------------------");
		System.out.println("���");
		System.out.println("-------------------------------");
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		System.out.print("��ݾ� : ");
		int balance = scanner.nextInt();
		Account1 acc = findAccount(ano);
		if(acc == null) {
			System.out.println("���¹�ȣ�� Ȯ���� �ּ���.");
		}else {
			if(balance<= acc.getBalance()) {
				acc.setBalance(acc.getBalance()-balance);
				System.out.println("����� �����Ǿ����ϴ�.");
		}else {
			System.out.println("�ܾ��� �����մϴ�.");
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





