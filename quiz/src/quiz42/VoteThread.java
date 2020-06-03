package quiz42;

public class VoteThread implements Runnable{
	/*
	 * 쓰레드 객체 3개 생성되어야 합니다.
	 * run() 메서드 안에서는 랜덤값을 이용해서 개표 진행사항을 화면에 출력합니다.
	 * 조건  : 개표율이 100을 넘어가면 안 됩니다.
	 */
	public void run() {
		int vote=0,num=0;
		StringBuffer sb=new StringBuffer("");
		while(true) {
			if(vote>=100) {
				vote=100;
				System.out.println(Thread.currentThread().getName()+"개표율"+vote+"%:"+sb+"\n"+Thread.currentThread().getName()+"의 개표가 완료되었습니다");
				break;
			}else {
				System.out.println(Thread.currentThread().getName()+"개표율"+vote+"%:"+sb);
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			num=((int)(Math.random()*10)+1);
			vote+=num;
			for(int i=1;i<=num;i++) {
				if(sb.length()<100) {
					sb.append("*");
				}else {
					break;
				}
			}
		}
	}
}