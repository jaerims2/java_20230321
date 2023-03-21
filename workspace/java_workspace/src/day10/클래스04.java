package day10;

public class 클래스04 {

	public static void main(String[] args) {

		
		
		
		 Car myCar = new Car();
		 
		 myCar.airbackout();
		 myCar.setDoor(4);
		 myCar.powerOn();
		 myCar.setColor("펄 아이보리");
		 myCar.print();
		 
		 
		 Car myCar2 = new Car("스페이스 그레이 ", 2, false, 30, false);
		 
		 myCar2.print();
		 System.out.println(myCar);
	}

}


class Car {
	// Car class Main
	// 생성자를 이용하여 객체생성
	// 멤버변수 : color door airback power speed 
	
	// 생성자 : 오버로딩 여러개 가능  / 빈생성자, color생성자 , color door
				// color door airback // 전체 생성자 = 총5개
	// 메서드 : print  (모든 내용 출력)
	
	// get / set
	
	private String color;
	private int door;
	private boolean power;
	private int speed;
	private boolean airback;
	
	
	 public Car( ) {} // 기본생성자
	 public Car(String color) {this.color = color;}
	
	 public Car(String color , int door) {
		this.color = color; 
		// this 멤버변수를 의미 
		// 멤버변수와 매개변수의 이름이 같을 경우 멤버변수라는 것을 표시하기 위해 사용
		this.door = door;
		}
	 public Car(String color , int door , boolean airback) {
		 
		 this(color,door);
		 this.airback = airback;
	 }
	 public Car(String color, int door , boolean airback, boolean power) {
		 this(color,door,airback);
		 this.power = power;
		 
	 }
	// 생성자를 자동생성
	//  
	 public void print () { 
		 // 멤버변수는 (멤버변수가 선언된)클래스 내에서 모든 메서드에 공유되는 변수
		 // 멤버변수를 매개변수로 받을 필요가 없다.
		 System.out.println("-♡-♡-♡- ♡My ♡ Car♡ -♡-♡-♡-");
		 System.out.println("자동차의 색깔 : "+color);
		 System.out.println("door 갯수 : "+ door);
		 System.out.println("airback 유무: " + airback);
		 System.out.println("power상태 : "+ power);
		 System.out.println("현재 속도 : "+ speed);
	 }
	 @Override
	 public String toString() {
		 // toString : 멤버변수들을 출력해주는 메서드
		 return "MyCar [color=" + color + ", door=" + door + ", airback=" + airback + "]";
	 }
	 
	 public Car(String color, int door, boolean power, int speed, boolean airback) {
//		super(); // 부모의 생성자를 호출해옴 / 기본 생성자
		this.color = color;
		this.door = door;
		this.power = power;
		this.speed = speed;
		this.airback = airback;
 
	}
	public void speedUp() {
		 	
	 		if(power == true) {
	 			speed = speed+10;
	 			System.out.println(color+" 현재 속도 : " + speed);
	 		}else {
	 			speed= 0;
	 			System.out.println("시동을 켜주세요.");
	 			
	 		}
	 			
	 	}
	 	public void speedDown() {
	 		if(speed <=0) {
	 			speed = 0;
	 		System.out.println("속도가 0입니다.");
	 		} else {
	 			speed = speed-10;
	 		System.out.println("현재 속도 : "+ speed );
//	 		System.out.println("속도 : "+ ((speed<=0)? 0: speed); // if x
	 		}
	 	}
	 	public void powerOn() {
	 		
	 		System.out.println("전원이 켜졌습니다");
	 		power = true;
	 		
	 	}
	 	public void powerOff() {
	 		System.out.println("전원이 꺼졌습니다.");
	 		power = false;
	 	}
	 	
	 	public void airbackin() {
	 		System.out.println("에어백 장착되어있음");
	 		airback = true;
	 	}
	 	public void airbackout() {
	 		System.out.println("에어백 장착 안된 차량");
	 		airback = false;
	 	}
	 	
	 	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isAirback() {
		return airback;
	}
	public void setAirback(boolean airback) {
		this.airback = airback;
	}
}// car class
	