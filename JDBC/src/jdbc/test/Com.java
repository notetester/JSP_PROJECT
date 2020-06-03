package jdbc.test;

import java.sql.Timestamp;

public class Com {
	private int cNum=0;
	private int bNum=0;
	private String id="";
	private String content="";
	private Timestamp regDate=null;
	public Com() {super();}
	public Com(int cNum, int bNum, String id, String content, Timestamp regDate) {
		super();
		this.cNum = cNum;
		this.bNum = bNum;
		this.id = id;
		this.content = content;
		this.regDate = regDate;
	}
	public int getcNum() {
		return cNum;
	}
	public void setcNum(int cNum) {
		this.cNum = cNum;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getRegDate() {
		return regDate;
	}
	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
}