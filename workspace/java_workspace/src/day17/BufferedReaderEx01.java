package day17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx01 {

	public static void main(String[] args) throws IOException {

		/* BufferedReader : 문자 보조스트림 (버퍼는 모두 보조스트림)
		 * 라인단위로 읽기 가능(기반스트림은 1글자)
		 * 더 이상 읽을 라인이 없을 경우 null을 return
		 * 보조스트림 : 직접 읽고 쓰는 기능이 없음
		 * 보조스트림을 사용할 경우 생성자에 기반스트림을 매개 변수로 포함.
		 */
		BufferedReader br = 
				//new 버퍼(new 기반("파일 속성 경로\\파일명"));
				new BufferedReader(
						new FileReader("C:\\Users\\EZENIC-148\\Desktop\\Out2.txt")); // new 기반스트림
		while(true) {
			String line = br.readLine(); // 한라인씩 읽어들임.
			if(line == null) { // 더이상 읽을 라인이 없을 ㄱ여우
				break; // while문 빠져나감
			}
			System.out.println(line);
		}
		br.close();
	}

}
