package pratice;

public class Grad {

		  public static void main(String[] args) {
				    // 변수 생성
				    int[] runningMinutes = { 42, 66, 57, 54, 88 };
				    int sum = 0;
				    
				    for (int i = 0; i < 5; i++) {
				    
				    	sum += runningMinutes[i];
				    }

				    /* 1. for 문을 사용하여 총합을 계산하시오. */
				   
				    
				    /* 2. 평균을 계산하시오. */
				    double average = sum/5.0;

				    // 결과 출력
				    System.out.printf("달리기 시간 총합: %d분\n", sum);
				    System.out.printf("달리기 시간 평균: %.0f분\n", average);
				  }
				}