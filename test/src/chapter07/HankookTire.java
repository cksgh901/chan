package chapter07;

public class HankookTire extends Tire {
	
	public HankookTire(String location , int maxRotation ) {
		super(location , maxRotation);
	}
	@Override
	public boolean roll() {
		++accumulaterdRotation;
		if(accumulaterdRotation<maxRotation) {
			System.out.println(location+"HankookTire ¼ö¸í: "+(maxRotation-accumulaterdRotation)+"È¸");
			return true;
		}else {
			System.out.println("***"+location+"HankookTire ÆãÅ© ***");
			return false;
		}
	}

}
