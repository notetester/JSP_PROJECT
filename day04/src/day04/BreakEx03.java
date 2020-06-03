package day04;

public class BreakEx03 {
	public static void main(String[] args) {
//		boolean bool=false;
//		for(char u='A';u<='Z';u++) {
//			for(char l='a';l<='z';l++) {
//				System.out.println(u+"-"+l);
//				if(l=='c') {
//					bool=true;
//					break;
//				}
//			}
//			if(bool) { break;}
//		}
		start:for(char u='A';u<='Z';u++) {
			for(char l='a';l<='z';l++) {
				System.out.println(u+"-"+l);
				if(l=='c') {
					break start;
				}
			}
		}
	}
}
