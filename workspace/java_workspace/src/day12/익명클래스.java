package day12;

public class 익명클래스 {

	public static void main(String[] args) {
		
		
		/* 익명클래스 : 이름이 없는 클래스
		 * 인터페이스를 이용하여 객체를 만들 떄 클래스 없이 바로 구현
		 * 익명 클래스 사용이유 :
		 * -인터페이스의 기능이 적고, 해당 객체가 한번만 필요한 경우.
		 *  메서드의 매개변수로 주로 사용해야하는 경우
		 *  
		 */
//		Tv t= new Tv();
//		product(t);
//		
		//익명 클래스로 작업한 경우		
		product(new Power() {

			@Override
			public void trunOn() {
				System.out.println("전원 on");
				// TODO Auto-generated method stub
				
			}

			@Override
			public void trunOff() {
				System.out.println("전원 off");
				// TODO Auto-generated method stub
				
			}
			}); // product 메서드 (interface Power를 메서드내에서 구현 implement )
		
	}
	public static void product(Power p) {
		p.trunOn();
		System.out.println("Tv가 작동중입니다.");
		p.trunOff();
		
	}
}
interface Power {
	 void trunOn();
	 void trunOff();
	 
}
//class Tv implements Power {
//
//	@Override
//	public void trunOn() {
//		System.out.println("tv가 켜졌습니다");
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void trunOff() {
//		System.out.println("Tv가 꺼졌습니다.");
//		// TODO Auto-generated method stub
//		
//	}
//	
	
//}