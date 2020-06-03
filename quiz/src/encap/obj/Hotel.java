package encap.obj;

public class Hotel {
	private Employee emp=new Employee();
	private Chef chef=new Chef();
	public Hotel() {
		this.emp=new Employee();
		this.chef=new Chef();
	}
	//setter, getter
	public void setEmp(Employee emp) {
		this.emp=emp;
	}
	public Employee getEmp() {
		return this.emp;
	}
	public void setChef(Chef chef) {
		this.chef=chef;
	}
	public Chef getChef() {
		return this.chef;
	}
}
