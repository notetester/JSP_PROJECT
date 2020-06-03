package quiz23;

public class BugsMusic implements SongList{
	private String[]list=new String[100];
	private int count=0;
	/*
	 * SongList 인터페이스를 상속받습니다.
	 * 마음대로~
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
		System.out.println("리스트 순서대로 모든 곡을 재생합니다.");
		for(int i=0;i<this.count;i++) {
			System.out.println("["+this.list[i]+"]을 재생합니다.");
		}
	}
	@Override
	public void playLength() {
		System.out.println("총 "+this.count+"개의 곡이 있습니다.");
	}
}
