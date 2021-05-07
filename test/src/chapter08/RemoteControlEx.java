package chapter08;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		rc.turnON();
		rc.setVolume(1);
		rc.turnOff();
		rc = new Audio();
		rc.turnON();
		rc.setVolume(1);
		rc.setVolume(6);
		rc.turnOff();
		
		RemoteControl.changeBattery();

	}

}
