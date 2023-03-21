package day17;

import java.io.IOException;

public class SystemInTestEx01 {
	public static void main(String[] args) {
		/*
		 * 알파벳 하나를 쓰고 Enter 시 알파벳을 콘솔에 출력
		 */

		System.out.println("알파벳( 1 byte) 여러개 쓰고 Enter : ");
		int i;

		try {
			while ((i = System.in.read()) != '\n') {
//				i = System.in.read();
//				System.out.println(i+" 아스키코드");
				System.out.print((char) i); // 정수형을 char형태로 형변환
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
