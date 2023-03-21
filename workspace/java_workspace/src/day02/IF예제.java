package day02;

import java.util.Scanner;

public class IF예제 {

	public static void main(String[] args) {
		
		/*정수를 입력 받아서 정수가 짝수 or홀수인지 판단하여 출력
		 * 
		 */
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("값을 입력하여주세요 (정수 범위)");
	
	
	int input = scan.nextInt();
	
	if(input == 0) { 
		System.out.println(input+" 은 0입니다");
	
	}else if(input%2 == 0) {
		System.out.println(input+" 은 짝수입니다.");
	} else {
		System.out.println(input+" 은 홀수입니다.");
		
		

	}
	scan.close();
	}
}