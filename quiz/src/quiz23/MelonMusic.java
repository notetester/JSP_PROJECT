package quiz23;

public class MelonMusic implements SongList{
	private String[]list=new String[100];
	private int count=0;
	/*
	 * SongList 인터페이스를 상속받아서 기능을 구현합니다.
	 * insertList()는 list배열에 순서대로 저장
	 * playList() list의 음악을 랜덤하게 출력
	 * playLength()는 저장된 음악의 개수를 반환
	 */
	@Override
	public void insertList(String name) {
		if(this.count==100) {
			System.out.println("더 이상 곡을 넣을 수 없습니다.");
		}else {
			this.list[this.count]=name;
			this.count++;
		}
	}
	@Override
	public void playList() {
		System.out.println("총 음악 갯수 만큼인 "+this.count+"번 중복 허용으로 랜덤 재생합니다.");
		for(int i=0;i<this.count;i++) {
			System.out.println("["+this.list[(int)(Math.random()*this.count)]+"]을 재생합니다.");
		}
	}
	@Override
	public void playLength() {
		System.out.println("총 "+this.count+"개의 곡이 있습니다.");
	}
}
