package day06;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {

		/* 메서드를 활용하여 계산기를 작성
		 * 메서드는 + - * / % 를 만들어서 출력해주세ㅐㅛㅇㅇ
		 * 두 수를 입력 받아서 연산. / 연산자를 입력 받아서 메서드를 활요하여 연산 
		 * switch 문 이용하여 case1 + 호출 
		 */
		
		
		Scanner scan= new Scanner(System.in);
		
		int aa,bb,cc,dd,ee =0;
		
			System.out.println("=== 계산기를 만들어 봅시다 ===");
			System.out.println("두 수를 입력해주세요 1번째 수 > ");
			int input = scan.nextInt();
			System.out.println("두 수를 입력해주세요. 2번째 > ");
			int input2 = scan.nextInt();
			System.out.println("연산자를 입력해주세요 < + , - , * , / , % > 중 한 개 입력");
			String input3 = scan.next();
			
			
			switch(input3) {
					case "+": 
						System.out.println("결과 : ");
						
						aa(input3, input, input2);
						
						break;
					case "-": 
						System.out.println("결과 : "+bb(input, input2));
						break;
					case "*":
						System.out.println("결과 : ");
						cc(input, input3, input2);
						
						break;
					case "/":
						System.out.println("결과 : "+dd(input, input2));
						break;
					case "%":
						// rem 메서드 변경 : 리턴을 배열로 리턴 / 몫과 나머지를 순서대로..
						// 나머지 double 로 리턴/
						// sysout 몫의 결과 + / 배열의 0번지
						// 
						
						double[] arr = rem(input, input2);
						System.out.println("/의 결과"+ arr[0]);
						System.out.println("/의 결과"+arr[1]);
						
						break;
					default:
						System.out.println("잘못입력하셨습니다");
						break;
						}	
			System.out.println("====== 계산기 종료 ======");
//			Method02 m2 = new Method02();
//			m2.sumPrint(input, input2);
//			메소드를 담을 m2 변수 생성 , m2. sumPrint(다른 클래스에서 만든 메소드 호출 방법.)
	scan.close();
		
		
	}
	
	public static void aa(String op,int num1, int num2) { // addition
		System.out.println(num1+op+num2+" = "+ (num1 + num2));
		
	}
	public static int bb(int num1, int num2) { //substration 
		return num1-num2;
	}
	public static void cc(int num1,String op, int num2) { //multipulication
		System.out.println(num1+op+num2+ " = "+(num1 * num2)); // op의 위치 주의
		
	}
	public static double dd(int num1, int num2) { // division
		return (double)num1/num2;
	}
	/* 기능 : 두 정수를 입력 받아서 두정수를 나눈 몫과 나머지를 double배열로 리턴.
	 * 리턴타입 :
	 * 매개변수 : 
	 * 변수명 : rem
	 * 
	 */
	public static double[] rem(int num1,int num2) {
		double[] arr = new double[2];
		arr[0] = num1/num2;
		arr[1] = num1%num2;
		return arr;
	}
}
