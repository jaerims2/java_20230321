package day08;

public class 클래스03 {

	public static void main(String[] args) {

		Card c =new Card();
		c.print();
		c.setShape('♠');
		c.print();
		c.setNum(3);
		c.print();
		c.setShape('d');
		c.setNum(100);
		c.print();
		System.out.println(c.getNum());
	
	}

}
/* Card class 생성
 * Card 클래스 : 포커게임에서 사용하는 카드를 나타내는 클래스.
 * 모양 : 하트(♥) , 클로버(♣), 스페이드(♠), 다이아(◆)
 * 숫자 : 1~10 / j q k
 * card의 객체를 만들어서/ 해당 모양과 숫자만 허용
 * 
 * 클래스 구성
 * -멤버 변수 : char shape , int num 11.j/ 12.q/ 13.k
 * -메서드 : print 모양 내용
 *  get set필수 
 * -생성자 : 초기 생성자(♥1)
 * public 클래스명() { //매개변수는 없을수도 있음.
 * 초기값;
 * }
 *  카드를 만드는 클래스 한개.
 *  지정 숫자 모양외의 값을 만들면 초기생성자 값으로 들어오게..
 */

/* 52장의 객체(class) 중복x 
 * card pack 클래스 객체참조..
 * 
 */
 class Card {
	
	private char shape;
	private int num;
	
	
	public Card() {// 초기값 생성자.
		shape= '♥';
		num= 1;
	}
	
	public void shape (char shape) {
		
	}
	public void print() {
			 // 11하트
		switch(num) {
		
		case 11: System.out.println(" J "); 
			break;
			
		case 12: System.out.println(" Q ");
			break;
			
		case 13: System.out.println(" K "); 
			break;
			
		default :
		 System.out.print(num);
		}
		System.out.println(shape);
	}
	public char getShape() {
		return shape;
	}

	public void setShape(char shape) { // 다른문자 들어오면 하트
		
		if(shape == '♥' || shape == '♠' || shape == '♣' || shape == '◆' ) {
			this.shape = shape;
		} else {
			this.shape = '♥';
		}
		
	}

	
	public int getNum() {
		return num;
	}

	public void setNum(int num) { // 13보다 크면 무조건1
		if(num>13 || num<0) {
			this.num=1;// this 꼭 붙이기!!!!!!!!!
		} else {
			this.num = num;
		}
	}
	
//	public static void clac (int num1,int num2, char op) {
//		switch(op) {
//		case '+' : 
//			System.out.println(num1+num2);
//			break;
//		case '-' : 
//			System.out.println(num1-num2);
//			break;
//		case '/' : 
//			System.out.println(num1/num2);
//			break;
//		case '%' : 
//			System.out.println(num1%num2);
//			break;
//		default : 
//			System.out.println("잘못된 연산자입니다.");
//		}
//	}
//	public static void clac (int num1,char op,int num2) {
//		switch(op) {
//		case '+' : 
//			System.out.println(num1+num2);
//			break;
//		case '-' : 
//			System.out.println(num1-num2);
//			break;
//		case '/' : 
//			System.out.println(num1/num2);
//			break;
//		case '%' : 
//			System.out.println(num1%num2);
//			break;
//		default : 
//			System.out.println("잘못된 연산자입니다.");
//		}
//	}
//	public static void clac (char op,int num1,int num2) {
//		switch(op) {
//		case '+' : 
//			System.out.println(num1+num2);
//			break;
//		case '-' : 
//			System.out.println(num1-num2);
//			break;
//		case '/' : 
//			System.out.println(num1/num2);
//			break;
//		case '%' : 
//			System.out.println(num1%num2);
//			break;
//		default : 
//			System.out.println("잘못된 연산자입니다.");
//		}
//	}
	
	
}// card클래스 끝.
 
 
 