package jdbc.test;
public class RecomC {
	private int rCNum=0;
	private int cNum=0;
	private String id="";
	public RecomC(){super();}
	public RecomC(int rCNum, int cNum, String id) {
		super();
		this.rCNum = rCNum;
		this.cNum = cNum;
		this.id = id;
	}
	public int getrCNum() {
		return rCNum;
	}
	public void setrCNum(int rCNum) {
		this.rCNum = rCNum;
	}
	public int getcNum() {
		return cNum;
	}
	public void setcNum(int cNum) {
		this.cNum = cNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}