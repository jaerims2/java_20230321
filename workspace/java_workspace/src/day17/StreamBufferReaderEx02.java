package day17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StreamBufferReaderEx02 {
	public static void main(String[] args) throws IOException {
		/* BufferedReader , PrintWriter
		 * 파일을 읽어들여 복사 후 객체 생성
		 * bufferReader에서 읽고
		 * 
		 * out.txt에서 파일을 읽어서 => out2.txt 로 쓰기
		 * 버퍼(기)
		 * 읽어온걸 txt로 나누기
		 * sub indexof 
		 */
		BufferedReader br = null;
		PrintWriter pw = null;
		
		final String Path_OUT = "Out3.txt";
		System.out.println("복사 시작");
		br= new BufferedReader(new FileReader("Out.txt"));
		pw = new PrintWriter(new FileWriter(Path_OUT));
		
		System.out.println("복사를 위한 객체 생성완료");
		
		String line = "";
		while((line = br.readLine()) != null) {
			System.out.println(line); // 콘솔출력
			pw.println(line);
//			pw.write(line+"\r\n");
			
		}
		System.out.println("텍스트 복사 완료");
//		br.close();
//		pw.close();
		if(br != null ) { // 객체가 생성되었다면 close();
			br.close();
		}
		if(pw != null) {
			pw.close();
		}
	}
	
}
