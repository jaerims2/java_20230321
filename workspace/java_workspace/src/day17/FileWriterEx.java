package day17;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {

		/* 문자 기반 스트림 
		 */
		FileWriter fw = new FileWriter("test.text");
		// \r\n 다음줄의 맨 앞에 커서 위치 
		for(int i = 1; i<=10; i++) {
			String data = i+ " test \r\n";
			fw.write(data);
		}
		fw.close();
		// 파일 추가모드로 열기
		// ("파일명" , true(기본false값))
		FileWriter fw1 = new FileWriter("test.text", true);
		for(int i =11; i <=20; i++) {
			String data = i+" test append1 \r\n";
			fw1.write(data);
		}
		fw1.close(); // 각각의 Stream 이 끝나면 꼭 닫아주기
	}
}
