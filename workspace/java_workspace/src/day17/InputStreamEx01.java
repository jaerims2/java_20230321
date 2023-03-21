package day17;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamEx01 {

	public static void main(String[] args) throws IOException {
		//FileInputStream : byte 단위 기반스트림
		
		byte[] b= new byte [1024];
		FileInputStream input = new FileInputStream("Out.txt");
		input.read(b);
//		String data = new String(b);
//		System.out.println(data);
		System.out.println(new String(b)); // byte 배열을 문자열로 변경하여 출력
		input.close();
	}
}
 