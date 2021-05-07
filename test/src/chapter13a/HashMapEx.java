package chapter13a;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map map = new HashMap();
//		map = new Hashtable();
//		map = new LinkedHashMap();
		
		// 요소 추가
		map.put("name", "홍길동");
		map.put("age", 30);
		map.put("score", 95.5);
		
		// 접근
		System.out.println(map.get("name"));
		System.out.println(map.get("age"));
		
		// 존재하는 키를 사용하는 경우 요소가 변경
		map.put("name", "test");
		System.out.println(map.get("name"));
		
		// Member객체를 밸류로 추가
		Member member = new Member();
		member.setName("홍길동");
		member.setAge(30);
		
		// Key : "member" String, Value : member Member
		map.put("member", member);
		
		// 키가 member인 객체를 가져오기
		Member member2 = (Member)map.get("member"); // 강제형변환
		System.out.println(member2.getName());
		
		// 제네릭 사용
		Map<String, Member> map2 = new HashMap<String, Member>();
		map2.put("member1", member);
		map2.put("member2", member);
		map2.put("member3", member);
		map2.put("member4", member);
		map2.put("member5", member);
		member = new Member(); // 새로운 객체 생성
		map2.put("member6", member); // 다른 객체
		
		Member member3 = map2.get("member1");
		System.out.println(map2.get("member1").getName());
		
		
		
		
		
		
		
	}

}
