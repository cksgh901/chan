package chapter15;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVSLinkedList {

	public static void main(String[] args) {
		//검색(인덱싱) 속도비교
		ArrayList alist = new ArrayList();
		LinkedList llist = new LinkedList();
		
		for(int i = 0 ; i<10000;i++) {
			alist.add(i);
			llist.add(i);
		}
		
		long start = System.currentTimeMillis();
		for (int i = 0; i<alist.size();i++) {
			alist.get(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList : " +(end-start));
	
		start = System.currentTimeMillis();
		for(int i = 0 ;i<llist.size();i++) {
			llist.get(i);
		}
			end = System.currentTimeMillis();
			System.out.println("LinkedList :" +(end-start));
			

	
	}
	}


