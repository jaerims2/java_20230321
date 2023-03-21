package product;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		/*
		 * Product class = > 메뉴명, 가격
		 * 
		 * Manager class = 메뉴 등록 list , 주문등록 list 총 2개 - 메뉴 add 기능 (scan) void add - 메뉴
		 * 리스트 출력기능 void printMenu - 제품 주문 기능 (String menu, int count) void orderPick -
		 * 주문내역을 출력 void printOrder
		 * 
		 * 
		 * main : 메뉴 이용해서 출력
		 */

		Scanner scan = new Scanner(System.in);

		program p = new program();
		p.print();

		int input;
		do {
			System.out.println("1. 메뉴추가 2. 메뉴출력 3. 주문하기\n" + "4. 주문내역 5.메뉴수정 6.메뉴 삭제 7. 종료");
			System.out.println(" 입력 :");
			input = scan.nextInt();
			switch (input) {
			case 1:
				p.add(scan);
				break;
			case 2:
				p.menuPrint();
				break;
			case 3:
				System.out.println("== 메뉴를 입력해주세요 ==");
				String food = scan.next();
				System.out.println("== 수량입력 ==");
				int count = scan.nextInt();
				p.orderPick(food, count);
				break;
			case 4:
				p.orderPrint();
				break;
			case 5:
				p.update(scan);
				break;
			case 6:
				p.delete(scan);
				break;
			case 7:
				break;
			default:
				System.out.println("잘못입력하셨습니다");
				break;
			}
		} while (input != 7);
		System.out.println("종료되었습니다");
	}
}
