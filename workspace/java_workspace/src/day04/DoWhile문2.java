package day04;

import java.util.Scanner;

public class DoWhile문2 {

	public static void main(String[] args) {
		/*--------------menu------------(메뉴선택 do)
		 * 1.  저장 |  2. 출력   | 3. 종료
		 *------------------------------
		 *	입력 : 1 (저장)
		 *	저장되었습니다.
		 *	입력 : 2 (출력)
		 *	출력되었습니다.
		 *	입력 : 3 (종료)
		 *	종료되었습니다. 반복문 종료.  
		 */
		Scanner scan = new Scanner(System.in);
		
		int input;
	
		do {
			
			System.out.println("------------menu------------------");
			System.out.println("    1:입력  |  2:출력   |3:종료      ");
			System.out.println("------------menu------------------");
			System.out.println("입력");
			input = scan.nextInt();
			
			switch(input) {
			case 1: 
				System.out.println("저장되었습니다.");
			break;
			case 2:
				System.out.println("출력되었습니다.");
			break;
			case 3:
				System.out.println("종료되었습니다.");
				break;
			default: 
				System.out.println("잘못 입력하셨습니다.");
			break;
			}
		}while(input!=3); // 3과 같지 않을 때 true 
		System.out.println("The End...");
		
		scan.close();
	}

}
