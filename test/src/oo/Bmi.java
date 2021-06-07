package oo;

public class Bmi {
	 
public static void main(String[] args) {
 
double height = 180;
double weight = 80;
// 메서드 호출 및 출력
System.out.println(bmi(height, weight));
}

<<<<<<< HEAD
 public static double bmi(double height, double weight) {
	 double bmi=weight/(height/100*height/100);
	
	if(bmi>25) {
		System.out.println("비만");
	}else if(bmi>18.5) {
	System.out.println("표준");
	}else if(bmi<18.5) {
		System.out.println("저체중");
	}
	return bmi; 
=======
 public static String bmi(double h, double w) {
	 h=h/100;
	 double r =w/Math.pow(h, 2);
	
	if(r>25) {
	return "비만";
	}else if(r>18.5) {
	return "표준";
	}else if(r<18.5) {
	}return "저체중";
	
>>>>>>> refs/remotes/origin/master
}
}


