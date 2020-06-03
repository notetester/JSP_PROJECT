package encap.obj;

public class MainClass {
	public static void main(String[] args) {
		Hotel h=new Hotel();
		h.setEmp(new Employee());
		h.getEmp().work();
//		Employee e=h.getEmp();
//		h.setEmp(e);
//		e.work();
		h.setChef(new Chef());
		h.getChef().cook();
		Chef c=new Chef();
		h.setChef(c);
	}
}
