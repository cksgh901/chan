package CloudStuding;

public class PlayerTest {
	  public static void main(String[] args) {
	    // 점수 배열 생성
	    int[] points0 = { 10, 9, 9, 8 };
	    int[] points1 = { 9, 10, 9, 9 };
	    int[] points2 = { 10, 9, 10, 10 };
	    
	    // 선수 객체 생성
	    Player1 p0 = new Player1("Kim", points0);
	    Player1 p1 = new Player1("Lee", points1);
	    Player1 p2 = new Player1("Park", points2);
	    
	    // 객체 배열 만들기
	    Player1[] players = { p0, p1, p2 };
	    
	    // 선수별 총점 출력
	    for (int i = 0; i < players.length; i++) {
	      players[i].printTotalPoints();
	    }
	  }
	}

	class Player1 {
	  // 필드
	  String name;  // 이름
	  int[] points; // 점수
	  
	  // 생성자
	  Player1(String str, int[] arr) {
		  this.name =str;
		  this.points = arr;
	    /* 1. 생성자를 완성하세요. */
	  }
	  
	  // 메소드
	  void printTotalPoints() {
	    /* 2. 형식 문자열을 만드세요. */
	    System.out.printf(name + "->"+ totalPoints()+"점" );
	  }
	  
	  int totalPoints() {
		  int sum = 0;
		  for(int i= 0 ; i<points.length;i++) {
			  sum+= points[i];
		  }
	    return sum;
	  }
	}