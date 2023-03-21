package day02;

public class Switch문1 {

	public static void main(String[] args) {
		// switch : 값을 케이스마다  분리해서 실행시켜주는 조건문
		
		/* switch (변수, 식으로 들어와도 상관x)
		 * 
		 * switch(변수/식) {
		 * case 값1 : 
		 * 실행문; 
		 * break; - 값1과 일치 시 출력값에 반환한다. 불일치 시 다음 값으로 넘어감..
		 *----------------- case 값1의 1세트 switch 반복
		 *
		 * case 값2 : 
		 * 		실행문;
		 * 		break;
		 * .......case3456..
		 * 
		 * default(else와 같은 의미 나머지들..~) :
		 * 실행문 ; 
		 * break;
		 */
	
		int num =1;
		switch(num) {
		case 1:
			System.out.println("num는 1입니다");
			break;
		case 2:
			System.out.println("num는 2 입니다");
			break;
		case 3:
			System.out.println("num는 3 입니다.");
			break;
		default:
			System.out.println("num는 1,2,3,이 아닙니다");
		}
	}

}
