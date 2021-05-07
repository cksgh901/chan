package chapter11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternEx2 {

	public static void main(String[] args) {
		String source = "휴대폰: 010-1111-2222, 집 : 02-1234-5678 , 이메일 : test@gmail.com, 계좌번호:123-45-6789";
		
		String tel_pattern = "(0\\d{1,2})-(\\d{3,4})-(\\{4})";
		
		//1.Pattern 객체
		Pattern p = Pattern.compile(tel_pattern);
		//2. Matcher 객체
		Matcher m = p.matcher(source);
		//3. 추출
		while(m.find()) {
			System.out.println(m.group());
			//그룹별
			System.out.println(m.group(1));
			System.out.println(m.group(2));
			System.out.println(m.group(3));
		}
		
		
	}

}
