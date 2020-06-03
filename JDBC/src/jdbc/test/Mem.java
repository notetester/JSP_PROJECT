package jdbc.test;

public class Mem {
	private String id="";
	private String pw="";
	private String name="";
	private String info="";
	public Mem() {super();}
	public Mem(String id, String pw, String name, String info) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.info = info;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
}
