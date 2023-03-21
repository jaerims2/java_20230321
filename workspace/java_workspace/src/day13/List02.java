package day13;

import java.util.*;

public class List02 {

	public static void main(String[] args) {

		/* 메뉴판 
		 * 1.햄버거 : 7000
		 * 2.피자  : 15000
		 * 3.음료  : 2000
		 * 4.과자 : 2000
		 * 5.사탕 : 500
		 * 6.프로그램 종료
		 * 0.주문 끝내기
		 *  
		 * 메뉴를 선택해주세요 . 1 수량을 선택해주세요 2
		 * => 1번 메뉴 햄버거 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요. 0이 아닌 숫자 다시 메뉴선택
		 * 메뉴 선택해주세요
		 * -> 3번 메뉴 음료2개 
		 * 주문을 끝내시려면 0을 눌러주세요 0
		 * 
		 * 
		 * -선택한 메뉴
		 * 햄버거 2개. 음료 2개 선택 총금액 : ?
		 * 
		 * 
		 * 
		 * 
		 */
	Scanner scan = new Scanner(System.in);
	
	
	
	FoodManager test = new FoodManager();
	int num1=-1;
	int num2=0;
	ArrayList<Integer> order = new ArrayList<>();
	
	
	
	
	
	do { 
		test.addMenu();
		test.print();
		num1 = scan.nextInt();
		if(num1 == 6) {
			System.out.println("< 주문 프로그램 종료 >");
			break;
		}
		if(num1 !=0) {
			if(num1 <6) {
				System.out.println("수량 : ");
				num2 = scan.nextInt();
				test.sale(num1, num2);
				order.add(num1);
				order.add(num2);
				System.out.println();
				System.out.println("주문 종료 = > 0번 ");
		
		}else {
			System.out.println("잘못된 메뉴 ! !");
			}
		}System.out.println(); // 줄바꿈
	} 
	
	while (num1 != 0);
	System.out.println("---주문하신 내역을 확인해주세요 ----");
	
	for(int i =0; i<order.size(); i=i+2) {
	
		System.out.print(test.getMenu().get(order.get(i)-1)+" ");
		System.out.print(order.get(i+1)+" 개 / ");
	}
	System.out.println("계산하실 금액은 "+test.getTtsum());
	
	}

}//main 끝



// 해당list사용 / 

interface Food {
	
	void print();
	void sale();
	void addMenu();
	
}
class FoodManager implements Food {
	
	private ArrayList<String> menu = new ArrayList<>();
	private ArrayList<Integer> menuprice = new ArrayList<>();
	private int sum;
	private int ttsum;
	

	@Override
	public void print() {
		
		System.out.println("========  MENU  ==========");
		System.out.println("   1. 초밥 정식 : 20000 ");
		System.out.println("   2. 돈까스 정식 :  15000 ");
		System.out.println("   3. 우동  : 5000 ");
		System.out.println("   4. 라멘  : 8000 ");
		System.out.println("   5. 가라아게 : 11000 ");
		System.out.println("   6. 종료");
		System.out.println("   메뉴선택 :   ");
		
	}

	@Override
	public void addMenu() {
		
		
		menu.add("초밥 정식");
		menu.add("돈까스 정식");
		menu.add("우동");
		menu.add("라멘");
		menu.add("가라아게");

		menuprice.add(25000);
		menuprice.add(15000);
		menuprice.add(5000);
		menuprice.add(8000);
		menuprice.add(11000);
		
		
	}

	
	
	public void sale(int menu1, int count) {
		sum = menuprice.get(menu1-1)*count;
		ttsum +=sum;
		System.out.println("주문하신 메뉴는 "+ menu.get(menu1-1)+" ");
		System.out.println(count + "개 입니다");
		System.out.println("총 금액 : "+ttsum);
		
	}
	// 멤버변수 : ArrayList 가격 , 메뉴 ( 0번지메뉴 0번지 가격 한 쌍 ), 그 외 알아서
	// 매개변수 : String 메뉴 /Integer 메뉴

	@Override
	public void sale() {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<String> getMenu() {
		return menu;
	}

	public void setMenu(ArrayList<String> menu) {
		this.menu = menu;
	}

	public ArrayList<Integer> getMenuprice() {
		return menuprice;
	}

	public void setMenuprice(ArrayList<Integer> menuprice) {
		this.menuprice = menuprice;
	}
	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getTtsum() {
		return ttsum;
	}

	public void setTtsum(int ttsum) {
		this.ttsum = ttsum;}

}
