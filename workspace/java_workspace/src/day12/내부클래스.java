package day12;

public class 내부클래스 {

	public static void main(String[] args) {

		/* 내부 class란 : 클래스 내부에 선언한 클래스
		 * - 내부클래스를 포함한 외부클래스와 밀접한 연관이 있고 
		 * 	 다른 외부에서 내부클래스를 사용할 일이 없을 경우
		 * 
		 * -	중첩 class라고도 한다.
		 * - 인스턴스 내부클래스, 정적(static)클래스, 지역(local)내부클래스  
		 * - 익명(anonymous) 내부클래스 - > 익명클래스를 사용하기 위해 내부클래스를 사용.
		 *
		 * - 내부적인 활용할 목적으로 만드는 클래스이기 떄문에 private로 선언하는 것을 권장.
		 * - 내부 클래스 생성시기 : 외부클래스가 생성된 후 생성.(static은 다름)
		 * - private가 아닌 내부 클래스는 다른 외부클래스에서 사용할 수 있음.
		 * 
		 */
		Outclass out = new Outclass();
		System.out.println("외부 클래스를 이용해서 내부 클래스의 메서드를 호출");
		out.usingClass();
		System.out.println(); //줄바꿈
		
		
		//외부 클래스에서 내부클래스를 생성
		Outclass.Inclass inClass = out.new Inclass(); 
		//Out new객체 안의 new Inclass객체 생성
		//Incalss가 private 이면 Outclass에서 호출 불가.
		System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
		inClass.inClassprint();
	
		System.out.println();
		//외부클래스에서 바로 정적(static)내부 클래스 생성
		Outclass.InStaticClass.sTest();
		System.out.println();
		System.out.println("정적 (static) 내부클래스의 일반메서드호출");
		Outclass.InStaticClass sInClass = new Outclass.InStaticClass();
		
		
		sInClass.inTest();
		
	}

}//main 끝


class Outclass{
	private int num =10;
	private static int sNum=20;
	private Inclass in;
	
	public Outclass() {
	 in = new Inclass();
	 
	} //outclass끝
	class Inclass {//다른 외부에서 내부클래스를 사용할 일이 없기 때문에 private로 선언
		int inNum = 100;
//		static int sInNum = 200; // inclass 내에서 static 사용불가
		void inClassprint() {
			System.out.println("Outclass Num="+num+"(외부클래스의 인스턴스 변수)");
			System.out.println("Outclass sNum="+sNum+"(외부클래스의 static 변수)");
			System.out.println("Inclass inNum="+inNum+"(내부클래스의 인스턴스 변수)");
//		static void sTest() { } //error static 메서드도 사용불가
		}

		
	}// inclass 끝
	
	
	public void usingClass() {
		in.inClassprint(); // 내부 클래스변수=> Outclass 생성자를 사용하여 메서드를 호출.
	}
	static class InStaticClass{
		int inNum = 1000;
		static int sInNum = 2000;
		
		void inTest() { //inclass 
//		System.out.println("Outclass Num="+num+"(외부클래스의 인스턴스 변수)"); //error
		System.out.println("Outclass sNum="+sNum+"(외부클래스의 static 변수)");
		System.out.println("Inclass inNum="+inNum+"(내부클래스의 인스턴스 변수)"); 
		} // 정적클래스의 일반 메서드
		
		
		static void sTest () { //static 
//		System.out.println("Outclass Num="+num+"(외부클래스의 인스턴스 변수)");
		System.out.println("Outclass sNum="+sNum+"(외부클래스의 static 변수)"); 
		// static끼리는 외부내부 다 사용가능 , 객체가 생성되어 있지 않아도 호출가능
		System.out.println("Inclass sInNum="+sInNum+ "(내부클래스의 static변수)");
//		System.out.println("Inclass inNum="+inNum+"(내부클래스의 인스턴스 변수)"); 
		} // 정적클래스의 정적메서드
 		
	}
}