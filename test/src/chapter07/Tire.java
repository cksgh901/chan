package chapter07;

public class Tire {
	public int maxRotation;
	public int accumulaterdRotation;
	public String location;
	
	public Tire(String location , int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
		public boolean roll() {
		++accumulaterdRotation;
		if(accumulaterdRotation<maxRotation) {
			System.out.println(location+ "Tire ¼ö¸í: "+ (maxRotation-accumulaterdRotation)+ "È¸");
			return true;
		}else {
			System.out.println("***"+ location+"Tire ÆãÅ© ***");
			return false;
		}
		}
		
	}
	

