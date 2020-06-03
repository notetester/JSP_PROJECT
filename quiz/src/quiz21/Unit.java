package quiz21;

public abstract class Unit {
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
	public abstract void location();
	public abstract void move(int x,int y);
	public void stop() {
		System.out.println("정지");
	}	
}
