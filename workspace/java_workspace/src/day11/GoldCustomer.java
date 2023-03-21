package day11;

public class GoldCustomer extends Customer {

	//할인율 slaeRatio 
	double saleRatio;
	public GoldCustomer() {}
	public GoldCustomer(int id, String name) {
		super(name, id);
		customerGrade="GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
		
	}
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint+= (int)(price*bonusRatio);
		return price-(int)(price*saleRatio);
	}
	
	public double getSaleRatio() {
		return saleRatio;
	}
	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
}
