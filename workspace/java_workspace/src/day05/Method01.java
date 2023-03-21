package day05;

public class Method01 {

	public static void main(String[] args) {

		
		/* main class는 출력을 위한 class (console출력)
		 * method : 기능/ 함수
		 * ex1 ) public static void main(String[] args) 
		 * 접근제한자 : public =접근 제한범위
		 * 리턴타입 :  void = 메서드의 실행 결과로 받을 수 있는 정보의 값(자료형)   
		 * 메서드 명 : main = 메서드 이름. 소문자로 입력.(변수,메서드)
		 * String [] args : 매개변수 = 메서드를 실행하기위해서 필요로하는 값.
		 * <메서드 선언 및 구현>
		 * 접근제한자 리턴타입 메서드명(매개변수) {
		 * 기능구현;
		 * }
		 * 
		 * 메서드를 선언하는 위치
		 * 클래스 안, 다른 메서드 밖
		 * 
		 * 
		 */
	
	int num1 =10;
	int num2 = 20;
	System.out.println(num1+num2);
	int summmmmmmmthing = sum(800, 200);
	System.out.println(summmmmmmmthing);
	}

	
	  //메서드 위치.  = class 안에  / main method 밖에 위치함
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 알려주는 메서드. 
	 * method 이름 : sum / 매개변수 : 두 정수(int num1,2) / 리턴타입 : 합을 return(int) 
	 */
	public static int sum(int num1,int num2)  {
		int sum = num1+num2;
		return sum;
	}

	
	
	
	
}
