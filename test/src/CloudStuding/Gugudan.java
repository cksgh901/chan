package CloudStuding;
public class Gugudan {
	  public static void main(String[] args) {
	    // 구구단 출력
	    printGuGuDan();
	  }
	  
	  public static void printGuGuDan() {
	    for(int i = 2 ; i<=9 ; i++)
	    printDan(i); // 2단 출력
	  }
	  
	  public static void printDan(int dan) {
	    System.out.printf("%d단\n", dan);
	    // dan x 1, dan x 2, ... , dan x 9
	    for (int j = 1; j <= 9; j++) {
	      System.out.printf("\t"); // 들여쓰기
	      System.out.printf("%d x %d = %d\n", dan, j, dan * j);
	    }
	  }
	}