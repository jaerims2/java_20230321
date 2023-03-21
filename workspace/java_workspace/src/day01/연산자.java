package day01;

public class 연산자 {

	public static void main(String[] args) {
	
		/* 대입연산자: =을 기준으로 오른쪽에있는 변수의 값을 왼쪽에 저장 
		 *  a=b b의 값을 a에 저장(대입)하라. / 덮어쓰기.
		 *  a는 반드시 변수여야 한다.
		 */
		int a = 10;
		int b = 20;
		a=30; // a의 값은 사라지고 30만 남는다.
		b = b+10; //연산 후 결과를 대입 = 누적 / 기존에 있는값을 그대로 결과값에 반환시켜야할때.
		
		System.out.println("a : "+ a+","+ "b : "+b);
		
		//산술 연산자 : + - * / %(나머지연산자)
		System.out.println(4+3);
		System.out.println(4-3);
		System.out.println(4*3);
		System.out.println(1.2-3.4);
		System.out.println(1.2*3.4);
		
		/* 나누기 /
		 * 정수 / 정수 = 정수 (소수점을 버리고 정수로 표현)
		 * 실수 표현을 하기위 해선 4/3.0 형식으로 좌변우변 중 한개는 실수 표현
		 */
		System.out.println((double)3/2);
		System.out.println(3.0/2);
		System.out.println(3.0/2.0);
	
		//자료형 정수를 실수로 변환 하는 경우 = 형변환
		int num1 = 3;
		int num2 = 2;
		System.out.println(num1 + num2);		
		System.out.println(num1 - num2);		
		System.out.println("실수표현"+num1 /(double)num2);		
		System.out.println(num1 *num2);		
		//이미 변수를 선언한 뒤라면, 출력값중 한 개에 (double)=표현하고자하는타입 적어주기.
	
		//나머지 연산자 %  
		System.out.println(4%2);
		System.out.println(44%7);
		
		/*Q. 국어70 영어35 수학 97
		 * 국영수 합과 평균을 구하여 콘솔에 표시
		 */
	int 국어=70 ,영어= 90,수학=97;
	
	
	int sum;
	double avg;
	sum= 국어 + 영어 + 수학;
	avg = sum / 3.0; // 0으로 나누면 예외 에러 발생
	
	System.out.println("합계 : "+sum);
	System.out.println("평균 : "+avg);
	
	//논리 연산자 / 비교 연산자 if문에서 체크
	//결과값이 true false로 나옴.
	
	System.out.println(4>3);
	
	// 삼항 연산자 : (조건식) ? A:B
	System.out.println((avg>=80) ? "합격" : "탈락");
	
	}

}
