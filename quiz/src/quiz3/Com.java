package quiz3;

public class Com {
	boolean power=false;
	int gojang=0;
	void power() {
		power=!power;
	}
	void gojang() {
		gojang++;
	}
	void gochim() {
		gojang--;
		if(gojang<0) {
			gojang=0;
		}
	}
	void sangte() {
		System.out.println("전원 : "+(power?"켜짐":"꺼짐"));
		System.out.println("상태 : "+(gojang>0?gojang+"개 고장":"정상"));
	}
}
