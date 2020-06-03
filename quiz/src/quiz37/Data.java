package quiz37;

public class Data {
	private String local="";
	private String scale="";
	private int year=0;
	private int month=0;
	private int price=0;
	public Data(String local, String scale, int year, int month, int price) {
		this.local = local;
		this.scale = scale;
		this.year = year;
		this.month = month;
		this.price = price;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getScale() {
		return scale;
	}
	public void setScale(String scale) {
		this.scale = scale;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void print() {
		System.out.println(local+", "+scale+", "+year+", "+month+", "+price);
	}
}
