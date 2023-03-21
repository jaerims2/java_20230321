package day15;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {

		SaleManager sm = new SaleManager();
		Scanner scan= new Scanner(System.in);
		int menu = -1;
		
		do {
			
			System.out.println("1. 메뉴추가 2. 메뉴출력 3. 주문하기\n" 
			+ "4. 주문내역 5.메뉴수정 6.메뉴 삭제 7. 종료");
			menu = scan.nextInt();
			switch(menu) {
			case 1: sm.add(); break;
			case 2: sm.printProduct(); break;
			case 3: sm.orderPick(scan); break;
			case 4: sm.orderPrint();break;
			case 5: break;
			case 6: break;
			case 7: break;
			default: System.out.println("잘못 입력");
			}
			
		} while(menu!=7);
		System.out.println("종료되었습니다.");
	}

}
