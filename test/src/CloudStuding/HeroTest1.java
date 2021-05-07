package CloudStuding;

public class HeroTest1 {

	public static void main(String[] args) {
	    // 두 싸움꾼 객체 생성
	    Hero arthas = new Hero("아서스");
	    Hero leona = new Hero("레오나");
	    // 격투 시작
	    Hero.battle(arthas, leona);
	  }
	}
	class Hero {
	  // 필드
	  String name;
	  int hp;
	  // 생성자
	  public Hero(String str) {
	    name = str;
	    hp = 30;
	  }
	  // 메소드(인스턴스 메소드)
	  public void punch(Hero enemy) {
	    System.out.printf("[%s]의 펀치\n", name);
	    enemy.hp -= 10;
	    System.out.printf("\t%s: %d/30\n", enemy.name, enemy.hp);
	  }
	  // 메소드(클래스 메소드)
	  public static void battle(Hero a, Hero b) {
	    // 두 영웅 모두 체력이 남아있다면, 계속 싸움을 진행
	    while (a.hp > 0 && b.hp > 0) {
	      // 1/2 확률로 공격/수비 결정
	      Hero attacker, defender;
	      if (Math.random() < 0.5) {
	        attacker = a;
	        defender = b;
	      } else {
	        attacker = b;
	        defender = a;
	      }
	      // 대상을 공격
	      attacker.punch(defender);
	    }
	  }
	}