package chapter06;

import CloudStuding.TopScoreStudent;

public class StudentExample {


	public static void main(String[] args) {
		Student s1 = new Student("ȫ�浿",30);
		//s1.name = "ȫ�浿";
		System.out.println("s1 ������ Student ��ü�� �����մϴ�.");
		
		Student s2 = new Student("��浿", 30);
		s2.name = "��浿";
		System.out.println("s2 ������ �ٸ� Student ��ü�� �����մϴ�.");
		
		System.out.println(s1.name);
		System.out.println(s2.name);
		s1 = new Student(null, 0);
		System.out.println(s1.name);
		
		System.out.println(s1==s2);
	}

}
