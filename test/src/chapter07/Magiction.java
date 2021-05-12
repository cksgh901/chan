package chapter07;

public class Magiction extends Cheartor{
		Magiction(int hp , int ap) {
			super(hp,ap);
		}
		
	public void skill(Cheartor target) {
		if((target.hp = target.hp - (this.ap+30))< 0) {
			target.hp = 0;
		}else
		target.hp = target.hp - (this.ap+30);
	}

	@Override
	void test() {
		// TODO Auto-generated method stub
		
	}
		
		
		
}

