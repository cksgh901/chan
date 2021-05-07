package chapter13a;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListEx {

	public static void main(String[] args) {
		
		List list = new ArrayList(); // ArrayList 객체 생성
//		list = new Vector();
//		list = new LinkedList();
		
		System.out.println(list.size()); // 길이
		// 요소 추가
		list.add("홍길동");
		list.add(30);
		list.add(3.14);
//		list.add(0,"test");
		
		System.out.println(list.size());
		
		// 첫번째요소 출력
		System.out.println(list.get(0));
		
		// for문으로 출력
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// Member 객체를 이용한 ArrayList객체 생성
		List memberList = new ArrayList(); // ArrayList 객체 생성
		Member member = new Member(); // Member 객체 생성
		member.setName("홍길동");
		member.setAge(30);
		
		// ArrayList객체 안에 Member객체 추가
		memberList.add(member); // 자동형변환
		memberList.add(member);
		memberList.add(member);
		memberList.add(member);
		memberList.add(member);
		
		// 5개의 Member객체 for문을 통해 이름, 나이 출력
		for (int i=0; i<memberList.size(); i++) {
			Member m = (Member)memberList.get(i); // 강제형변환
			System.out.println(m.getName() + " : "+m.getAge());
		}
		
		// 5번째 Member객체의 이름을 김길동이라고 변경
		((Member)memberList.get(4)).setName("김길동");
		
		for (int i=0; i<memberList.size(); i++) {
			Member m = (Member)memberList.get(i); // 강제형변환
			System.out.println(m.getName() + " : "+m.getAge());
		}
		
		// Member 객체(만)을 담을 ArrayList 객체
		List<Member> memberList2 = new ArrayList<Member>();
		memberList2.add(member); // 컴파일러가 강한 타입 체크
		memberList2.add(member);
		memberList2.add(member);
		memberList2.add(member);
		memberList2.add(member);
		
		// for문으로 출력
		for (int i=0; i<memberList2.size(); i++) {
			// 강제형변환 불필요
			System.out.println(memberList2.get(i).getName() + " : " + memberList2.get(i).getAge());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
