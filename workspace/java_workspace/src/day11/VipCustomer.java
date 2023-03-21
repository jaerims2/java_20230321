package day11;

public class VipCustomer extends Customer {

	double saleRatio;
	private int callID;
	public VipCustomer() {}
	
	public VipCustomer(int id, String name, int cname) {
		super(name, id); // 부모클래스 (customer) 호출
		customerGrade="VIP";
		callID  = cname;
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.callID = cname;
	}
	
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint +=(int)(price*bonusRatio);
		return price-(int)(price*saleRatio);
	}
	@Override
	public String printInfo() {
		// TODO Auto-generated method stub
		return super.printInfo()+"담당상담사의 번호는 "+callID+" 입니다.";
	}

	
	
	
	
	public int getCallID() {
		return callID;
	}
	
}
