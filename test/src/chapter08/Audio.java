package chapter08;

public class Audio implements RemoteControl {
	private int volume;

	@Override
	public void turnON() {
		System.out.println("Audio�� �մϴ�.");

	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");

	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VILUME) {
			this.volume = RemoteControl.MAX_VILUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
			
		}else {
			this.volume = volume;
		}
		System.out.println("���� Audio ����" + this.volume);

	}

}
