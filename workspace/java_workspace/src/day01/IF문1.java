package day01;

public class IF문1 {

	public static void main(String[] args) {
	
		/*조건문 :주어진 조건에 맞을 경우 실행문을 처리하는 구문
		 * if / switch문
		 * if문 : if~else , if ~else if 
		 * 
		 * if(조건식) { true일 때 실행문; }
		 * 실행문이 하나일 경우 중괄호 생략 가능{}. 
		 */
		/*num1의 값을 주고, num1이 0 이면 "num1은 0입니다." 라고 출력
		 * 
		 */
		
		int num1 = -4;
		if(num1 == 0) {
			System.out.println("num1은 0입니다");
		} else if(num1 > 0) { // else if는 여러조건 나열가능 
			
			System.out.println("num1은 양수입니다");
		} else { // 마지막에 한번 
			System.out.println("num1은 음수입니다.");
		}
		
		/*Q.num1 이 양수면 양수~ (0포함x)
		 * num1이 0이면 0이라고 아니면 음수
		 */

		/*Q.num2가 짝수인지 홀수인지 판별
		 *num2가 짝수이면 "짝수",아니면 "홀수"
		 */
	int num2= 9;
	// %나머지 연산자를 이용하여 짝수인지 홀수인지 구하는것.
	if(num2%2 == 0) { 
		System.out.println(num2 +": 짝수입니다");
		
		}else {
		System.out.println(num2 +": 홀수입니다");
		}	
	}	
}

