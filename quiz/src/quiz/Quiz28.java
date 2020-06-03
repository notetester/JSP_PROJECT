package quiz;

public class Quiz28 {
	public static void main(String[] args) {
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.printf((3*i-2)+" x "+j+" = "+(3*i-2)*j+"\t"+(3*i-1)+" x "+j+" = "+(3*i-1)*j+"\t"+(3*i)+" x "+j+" = "+(3*i)*j+"\n");
//			}
//			System.out.println();
//		}
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=9;j++) {
				for(int k=2;k>=0;k--) {
					System.out.printf((3*i-k)+" x "+j+" = "+(3*i-k)*j+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
