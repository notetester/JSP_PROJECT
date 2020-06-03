package anonymous.basic02;

public interface RemoteControl {
	public void turnOn();//켜다
	public void turnOff();//끄다
	public void volumeUp();//소리를 켜다
	public void volumeDown();//소리를 낮추다
	public default void add() {
		System.out.println("추가된것");
	}
}
