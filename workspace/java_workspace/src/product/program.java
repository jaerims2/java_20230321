package product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program implements ProgramManager1 {

	private ArrayList<Product> menu = new ArrayList<>();
	private ArrayList<Order> order = new ArrayList<>();
	List<String> list = new ArrayList<String>();

	public void print() {
		menu.add(new Product("초밥", 20000));
		menu.add(new Product("치킨", 22000));
		menu.add(new Product("돈까스", 10000));
		menu.add(new Product("콜라", 2000));
		menu.add(new Product("회덮밥", 8000));
	}

	@Override
	public void add(Scanner scan) {

		System.out.println("> 메뉴 입력");
		String menu = scan.next();
		System.out.println("> 가격 입력");
		int price = scan.nextInt();
		Product p = new Product(menu, price);
		this.menu.add(p);
		System.out.println("등록이 완료되었습니다.");
	}

	@Override
	public void menuPrint() {
		// 메서드로 print 를 만들어 놓은 경우
		// tmp. 메서드명();
		for (Product tmp : menu) {
			System.out.println(tmp);
		}
	}

	@Override
	public void orderPrint() {

		int sum = 0;
		for (Order tmp : order) {
			tmp.print();
			sum += tmp.getTotal();
		}
		System.out.println("총 주문금액 : " + sum);
	}

	@Override
	public void orderPick(String food, int count) {

		for (int i = 0; i < menu.size(); i++) {
			if (menu.get(i).getFood().equals(food)) {
				int price = menu.get(i).getPrice();
				Order o = new Order(food, price);
				o.setCount(count);
				o.setPrice(price);
				o.setTotal(price * count);
				order.add(o);
			}
		}
	}

	@Override
	public void delete(Scanner scan) {
		int index = -1;

		System.out.println("삭제할 메뉴를 입력해 주세요");
		String food = scan.next();
		for (int i = 0; i < menu.size(); i++) {
			if (menu.get(i).getFood().equals(food)) {
				menu.remove(i);
				System.out.println(food + "메뉴가 삭제되었습니다");
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("등록되지 않은 메뉴입니다.");
			return;
		}

	}

	@Override
	public void update(Scanner scan) {
		int index = -1;

		System.out.println("수정할 메뉴를 입력하세요.");
		String food = scan.next();
		System.out.println("수정할 가격을 입력하세요");
		int price = scan.nextInt();

		for (int i = 0; i < menu.size(); i++) {
			if (menu.get(i).getFood().equals(food)) {
				Product p = new Product(food, price);
				menu.set(i, p);
				index = i;
				System.out.println("수정이 완료되었습니다");
				break;
			}
		}
		if (index == -1) {
			System.out.println("등록되지 않은 메뉴입니다.");
			return;
		}
	}

}
