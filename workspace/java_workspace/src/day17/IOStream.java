package day17;

import java.io.IOException;

public class IOStream {

	public static void main(String[] args) {
		
		/* 입력 스트림 출력스트림을 통해 데이터를 입출력합니다.
		 * 스트림 : 단방향으로 데이터가 흘러가는 형태 ( 파이프 ) 
		 * 다양한 입출력 장치에 의해서 입출력이 이루어짐
		 * 다양한 장치에 독립적으로 일관성있는 입출력을 유지하기 위해 입출력스트림을 통해 일관성을 제공한다
		 * 
		 * 두가지 형태의 스트림구분
		 * - 바이트 형태의 스트림 : 기본형태 ( 문자 숫자 영어 그림 멀티미디어 ) = 한글(2byte=한글자)
		 * - 문자 형태의 스트림 : 문자만 입출력할때 사용 (그 밖의 언어)
		 * 
		 * -바이트 스트림 ( 기본 , 최상위 )
		 * - 입력 : InputStream : fileInputStream , BufferInput~ , Data~ ..  
		 * - 출력 : OutputStream : file, Buffered ,Data , PrintStream ..
		 * 
		 *  -문자 스트림 (기본 최상위)
		 *  - 입력 : Reader :  FileReader , Buffered , InputStreamReader ... 
		 *  - 출력 : Writer : FileWriter , Print , Buffered ...
		 * 
		 *  -기반 스트림  / 보조 스트림
		 * - 기반스트림 : 대상에서 직접 자료를 읽고 쓰는 기능이 있는 스트림 
		 * - 보조스트림 : 직접 읽고 쓰는 기능은 없지만 추가적인 기능을 더해주는 스트림
		 * - 기반스트림EX : file 인풋,아웃풋,리더,라이터
		 * - 보조스트림EX : 인풋 리더, 버퍼리더, 버퍼라이터, 퍼버아웃
		 * 
		 */
		
		System.out.println(); // 표준 출력( 모니터 ) 스트림
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 표준 입력 스트림
		
		// 표준 에러 출력(모니터) 스트림 
		System.err.println();
		
	}

}
