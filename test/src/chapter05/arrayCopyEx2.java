package chapter05;

import java.util.Arrays;

public class arrayCopyEx2 {

	public static void main(String[] args) {
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i]+",");
		}
		System.out.println();
		
		String[] new1 = Arrays.copyOf(oldStrArray, 5);

		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(new1[i]+",");
		
				

	}

}
}
