package chapter11;

import java.util.Arrays;
import java.util.Random;

public class Lotory {

	public static void main(String[] args) {
		
		int [] selectNumber = new int [6];
		Random r = new Random(5);
		System.out.print("���� ��ȣ  ");
		for(int i =0 ; i<6;i++) {
			selectNumber[i] = r.nextInt()+1;
			System.out.print(selectNumber[i]+"  ");
		}
		System.out.println();
		
		//��÷��ȣ
		int[] winningNumber = new int[6];
		r= new Random(5);
		System.out.print("��÷ ��ȣ");
		for(int i = 0 ; i<6; i++) {
			winningNumber[i] = r.nextInt(45)+1;
			System.out.print(winningNumber[i]+" ");
		}
		System.out.println();
		
		//��÷ ����
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("��÷ ����   ");
		if(result) {
			System.out.println("1�� ��÷ ");
		}else {
			System.out.println("��÷");
		}
		

	}

}
