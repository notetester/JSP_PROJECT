package quiz38;

public class Data {
	private long time=0;
	private long productCode=0;
	private String tradeCode="";
	private String productName="";
	private String expimp="";
	private long weight=0;
	private long money=0;
	private long totalWeight=0;
	private long totalMoney=0;
	private long dataTime=0;
	public Data(long time, long productCode, String tradeCode, String productName, String expimp, long weight, long money,
			long totalWeight, long totalMoney, long dataTime) {
		super();
		this.time = time;
		this.productCode = productCode;
		this.tradeCode = tradeCode;
		this.productName = productName;
		this.expimp = expimp;
		this.weight = weight;
		this.money = money;
		this.totalWeight = totalWeight;
		this.totalMoney = totalMoney;
		this.dataTime = dataTime;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public long getProductCode() {
		return productCode;
	}
	public void setProductCode(long productCode) {
		this.productCode = productCode;
	}
	public String getTradeCode() {
		return tradeCode;
	}
	public void setTradeCode(String tradeCode) {
		this.tradeCode = tradeCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getExpimp() {
		return expimp;
	}
	public void setExpimp(String expimp) {
		this.expimp = expimp;
	}
	public long getWeight() {
		return weight;
	}
	public void setWeight(long weight) {
		this.weight = weight;
	}
	public long getMoney() {
		return money;
	}
	public void setMoney(long money) {
		this.money = money;
	}
	public long getTotalWeight() {
		return totalWeight;
	}
	public void setTotalWeight(long totalWeight) {
		this.totalWeight = totalWeight;
	}
	public long getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(long totalMoney) {
		this.totalMoney = totalMoney;
	}
	public long getDataTime() {
		return dataTime;
	}
	public void setDataTime(long dataTime) {
		this.dataTime = dataTime;
	}
	public void print() {
		System.out.println(time+", "+productCode+", "+tradeCode+", "+productName+", "+expimp+", "+weight+", "+money+", "+totalWeight+", "+totalMoney+", "+dataTime);
	}
	public void print(long data) {
		System.out.println(time+", "+productCode+", "+tradeCode+", "+productName+", "+expimp+", "+weight+", "+money+", "+totalWeight+", "+totalMoney+", "+dataTime);
	}
}
