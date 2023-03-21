package day11;

public class 추상클래스01 {

	public static void main(String[] args) {
		/* 인터페이스 : 추상메서드와 상수로만 이루어진 것.
		 * 추상메서드 : 메서드의 선언부만 있고 구현은 없는 메서드
		 * 추상 클래스 : 추상메서드 + 일반메서드 + 멤버변수 + 상수(final)
		 * 추상 메서드 : 미완성 클래스=> 객체를 생성할수 없다.
		 * 키워드 : abstract
		 * 
		 * abstract (추상 키워드) 클래스명 앞에 / 메서드 앞에 추가
		 * abstract 리턴타입 메서드명(매개변수);
		 * - 부모 클래스에서 상속 받았을 경우 
		 * 특정 메서드가 자식 클래스에서 자주 오버라이딩 될 때
		 * 해당 메서드를 추상 메서드로 작성.
		 * 
		 *  -상속을 받은 클래스에서는 추상메서드가 있다면 반드시 구현해야한다.
		 *  
		 */
	Dog d = new Dog();
	d.name = " 포이 ";
	d.category = " 귀여운과 ";
	d.printInfo();
	d.howl();
	
	Dog d1 = new Dog(" 코이 "," 시크한과?");
	d1.printInfo();
	d1.howl();
	
	//추상 클래스는 객체 생성 불가능
	// Cat c = new Cat(); -> 불가능
	
	}

}
//Animal class = 추상클래스
abstract class Animal {
	public String name;
	public String category;
	
	public void printInfo () {
		System.out.println("--------------");
		System.out.println("이름: "+ name);
		System.out.println("종류: "+ category);
	}
	abstract public void howl(); // 추상메서드
	
}
// 추상 클래스 Animal을 상속받는 클래스 dog cat 

class Dog extends Animal { // 추상클래스 상속
	public Dog() { }
	
	public Dog(String name, String category) {
	super.name = name;
	super.category = category;
	
	}

	@Override
	public void howl() {
		System.out.println("----개가 짖는 소리 ------");
		System.out.println(" 멍멍멍멍머엄어머엄엄ㅇ!!!!");
		// TODO Auto-generated method stub
		
	}
	
}
// 추상클래스를 상속받는 자식클래스는 반드시 추상메서드를 구현해야한다.
// 자식클래스도 추상클래스면 구현 안해도됨.

class Cat extends Animal {
	
	public Cat() { }// Cat기본 생성자
	
	public Cat(String name, String category) {
		super.name=name;
		super.category = category;
	}
	@Override
	public void howl() {
		
		System.out.println("미야오오오오오오오오오오오옹");
		
	}
}
