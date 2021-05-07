package CloudStuding;

public class Pork {
	  public static void main(String[] args) {
	    // 변수 생성
	    int n = 3;
	    // 계산
	    double kcal = pkal(n);
	    // 출력
	    System.out.println(kcal);
	  }
	  public static double pkal(int n) {
	    return Math.floor(180 * n * 5.179*100)/100;
	  }
	}