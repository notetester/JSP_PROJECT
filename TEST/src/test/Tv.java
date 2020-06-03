package test;

public class Tv {
	private boolean power;
	private int channel;
	private int prevChannel;
	private int volume;
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
		if(this.power) {
			System.out.println("전원 켜짐");
		}else {
			System.out.println("전원 꺼짐");
		}
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		setPrevChannel(this.channel);
		this.channel = channel;
	}
	public int getPrevChannel() {
		return prevChannel;
	}
	public void setPrevChannel(int prevChannel) {
		this.prevChannel = prevChannel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume>100||volume<1) {
			System.out.println("1-100까지의 범위내만 설정 가능합니다.");
		}else {
			this.volume = volume;
		}
	}
	
}
