package CloudStuding;

public class InterfaceReview {
  public static void main(String[] args) {
    // 객체 생성
    Sounding dog = new Dog();
    dog.sound();
    Sounding baby = new Baby();
    baby.sound();
    Sounding tiger = new Tiger();
    tiger.sound();
    Sounding robot = new Robot();
    robot.sound();
    // 그룹화: 인터페이스 기준

    }
  }

interface Sounding {
  public void sound();
}
class Dog implements Sounding {
  public void sound() {
    System.out.println("Dog: 멍멍!");
  }
}
class Baby implements Sounding {
  public void sound() {
    System.out.println("Baby: 응애!");
  }
}
class Tiger implements Sounding {
  public void sound() {
    System.out.println("Tiger: 어흥!");
  }
}
class Robot implements Sounding {
  public void sound() {
    System.out.println("Robot: 삐빕!");
  }
}

		
