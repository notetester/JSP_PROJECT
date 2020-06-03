package quiz24;

public class Bag implements IBag{
	
	private String[]bag=new String[100];
	private int count=0;

	@Override
	public void insert(String item) {
		if(this.count==100) {
			System.out.println("가방이 꽉 찼습니다.");
		}else {
			this.bag[this.count++]=item;			
		}
	}

	@Override
	public void print() {
		System.out.println("=====가방 안 목록=====");
		for(int i=0;i<this.count;i++) {
			System.out.println(this.bag[i]);
		}
		System.out.println("==================");
	}

	@Override
	public int search(String item) {
		for(int i=0;i<this.count;i++) {
			if(item.equals(this.bag[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean delete(String item) {
		for(int i=0;i<this.count;i++) {
			if(item.equals(this.bag[i])) {
				for(int j=i;j<this.count-1;j++) {
					this.bag[j]=this.bag[j+1];
				}
				this.count--;
				return true;
			}
		}
		return false;
	}

}
