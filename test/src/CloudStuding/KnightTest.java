package CloudStuding;

public class KnightTest {

	public static void main(String[] args) {
		 // 객체 생성
		Knight knight = new Knight("돈키호테", 80);
	    // 정보 출력
		System.out.println("Knight{name :" + knight.getName()+", hp :"+ knight.gethp()+"}");
		System.out.println("Knight{name :" + knight.getName()+", hp :"+ knight+"}");
	    // 체력 증가: 기존 체력 + 30
		
	    // 결과 출력
	  }
	}

	class Knight {
	  // 필드
		private String name;
		private int hp ;
	  // 생성자
	 Knight(String name , int hp){
			this.name=name;
			this.hp = hp;
			System.out.println("[객체 생성]");
		}
	  // 게터
		public String getName() {
			return this.name;
		}
		public int gethp() {
			return this.hp;
		}
	  // 세터
		public void setName() {
			this.name = name;
		}
		public void sethp() {
			this.hp = hp+30;
			System.out.println("[체력 증가 +hp+30+]");
			
		}
	}

	


