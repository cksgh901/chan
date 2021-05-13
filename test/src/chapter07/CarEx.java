package chapter07;

public class CarEx {

	public static void main(String[] args) {
		Car car= new Car();
		
		for(int i= 0 ; i<=5 ; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("�տ��� HankkokTire�� ��ü");
				car.frontLeftTire = new HankookTire("�տ���", 15);
				break;
			case 2:
				System.out.println("�տ����� KumhoTire�� ��ü");
				car.frontRightTire = new KumhoTire("�տ�����", 13);
				break;
			case 3:
				System.out.println("�ڿ��� HankkokTire�� ��ü");
				car.backLeftTire = new HankookTire("�ڿ���", 14);
				break;
			case 4:
				System.out.println("�ڿ����� KumhoTire�� ��ü");
				car.backRightTire = new KumhoTire("�ڿ�����", 13);
				break;
			}
			System.out.println("------------------------------");
		}

	}

}
