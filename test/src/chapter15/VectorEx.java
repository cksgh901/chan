package chapter15;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector vec = new Vector();
		
		vec.addElement("홍길동");
		vec.addElement(30);
		vec.add("홍길동");
		vec.add(30);
		
		for(int i = 0; i<vec.size();i++) {
			System.out.println(vec.get(i));
		}
	}

}
