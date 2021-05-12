package chapter12;

public class PriorityEx {

	public static void main(String[] args) {
		for(int i = 1; i<=10 ; i++) {
			Thread thread = new CalcThread("thred" + i);
			if(i != 10) {
				thread.setPriority(thread.MIN_PRIORITY);
			}else {
				thread.setPriority(thread.MAX_PRIORITY);
			}
			thread.start();
		}
			
	}

}
