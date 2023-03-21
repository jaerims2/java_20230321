package day08;

public class 클래스02 {

	public static void main(String[] args) {
		/* 자동차 class 생성
		 * 멤버변수 : color, power, speed  / private 변수설정/ 조회.수정 g.s / move값 만들기.
		 * 메서드  : powerOn(true) (on,off) powerOff(false) 전원이 켜졌습니다 / 전원이 꺼졌습니다.
		 * 			speedUp +10 씩 올라가게끔./ speedDown-1(한번 호출 할때마다 +-10씩)		
		 */
		
		
		
		Car myCar = new Car();
		
		myCar.powerOn();
		myCar.color(null);
		
		
		System.out.println("자동차 색: "+myCar.getColor());
		
		
		
		
		Car myCar2 = new Car(); 
		
		
		
		
		System.out.println("-----다른 자동차 ------");
		System.out.println(myCar2.getColor());
		System.out.println(myCar2.isPower());
		System.out.println(myCar2.getSpeed());
		
//		myCar2.setColor("카키");
		
		System.out.println(myCar2.getColor());
		myCar2.powerOn();
		myCar2.speedUp();
		myCar2.speedUp();
		myCar2.speedUp();
		myCar2.speedUp();
		myCar2.speedUp();
		myCar2.print();
		myCar.print();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.setDoor(2);
		System.out.println(myCar.getDoor());
		
	}

}

 class Car {
	 //멤버변수 = 객체 선언.
	 private String color; //  null 기본값.
	 private boolean power ; // false 기본값
	 private int speed;
	 private int door;
	 
	 // 생성자 : 없으면 기본 생성자가 자동 추가된다.
	 // 생성자 위치(멤버변수 선언 이후)
	 // new 객체 생성 시 값을 입력해야함.
	 public Car(String color, int door) {
//		 this(color); 호출하는 생성자가 앞에 있어야함.
		 this.color = color;
		 this.door =door;
		 
	 }
	 	
	 public Car() {
		 
	 }
	 
	 
	 
	 
	 // get / set 생성
	 
	 // 객체의 method 선언.
 	public void print() { // 반환할 값이 출력값.
 		//if문 추가
 		System.out.println("전원 : "+power+"자동차의 색깔 : "+ color+" / 현재 스피드: "+ speed );
 		
 	}
 	public void color(String color) {// 색깔 매개string을 입력받아 출력.
 		
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
 		System.out.println(color+"현재 속도 : "+ speed );
// 		System.out.println("속도 : "+ ((speed<=0)? 0: speed); // if x
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
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color; // this멤버변수
	}
	public boolean isPower() { // boolean: get= is 
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
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
 	
 
 	
 	
 }// Car class끝