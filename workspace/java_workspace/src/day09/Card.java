package day09;



/* Card Class
 * -숫자 1~10 , J11, Q12 , K13
 * -한장의 카드정보를 출력하는 기능
 * 
 * 생성자 1은 모
 */

/* get은 필수 (출력하여 확인용도)
 * set은 변하지 않는 고정값 (수정할 필요 x) 같은 경우 생략가능.
 */
	public class Card {
		private char shape;
		private int num;	

		public Card() { 
			// 생성자는 일회성 설정 (new 객체생성) / 다른곳에서 호출 불가.
			shape = '♥';
			num   = 1;	
		}
		
		public void shape(char ch) {
		}
		public void print() {
			
			switch(num) {
			case 11: System.out.print("J");
				break;
			case 12: System.out.print("Q"); 
				break;
			case 13: System.out.print("K");
				break;
			default: 
				System.out.print(num);
				}
			System.out.print(shape+" ");
		}	
		
		
		
		public char getShape() {
			return shape;
		}

		public void setShape(char shape) {
			switch(shape) 	{
			case '♥': this.shape = shape; break;
			case '♣': this.shape = shape; break;
			case '◆': this.shape = shape; break;
			case '♠': this.shape = shape; break; 
			
				default: 
					this.shape='♥';
			}
			
		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			if(num<1 || num>13) {
				this.num=1;
			}
			else {
			this.num =num;
	}
			}
} // Card 클래스의 끝


