package day10;

//product class
	public class Product1 {
		
		private String name;
		private int price;
		
		
		public Product1() {}
		
		public Product1(String name, int price) {
			this.name = name;
			this.price = price;
		}
		public void insertProduct(String name, int price) {
			this.name = name;
			this.price = price;
		}	
		public void printProduct() {
			System.out.print("제품명 : "+ name);
			System.out.println(" / 가격 : "+ price);
			
		}
		
		
		
		
		
		@Override
		public String toString() {
			return "상품정보 [name=" + name + ", price=" + price + "]";
		}

		public String getName() {
			return name;
		}
		public void setName(int name) {
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
	}//product class끝
