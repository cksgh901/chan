package chapter14;

public class AddEx {

	public static void main(String[] args) {
		Add add = (int x, int y) ->x+y;
		
		int r = add.add(10,20);
		System.out.println(r);
		
		Add add2 = new Add() {
			@Override
			public int add(int x , int y) {
				return x+y;
			}
		};
		int r2 = add2.add(10, 20);
		System.out.println(r2);
		
		Add add3 = new AddInpul();
		int r3 = add3.add(10, 20);
		System.out.println(r3);
	}
	
	

}
