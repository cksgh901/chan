package chapter11;

public class Lotto {


	public static void main(String[] args) {
		int[] lotto = new int [6];
		boolean run = true;
		int index = 0;
		
		while (run) {int num = (int)(Math.random()*45)+1;
		boolean isDup = false;
		for(int i=0; i<lotto.length; i++) {
			if(lotto[i]== num) {
				isDup=true;
				break;
			}
			
		}
		if(isDup == false) {
			lotto[index]=num;
			index++;
		}
		if(index == 6) break;
		}
	for (int v : lotto) {
		System.out.println(v);
	}

	}

}
