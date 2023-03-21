package day11;

import java.util.List;

public class 다형성02 {

	
	/* 객체지향 프로그램의 4가지 특징
	 * -프로그램을 !독립! 된 단위의 객체들을 모아서 처리(연산)하는 모임
	 * -각각의 객체는 메시지를 주고 받으면서 데이터를 처리합니다.(매개변수,return)
	 * -추상화 정보은닉(캡슐화),상속,다형성
	 * 
	 * 1. 추상화(Abstraction) - 핵심적인 코드만 보여주기
	 * -인터페이스 . 구현 분리
	 * - 불필요한 부분은 숨김
	 * 
	 * 2. 캡슐화(encapsulation) - 데이터 보호(정보 은닉)
	 * - 멤버변수 (필드) 와 메서드를 하나로 묶는 것
	 * - 멤버변수 (필드)는 숨기고 메서드로 접근
	 * - 은닉화 : 객체의 내부의 정보는 숨겨 외부로 드러나지 않게 
	 * 			외부에서 데이터를 직접 접근하는것을 방지
	 * 3. 상속(inheritance) - 코드 재사용(확장)
	 * - 클래스 를 상속받아 수정하여 사용하게 되면 중복코드를 줄일 수 있다.
	 * 
	 * 4. 다형성(polymorphism) - 객체 변경 용이
	 * 
	 */
	public static void main(String[] args) {

		/* 다형성 polymorphism : 하나의 코드가 여러 자료형으로 구현되어 실행되는 것.
		 * 같은 코드에서 여러 다른 실행결과를 얻을 수 있음.
		 * 다형성을 잘 활용하면 유연, 확장성, 유지보수가 편리한 프로그램 생성 가능
		 */
	
		
	
	Animal1 hAnimal1 = new Human(); // Animal1 객체 / Animal1을 상속받은 Human의 객체를 만들겠다? 
	//Tiger h = (Tiger)hAnimal1;
	System.out.println(hAnimal1 instanceof Tiger);
	
	
	
	
	
	
	Animal1 tAnimal1 = new Tiger();
	Animal1 eAnimal1 = new Eagle();
	int cnt =0;
	Animal1[] arr = new Animal1[10];
	
	arr[cnt] = hAnimal1;
	cnt++;
	arr[cnt] = tAnimal1;
	cnt++;
	arr[cnt] = eAnimal1;
	cnt++;
	
	
	if(hAnimal1 instanceof Human) { //형변환이 가능하다면 true;
		Human human = (Human)hAnimal1; // Human 을 다운캐스팅
		human.read();
	}
	
	
	
	다형성02 test = new 다형성02();
	test.moveAnimal(hAnimal1);
	test.moveAnimal(tAnimal1);
	test.moveAnimal(eAnimal1);
	test.testDownCasting(arr,3);
	
	
	
	
	}
	//method 생성 
	// 다형성(move)을 출력할 수있는
	public void moveAnimal (Animal1 animal) { // 부모클래스 매개변수
		animal.move();
		
	}
	
	//다운캐스팅 메서드 생성 void
	//매개변수 : 배열(AnimalList[] 배열로 호출)
	//메서드명 : testDownCasting
	
	public void testDownCasting(Animal1[] list, int cnt ) {
		for(int i=0; i<cnt; i++) {
			Animal1 animal = list[i];
			if( animal instanceof Human) { //animal이 Human으로 형변환이 가능하다면 
				Human human = (Human)animal;    // => (Human객체) human = (Human객체)animal 이다. (휴먼으로 형변환한 animal)
				human.read();
			} else if(animal instanceof Eagle) {
				Eagle eagle =(Eagle)animal;
				eagle.flying();
			} else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
		}

	}
	
		
		
}//main끝	


class Animal1 { // 부모class Animal1 / Animal1 객체의 공통 move만 상속
	public void move () {
		System.out.println("동물들이 움직입니다.");
	}
}


class Human extends Animal1 {
	public void move() { // 
		System.out.println("사람은 두 발로 걷습니다.");
	}
	public void read () { // human만 가지고 있는 read변수 ?
		System.out.println("사람이 공부를 합니다.");
	}
	
}
class Tiger extends Animal1 {
	public void move() {
		System.out.println("호랑이가 호랑수월가를 부릅니다");
	}
	public void hunting() {
		System.out.println("호랑이가 떡하나주면 안잡아먹습니다.");
	}
}
class Eagle extends Animal1 {
	public void move() {
		System.out.println("독수리는 하늘을 날아 다닙니다.");
	}
	public void flying() {
		System.out.println("독수리가 두 날개를 폅니다.");
	}

}
