package chapter07;

public class KumhoTire extends Tire {
	public KumhoTire(String location , int maxRotation ) {
		super(location , maxRotation);
	}
	@Override
	public boolean roll() {
		++accumulaterdRotation;
		if(accumulaterdRotation<maxRotation) {
			System.out.println(location+"KumhoTire ¼ö¸í: "+(maxRotation-accumulaterdRotation)+"È¸");
			return true;
		}else {
			System.out.println("***"+location+"KumhoTire ÆãÅ© ***");
			return false;
		}
	}

}



