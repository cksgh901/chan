package chapter03;

public class Conditional10perationExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'a': ( (score>80)? 'b': 'c');
		System.out.println(score + "점은" + grade + "등급입니다.");

	}

}
