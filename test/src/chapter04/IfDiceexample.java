package chapter04;

public class IfDiceexample {

	public static void main(String[] args) {
		
	int num =(int)(Math.random()*6)+1;
	
	if(num==1) {
		System.out.println("1번이 나왔습니다.");
	}else if(num==2) {
		System.out.println("2번이 나왔습니다.");		
	}else if(num==3) {
		System.out.println("3번이 나왔습니다.");		
    }else if(num==4 ) {
    	System.out.println("4번이 나왔습니다.");
    }else if(num==5) {
    	System.out.println("5번이 나왔습니다.");    	
    }else{
    	System.out.println("6번이 나왔습니다.");    	
	
	}

	
	
	//동전을 던저 0이면 앞면 1이면 뒷면 출력
	
	int coin = (int)(Math.random()*2);
	System.out.println(coin);
	if (coin==0) {
		System.out.println("앞면");
	}else {
		System.out.println("뒷면");
		
	}
	
	
	}


}