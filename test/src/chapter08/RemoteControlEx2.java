package chapter08;

public class RemoteControlEx2 {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			
			
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnON() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
			
			
		};
		
		
		

	}
	private int volume;

	public void turnON() {
		System.out.println("TV�� �մϴ�.");
	}

	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
		
	}
	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VILUME) {
			this.volume = RemoteControl.MAX_VILUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		
		System.out.println("���� TV ���� : "+ this.volume);

	}
	

}


