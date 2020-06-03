package jdbc.command;

public class Board01 {
	private String rn;
	private String num;
	private String id;
	private String title;
	private String content;
	public Board01() {super();}
	public Board01(int num, String id, String title, String content) {
		super();
		this.num = String.valueOf(num);
		this.id = id;
		this.title = title;
		this.content = content;
	}
	public Board01(String rn, String num, String id, String title, String content) {
		super();
		this.rn = rn;
		this.num = num;
		this.id = id;
		this.title = title;
		this.content = content;
	}
	public String getRn() {
		return rn;
	}
	public void setRn(String rn) {
		this.rn = rn;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}