package pratice;

public class dice {
		  public static void main(String[] args) {
		    double dollar = dice() + dice() + dice();
		    double won = exchange(dollar);
		    System.out.printf("ȹ�� �ݾ�: $%.2f(%.0f��)", dollar, won);
		  }
		  
		  public static int dice() {
		    /* Math.random() �޼ҵ带 Ȱ���Ͽ� 1~6 ������ ������ ��ȯ�ϵ��� �Ͻÿ� */
		    return (int) (Math.random()*6+1);
		  }
		  
		  public static double exchange(double dollar) {
		    /* �Է¹��� �޷��� ȯ���Ͽ� ��ȯ �Ͻÿ� */
		    return   dollar *1082.25108 ;
		  }
		}
