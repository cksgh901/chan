package pratice;

public class Diet {
	  public static void main(String[] args) {
	    // ���� ����
	    double w = 81.6;
	    double t = 1.76;
	    
	    // BMI ���
	    double bmi = calculate(w, t);
	    
	    // ��� ���
	    System.out.printf("BMI: %.2f(%.1fkg, %.2fm)\n", bmi, w, t);
	    System.out.printf("���: %s�Դϴ�.\n", result(bmi));
	  }

	  // �����Կ� Ű�� �Է¹޾�, bmi ������ ��ȯ
	  public static double calculate(double weight, double tall) {
	    /* �ش� �޼ҵ带 �ϼ��Ͻÿ�. */
	    return weight/(tall*tall);
	  }
	  
	  // bmi ������ �Է¹޾�, �� ����� ��ȯ
	  public static String result(double bmi) {
	    String result = "";
	    if(bmi > 30){
	    	result = "��";
	    }else if(25<= bmi ){
	    	result = "��ü��";
	    }else if(18.5<=bmi){
	    	result = "����";
	    }else{
	    	result = "��ü��";
	    }
	    /* �ش� �޼ҵ带 �ϼ��Ͻÿ�. */
	    return result;
	  }
	}