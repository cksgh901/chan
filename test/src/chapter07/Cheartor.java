package chapter07;

public abstract class Cheartor {
	 int hp;
	 int ap;
	
	public Cheartor(int hp , int ap ) {
		this.hp = hp;
		this.ap = ap;
		
		
	}
	
	abstract void test();	
	
	public void att(Cheartor target) {
		if((target.hp-this.ap) < 0) {
			target.hp = 0 ;
		}else {
			target.hp = target.hp-this.ap;
		}
	}
}

