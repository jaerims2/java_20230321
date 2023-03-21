package product;


public class Product {
//메뉴명, 가격
	
	private String food;
	private int price;
	
	// 겟셋 필수 
	// 출력 필요시 toString 필요없으면 필수아님
	// 생성자 필요유무에 따라 생성 
	public Product(String food, int price) {
//		super();
		this.food = food;
		this.price = price;
	}



	@Override
	public String toString() {
		return "Product [food=" + food + ", price=" + price + "]";
	}
	
	

	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}	
	
}

