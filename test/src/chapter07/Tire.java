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
			System.out.println(location+ "Tire ����: "+ (maxRotation-accumulaterdRotation)+ "ȸ");
			return true;
		}else {
			System.out.println("***"+ location+"Tire ��ũ ***");
			return false;
		}
		}
		
	}
	

