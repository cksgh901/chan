package CloudStuding;

import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

public class SimpleLottoMachine {
  public static void main(String[] args) {
	 
    // 45개의 공을 만든다
	  ArrayList<Integer> list = new ArrayList<Integer>();
	  for(int i = 1 ;i<=45; i++) {
	  list.add(i);
	  }
    
    // 섞는다
	  Collections.shuffle(list);
    
    // 뽑는다
	  int[] arr = new int[6];
	  for(int i = 0; i<arr.length;i++) {
		  arr[i] = list.get(i);
	  }
	  String result = Arrays.toString(arr); 

    
    // 결과 출력
	  System.out.println(result);
  }
}