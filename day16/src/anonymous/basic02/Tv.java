package anonymous.basic02;

public class Tv {
	private int volume;
	private RemoteControl remote;
	//게터 세터
	public Tv() {
		//remote 타입을 Tv에 알맞게 익명 개겣 방법으로 초기화 해주세요.
		remote=new RemoteControl() {
			
			@Override
			public void volumeUp() {
				volume++;
				System.out.println("TV의 볼륨 : "+volume);
			}
			
			@Override
			public void volumeDown() {
				volume--;
				System.out.println("TV의 볼륨 : "+volume);
			}
			
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("TV를 켭니다.");
			}
		};
	}
	public RemoteControl getRemote() {
		return remote;
	}
	public void setRemote(RemoteControl remote) {
		this.remote = remote;
	}
}