package quiz21;

public class DropShip extends Unit{
	public Unit[]unit=new Unit[8];
	public int index=0;
	public DropShip(){
		super(0,0,60);
	}
	/*
	 * location()의 기능은 동일합니다
	 */
	public void location() {
		System.out.println("현재 위치 : "+x+", "+y);
	}
	/*
	 * move()은 마린과 동일함
	 * 단, 수송선이 이동하면, 수송선 배열에 있는 모든 유닛의 위치를 수송선의 위치로 바꾼다.
	 */
	public void move(int x, int y) {
		int dis=(int)Math.sqrt(Math.pow(Math.abs(x-this.x),2)+Math.pow(Math.abs(y-this.y),2));
		this.x=x;
		this.y=y;
		System.out.println("이동한 거리 : "+dis);
		for(int i=0;i<this.unit.length;i++) {
			if(this.unit[i]!=null) {
				this.unit[i].x=x;
				this.unit[i].y=y;
			}
		}
		location();
	}
	/*
	 * void ride(모든 유닛을 받도록 선언)
	 * 1. 배열의 크기는 8이고, 수송선은 배열에는 탱크와, 마린이 탈 수 있다.
	 *    탱크는 배열을 4칸씩 사용한다. 마린은 배열을 1칸씩 사용
	 * 2. 배열에 유닛이 탈 수 있으면 유닛을 배열에 저장합니다.(탱크가 배열에 타면 인덱스를 4칸 처리)
	 *    배열이 전부 차거나, 탈 수 있는 공간이 없으면 "수송선에 공간이 부족합니다"를 출력
	 * 3. 수송선에 탄 유닛을 가로로 출력한다.
	 * main에서 Marine객체 4마리 생성, 탱크 2대, 수송선 1대 생성하고, 수송선에 넣어서 확인
	 */
	public void ride(Unit unit) {
		if(this.index>7) {
			System.out.println("수송선에 공간이 부족합니다.");
		}else if(unit instanceof Marine) {
			this.unit[this.index++]=unit;
		}else if(this.index>4) {
			System.out.println("수송선에 공간이 부족합니다.");
		}else if(unit instanceof Tank) {
			this.unit[this.index]=unit;
			this.index+=4;
		}
		System.out.println("수송 상태");
		System.out.print("[");
		for(int i=0;i<this.unit.length;i++) {
			if(this.unit[i]!=null) {
				if(this.unit[i] instanceof Marine) {
					System.out.print("마린");
					if(i<this.index-1) {
						System.out.print(", ");
					}
				}else if(this.unit[i] instanceof Tank) {
					System.out.print("탱크");
					if(i<this.index-4) {
						System.out.print(", ");
					}
				}
			}
		}
		System.out.println("]");
	}
}