package CloudStuding;

public class Dailyuser { 
public static void main(String[] args) {
    // 배열 생성
    int[] users = { 581, 512, 527, 495, 423, 141, 236 };
    
    // 계산
    double dailyUser = average(users);
    
    // 출력
    System.out.printf("하루 평균 사용자: %.2f명", dailyUser);
  }

  // 정수 배열을 입력받아, 평균을 반환
  public static double average(int[] arr) {
	  double sum = 0.0;
	  double avg = 0.0;
    // 1. 총합을 구하시오.
	  for(int i=0 ; i< arr.length ; i++) {
		  sum =+ arr[i];
		  
	  }
    
    // 2. 평균을 계산하시오.
	  avg = sum/arr.length;

    // 결과값 반환
    return avg;
  }
}



