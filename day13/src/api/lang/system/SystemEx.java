package api.lang.system;
public class SystemEx {
	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		long sum=0;
		for(long i=1;i<=10000000000L;i++) {
			sum+=i;
		}
		long end=System.currentTimeMillis();
		System.out.println("합계 : "+sum);
		System.out.println("실행소요시간:"+(end-start)*0.001);
	}
}