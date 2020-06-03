package quiz21;

public class Tank extends Unit{
	public Tank(){
		super(0,0,100);
	}
	//location()과 move()의 기능은 동일
	public void location() {
		System.out.println("현재 위치 : "+x+", "+y);
	}
	public void move(int x, int y) {
		int dis=(int)Math.sqrt(Math.pow(Math.abs(x-this.x),2)+Math.pow(Math.abs(y-this.y),2));
		this.x=x;
		this.y=y;
		System.out.println("이동한 거리 : "+dis);
		location();
	}
	public void changeMode() {}
}
