package jdbc.test;
public class RecomB {
	private int rBNum=0;
	private int bNum=0;
	private String id="";
	public RecomB(){super();}
	public RecomB(int rBNum, int bNum, String id) {
		super();
		this.rBNum = rBNum;
		this.bNum = bNum;
		this.id = id;
	}
	public int getrBNum() {
		return rBNum;
	}
	public void setrBNum(int rBNum) {
		this.rBNum = rBNum;
	}
	public int getbNum() {
		return bNum;
	}
	public void setbNum(int bNum) {
		this.bNum = bNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}