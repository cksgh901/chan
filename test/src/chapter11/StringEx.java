package chapter11;

public class StringEx {

	public static void main(String[] args) {
		String title = "자바 프로그래밍";
		System.out.println("프로그래밍");
		
		String contents = "너는 이런데, 저렇고 그래서 바보야.";
		System.out.println(contents.indexOf("바보"));
		if(contents.indexOf("바보") > -1){
			System.out.println("바보라는 단어 포함");
		}
		
		String file = "내사진.jpg";
		System.out.println(file.substring(file.indexOf(".")));
		//치환
		System.out.println(title.replace("자바","파이썬"));
		System.out.println(title); 
		//3인덱스 부터 5인덱스 전까지
		System.out.println(title.substring(3,5));
		//공백제거
		System.out.println(title.replace(" ", " "));
		//분해
		String name = " 홍길동, 김길동 , 최길동 , 박길동";
		String[] names = name.split(",");
		System.out.println(names.length);
		
		for(String n : names) {
			System.out.println(n);
		}
		
		String email = "aa@tset.com bb@test.com ccc@test.com";
		String[] emails = email.split(" ");
		for(String n : emails) {
			System.out.println(n);
		}

	}

}
