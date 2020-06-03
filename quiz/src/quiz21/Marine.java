package quiz21;

public class Marine extends Unit{
	public static int attack=6;
	public static int armor=0;
	public Marine(){
		super(0,0,60);
	}
	/*
	 * location()의 기능
	 * 마린의 현재 위치 x, y의 출력
	 */
	public void location() {
		System.out.println("현재 위치 : "+x+", "+y);
	}
	/*
	 * move()의 기능
	 * 1. 현재 좌표값에서 매개변수의 좌표만큼 이동한 거리를 구한다.
	 *    루트 근사값은 Math.sqrt(제곱근)을 이용하면 됩니다.
	 * 2. 현재 좌표값을 매개변수의 좌표값으로 변경
	 * 3. 이동한 거리를 정수형으로 출력
	 * 4. location() 메서드를 호출
	 */
	public void move(int x, int y) {
		int dis=(int)Math.sqrt(Math.pow(Math.abs(x-this.x),2)+Math.pow(Math.abs(y-this.y),2));
		this.x=x;
		this.y=y;
		System.out.println("이동한 거리 : "+dis);
		location();
	}
}
