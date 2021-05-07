package chapter11;

import java.util.regex.Pattern;

public class PatternEx {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-1223-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		}else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.==w+)?";
		data = "angel@navercom";
		boolean result1 = Pattern.matches(regExp, data);
		if(result1) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		}else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}

	}

}
