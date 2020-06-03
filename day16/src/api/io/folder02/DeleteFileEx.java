package api.io.folder02;

import java.io.File;

public class DeleteFileEx {

	public static void main(String[] args) {
		try {
			File file=new File("D:\\course\\java\\file_test");
			if(file.exists()) {
				file.delete();//delete성공시 true를 반환, 실패시 false를 반환
				System.out.println("파일삭제성공");
			}else {
				System.out.println("파일삭제실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
