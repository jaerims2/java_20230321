package day07;

public class 클래스 {

	public static void main(String[] args) {

		/* class (lotto class) = > 예) 
		 *  메서드(기능) 모임 및 실행(출력 / 호출) 하기 위한 ... 
		 * 객체를 생성하기 위한 설계도.
		 * 메서드- 기능을 정의하는 것.
		 * 
		 * 
		 *  클래스의 구성정보
		 *  -속성 : 멤버변수(System.) 모든 클래스에서 사용가능.
		 *  -기능 : 메서드(지역변수)
		 *  
		 *  프린터 클래스
		 *  속성 (정보) : 크기,색 , 제조사 , 구동 방식 
		 *  기능 : 인쇄 .스캔 .팩스 .복사
		 * 
		 * 멤버변수: 클래스 안 / main메서드 위에 작성
		 * 멤버변수는 클래스 안에서 사용할 수 있다.(모든 메서드를 포함)
		 * 
		 * 
		 * 접근제한자 class 클래스명 {
		 *  // 클래스명은 반든시 대문자로 시작.(규칙)
		 * }
		 * 
		 * -객체 선언
		 *  클래스명 객체명;
		 * -객처 선언 & 초기화(생성)
		 * 클래스명 객체명 = new 클래스명();
		 * 
		 * - 멤버 메서드 사용하는법
		 * 객체명. 메서드명();
		 * 
		 *  같은 클래스 안에서 메서드를 호출 할 때는 메서드명으로 호출가능.=> 메서드명();
		 *  다른 클래스에서는 메서드를 호출 할 때 객체를 이용하여 사용 => 객체명.메서드명();
		 */
		
		/* 접근제한자(제어자) 
		 * public : 누구나 모두
		 * protected : 나  + 같은 package + 자식 클래스
		 * (default) : 나 + 패키지 
		 * private : 나 (다른 클래스에선 호출 불가) 
		 * - 멤버 변수 / 메서드를 다른 클래스에서 사용할 수 없게 함.
		 * - 일반적으로 멤버변수는 private이라하고, 메서드는 public (규칙.) 
		 * (개인정보 유출 및 수정 제한)
		 * private class 내에서 getter / setter method를 생성하여 조회가능.
		 * - 일반적으로 private으로 선언된 멤버변수는 getter / setter 를 통해 변수에 접근할 수 있음.
		 *  
		 *
		 * 클래스에서 public 을 쓸 수 있는 경우 
		 * 파일명(class생성 시 설정이름) equals == 클래스명이 같을 때만 가능.
		 * 멤버변수 메서드 제한x
		 * 
		 */
	// 클래스를 사용하려면..
		Point p = new Point(); // Scanner 선언과 동일.
		p.move(5, 3); //
		p.print();
		
		System.out.println("---------------z추가 ------------ ");
		Point1 p2 = new Point1();
		p2.print();
		p2.move(1, 5, 7);
		p2.print();
		
		p2.setX(4);
		p2.print();
		System.out.println(p2.getX());
		
		
		
		
		 // point class 내 / public x,y 멤버변수 라서 다른 class어디서든 직접사용 및 수정가능.
	
	}
}

/* 다른 클래스 밖에서 생성
 * 접근제한자 class 클래스명 {
 *  클래스명은 대문자로 시작
 * }
 * 
 */


class Point {
		private int x; //< 멤버변수 >
		private int y; // 기본적으로 0이나 null로 초기화 되어 있음.
		
		// int x,y좌표를 프린트 하는 메서드.
		public void print() {
			// (0.0) 
			System.out.println("("+x+","+y+")");
		}
		//x,y좌표를 변경하는 메서드
		//매개변수 : x,y의 값을 주고 멤버변수의 x,y를 변경
		public void  move(int x1, int y1) { // class Point내 멤머변수 method
			this.x = x1; // this.x는 멤버변수 / 그냥 x는 매게변수.
			this.y = y1;
			
			
			// getter setter //
			//해당class 내 공백에서 우클릭 source /Generate Getters setters /  
			
		}
		public int getX() { // 멤버변수를 리턴한 값 print가능
			return x;// 멤버변수의 x를 리턴.
		}
		public int getY() {
			return y;
		}
		public void setX ( int x) {
			this.x = x; //(멤버변수를 매게변수로 바꿔주세요..)
		}
		public void setY (int y) { // set 다른 클래스에서 private멤버변수를 수정..
			this.y = y;
		}
}


class Point1 {
	private int x;
	private int y;
	private int z;
	
	public void print() {
		System.out.println("( "+x+" , "+y+" , "+z+" )");
	}
	public void move (int x1,int y1,int z1) {
		this.x = x1;
		this.y = y1;
		this.z = z1;
		
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getZ() {
		return z;
	}
	
	public void setX(int x) {
		this.x= x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setZ(int z) {
		this.z = z;
	}
}