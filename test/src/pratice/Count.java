package pratice;

public class Count {

	public static void main(String[] args) {
	    int n = 7;

	    // �޼ҵ带 ����, ��� ���
	    printNumbers(n);
	  }

	  // 1���� N����, ������ ���
	  public static void printNumbers(int max) {
	    // ��� ����!
	    System.out.println("����� �����մϴ�..");
	    
	    // �ݺ��� ����, ���� ���
	     for (int i =0; i <= max; i++) {
	      System.out.printf("%d ", i);
	     }
	    
	    // ��!
	    System.out.println("\n��!!");
	  }
	}