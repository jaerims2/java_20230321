package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	// 제네릭으로 class 선언시 호출한곳에서 타입설정 해주어야함.
	Scanner scan = new Scanner(System.in);
	private ArrayList<Sale<String, Integer>> p = new ArrayList<>();
	private ArrayList<Sale<String, Integer>> o = new ArrayList<>();

	public void add() {

		System.out.println("제품명 : ");
		String menu = scan.next();
		System.out.println("가격 : ");
		int price = scan.nextInt();
		Sale s = new Sale(menu, price); // 노란 밑줄은 안고 가야함
		p.add(s);
	}

	public void printProduct() {

		System.out.println("== menu ==");
		for (int i = 0; i < p.size(); i++) {
			System.out.println(i + 1 + ". " + p.get(i));
		}
	}

	public void orderPick(Scanner scan) {
		System.out.println("주문 메뉴");
		String order = scan.next();

		int index = -1;
		System.out.println("주문 수량");
		int count = scan.nextInt();
		for (int i = 0; i < p.size(); i++) {
			if (p.get(i).getMenu().equals(order)) {
				int price = p.get(i).getPrice();
				Sale os = new Sale(order, price * count);
				o.add(os);
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("찾는 메뉴가 없습니다.");
		}

	}

	public void orderPrint() {
		int sum = 0;
		
		System.out.println(o);
		for(Sale tmp : o) {
			sum = sum + (Integer)tmp.getPrice(); // 연산 필요 => 형변환해서 대입
		}
		System.out.println("총 금액 : "+ sum);
	}
	
	public void addPrint() {
	
	}
}
