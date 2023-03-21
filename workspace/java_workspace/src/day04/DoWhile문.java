package day04;

import java.util.Scanner;

public class DoWhile문 {

	public static void main(String[] args) {
		/* for ,while문은 조건식이 한번도 실행이 안될수가 있음.
		 * do	{ //t/f상관없이 무조건 한번은 실행되는 문구.
		 * 		실행문; 
		 *  	} while(조건문); // 조건식 필수..
		 * 값을 입력하면 그대로 출력하는 구문.
		 * 단. y Y가 입력되면 종료.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		char ch;
		
		do {
			System.out.println("문자를 입력해주세요(y:Y 종료)");
			ch = scan.next().charAt(0);
			System.out.println("입력하신 문자는 "+ch+ "입니다");
			if(ch=='y' || ch=='Y') {
				
				System.out.println("종료되었습니다.");
				break;
			}
		} while(true);
		
		
			
				
		scan.close();
		
		
	}

}
