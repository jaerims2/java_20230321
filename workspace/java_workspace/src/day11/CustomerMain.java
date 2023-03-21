package day11;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer[] customerList = new Customer[10];
		
		
		
		
		
		Customer a = new Customer("신재림",10001);
		Customer b = new VipCustomer(10101,"토레타",124546);
		Customer g = new GoldCustomer(15454,"이현지");
		
		// 업캐스팅 => 묵시적인 형변환이 가능
		// 다운캐스팅 => 반드시 명시적 형변환 해야함.(자식클래스에만 있는 변수=callID)
		// instanceof(boolean) : 원래 인스턴스의 형이 맞는 여부를 체크하는 명령어 true / false
		
		
		
		if(g instanceof VipCustomer) {
		VipCustomer v = (VipCustomer)b;
		v.getCallID();
		} else if(g instanceof GoldCustomer) {
			GoldCustomer v = (GoldCustomer)g; 
			v.getSaleRatio();
		}else {
			System.out.println("error");
		}
		
		
		
		
		
		int cnt=0;
		
		customerList[cnt]= a;
		cnt++;
		customerList[cnt]= b;
		cnt++;
		customerList[cnt]= g;
		cnt++;
		
		System.out.println("----고객 정보 출력 -----");
		for(int i =0; i <cnt; i++) {
			System.out.println(customerList[i].printInfo());
		}
		System.out.println("------할인율과 포인트 계산 -----");
		int price = 1000000;
		
		for(int i =0;i<cnt; i++) {
			System.out.println(customerList[i].getCustomerName()+" 님이 지불하실 금액은 "+customerList[i].calcPrice(price)+"원 입니다.");
			System.out.println(customerList[i].getCustomerName()+"님의 포인트 : "+customerList[i].bonusPoint);

		}
//		a.calcPrice(121313);
//		System.out.println(a.printInfo());
//		a.calcPrice(9999);
//		System.out.println(a.printInfo());
//		System.out.println(b.printInfo());
//		
//		//배열을 만들어서 
//		//골드 할인된 금액
//		System.out.println("==== 할인율과 포인트 계산 =====");
//		int price = 100000;
//		int cost = a.calcPrice(price);
//		System.out.println(a.getCustomerName()+"님이 지불하실 금액은 "+ cost +"원입니다.");
//		System.out.println(a.getCustomerName()+"님의 현재 포인트는"+ a.bonusPoint);
//		
//		int cost2 = b.calcPrice(price);
//		System.out.println(b.getCustomerName()+"님이 지불하실 금액은 "+ cost2+"원 입니다.");
//		System.out.println(b.getCustomerName()+"님의 현재 포인트는"+ b.bonusPoint);
//		
	}

}
