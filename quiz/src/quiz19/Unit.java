package quiz19;

public class Unit {
	public int x=0;
	public int y=0;
	public int hp=0;
	public Unit() {
		this.x=0;
		this.y=0;
		this.hp=0;
	}
	public Unit(int x, int y, int hp) {
		this.x = x;
		this.y = y;
		this.hp = hp;
	}
	public void location() {
		System.out.println("x:"+x+", y:"+y);
	}
	public void move(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void stop() {}	
}
