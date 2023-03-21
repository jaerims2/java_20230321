package product;

public class Order extends Product {

	
	private int count;
	private int total;
	
	// Product를 상속 받은 Order
	// 부모 클래스의 멤버변수는 기본변수로 설정되어있음.
	// super. 으로 변수호출
	// 1개의 order를 만들수있는 메뉴얼 
	// 
	
	
	public void print() {
		 System.out.println("상품 : "+super.getFood()+ count+ "개");
		 System.out.println("가격 :"+ total);
	}

	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}



	public int getTotal() {
		return total;
	}



	public void setTotal(int total) {
		this.total = total;
	}
	


	public Order(String food, int price) {
		super(food, price);
		// TODO Auto-generated constructor stub
	}

	
}
