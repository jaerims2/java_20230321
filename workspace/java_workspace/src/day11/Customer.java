package day11;

public class Customer {
	/* 일반고객 / 그 중 customer상속 받은  
	 * 	Gold 
	 * 	Vip 별도 생성
	 * 고객id : customerID
	 * 고객이름: customerName
	 * 고객등급: customerGrade
	 * 보너스 포인트: bonusPoint
	 * 보너스 적립비율: bonusPatio
	 * 
	 * -customer 객체생성시
	 * 기본 : customerGrade = Silver
	 * 기본 bonusPatio =0.1%
	 *
	 * -메서드
	 * -보너스를 적립하는 계산 (메서드명: calcPride(int price))
	 * -구매금액을 주고, 적립 보너스를 계산 bonusPoint에 누적
	 * -출력 메서드 (메서드명 : customerInfo())
	 * - 홍길동 님의 등급은 VIP이며, 보너스포인트는 1000입니다.
	 * 
	 * -Gold(상속 시 할인에 대한 메서드 추추가)
	 *
	 * 제품금액의 제품을 살 때 10%할인 / 보너스 포인트 2%적립
	 *
	 * -vip 등급 
	 * -제품을 살 때 10% 할인 / 보너스 5% 적립
	 * -전담상담사를 갖는다.
	 * 
	 *   
	 */
	
	protected int  customerID; //고객 아이디
	protected String customerName; // 고객명
	protected String  customerGrade; // 고객등급
	
	protected int bonusPoint;
	protected double bonusRatio;
	
	public Customer() { }
	
	public Customer(String name, int id) {
		customerID = id;
		customerName = name;
		initCustomer();
	}
	public void initCustomer() {
		customerGrade = "silver";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint +=(int)(price * bonusRatio);
		return price;
	}
	
	public String printInfo() {
		return customerName+"님의 등급은 "
				+customerGrade+" 이며,"+" 보너스 포인트는 "+bonusPoint+" 입니다.";
	}
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}


}
