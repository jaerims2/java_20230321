package day06;

public class Method02 {

	public static void main(String[] args) {

		/* Method (기능) : 함수 
		 * -접급제한자 : 접근할수 있는 주체의 제한범위
		 * -리턴타입  : 메서드 실행 이후 결과로 얻을 수 있는 값의 (자료형으로 표현)
		 * -메서드명  : 메서드를 구분하는 명/  소문자 시작, 카멜 표기법.
		 * -매개변수  : 기능을 수행하기 위해 필요로 하는 정보 값.
		 * -void    : return 값 (반환) 값이 없을 경우 void를 사용
		 * 
		 * 접근제한자 리턴타입 메서드명 ( 매개변수 ) {
		 * 기능구현 ;
		 *  -> 리턴타입이 있을경우(void) 가 아닌 경우 반드시 구문에 return을 포함해야 함.
		 * }
		 * 
		 * 메서드의 위치가 클래스 안쪽 / 다른 메서드 밖
		 * 
		 * 
		 * 
		 */
		int sum2;
	sum2 = sum(123,3445);
	System.out.println(sum2);
	sumPrint(sum2, 787);
	int gg;
	gg = gg(11, 33);
	System.out.println("* 메서드 : "+gg);
		
	}
	// 메서드의 위치
	/* 기능 : 두정수의 합계 메서드
	 * 리턴타입 : 합 - > int 
	 * 매개변수 : 두 정수 -> int num1, int num2
	 * 메서드 명 : sum
	 */
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 출력하는 메서드
	 * 리턴타입 : void 
	 * 매개변수 : 두 정수 필요함. int = num1,num2
	 * 매서드 명 : sumPrint 
	 */
	public static void sumPrint(int num1, int num2) {
		System.out.println(num1+num2);
		
	} 
		
	/* 기능 : 두 정수가 주어지면 두 정수의 곱을 알려주는 메서드
	 * 리턴 타입 : int
	 * 매게 변수 : int num1,2
	 * 메서드명 : gg
	 * 	main에서 두 수의 곱을 출력
	 */
	public static int gg(int num1,int num2) {
		return num1*num2;
		
	}
	
	
}
