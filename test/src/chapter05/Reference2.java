package chapter05;

public class Reference2 {

	public static void main(String[] args) {
		int a = 10 ;
		int b = a ;
		System.out.println(b);
		
		a = 20;
		System.out.println(b);
		
		int [] arr = {10,20,30};
		int [] arr2 =arr; // 메모리의 주소값을 대입.
		System.out.println(arr2[0]);
		
		arr[0] = 40;
		System.out.println(arr2[0]);
		
	}

}
