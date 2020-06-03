package test;public class RTRETET {
	public static void main(String[] args) {
//		try {
//			Class.forName("java.#$%");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		RTRETET r=new RTRETET();
		try {
			System.out.println(r.sayNick("ddd", -2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String sayNick(String name,int index) throws Exception {
		if(index>4||index<-1) {
			throw new Exception("인덱스 값은 반드시 -1~4의 범위내의 정수로 입력해주세요");
		}
		String[]arr= {"박장군","김원장","진회장","김재명"};
		int ran=(int)(Math.random()*index);
		return name+"별명은 : "+arr[ran]+"입니다";
	}
}