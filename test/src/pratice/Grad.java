package pratice;

public class Grad {

		  public static void main(String[] args) {
				    // ���� ����
				    int[] runningMinutes = { 42, 66, 57, 54, 88 };
				    int sum = 0;
				    
				    for (int i = 0; i < 5; i++) {
				    
				    	sum += runningMinutes[i];
				    }

				    /* 1. for ���� ����Ͽ� ������ ����Ͻÿ�. */
				   
				    
				    /* 2. ����� ����Ͻÿ�. */
				    double average = sum/5.0;

				    // ��� ���
				    System.out.printf("�޸��� �ð� ����: %d��\n", sum);
				    System.out.printf("�޸��� �ð� ���: %.0f��\n", average);
				  }
				}