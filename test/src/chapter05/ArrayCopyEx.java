package chapter05;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i]+",");
		}
		System.out.println();
		// Arrays 클래스 사용
		String[] new2 = Arrays.copyOf(oldStrArray, 5);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(new2[i]+",");
		}
		System.out.println();
		//new2와 new3
		String[] new3 = new2; // 얕은 복사
		new3[0] = "python";
		for (int i=0;i<new2.length;i++) {
			System.out.print(new2[i]+",");
			
		}
		System.out.println(" ");
		String[] new4 = Arrays.copyOf(new2, 0); //깊은복사
		for (int i=0;i<new2.length;i++) {
			System.out.print(new2[i]+",");
		}
		
		

	}

}
