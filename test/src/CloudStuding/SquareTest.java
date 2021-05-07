package CloudStuding;

public class SquareTest {
	  public static void main(String[] args) {
	    /* 객체 생성 */
	    
	    /* 필드 초기화(값 변경) */
	    
	    Square s = new Square();
	    s.length = 4;
	    
	    System.out.printf("한 변의 길이가 %d 인 정사각형의 넒이: %d",s.length ,s.area());
	    
	    
	    /* 결과 출력 */
	    
	  }
	  
	    }
class Square{
	int length;
	public int area() {
		return length*length;
	  }
	}