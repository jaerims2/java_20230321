package day02;

public class For문1 {

	public static void main(String[] args) {
		/* 반복문 : 규칙적인 작업을 반복적으로 할때 사용하는 문법
		 * 종류 : for문 while 문, do ~ while
		 * for(1.변수초기화 ; 2.5.8조건식 ; 4.7.증감연산식) { 
		 * 		3.6.9실행문;
		 * }
		 * 1.초기화 : 조건식이나 실행문에서 사용하는 변수를 초기화
		 * 처음 1번만 실행, 생략 가능.
		 * 2. 조건식 : 반복문의 반복을 결정하는 식. 참 반복/ 거짓 스탑;
		 * 생략가능 -> 무조건 true
		 * 3.증감연산식 : 조건식에서 사용되는 변수를 중가/감소 시켜서 반복 횟수를 결정.
		 * 생략가능..
		 */
		
		// i의 값을 1씩 증가 = (i= i+1) = 증감연산자 = (i++)
		// 1부터 10번 / 1부터 1씩증가하여 한개씩 찍어요..
		for(int i=1; i<=10;i++) { 
//			System.out.print(i+" ");
		/*지역변수의 범위 {   }
		 * for문 안에서 사용을 하면 } 후 반환 후 소멸되기 때문에 
		 * 메인메소드 영역에서 소멸된상태.. 같은 이름으로 변수설정 가능.
		 */
		}
		System.out.println();
		for(int i=1; i<=10; i+=2) {
//			System.out.print(i+" ");
		}

		/*10부터 1까지 출력
		 * 초기값
		 * 조건식
		 * 증감식
		 */
		
	for(int i=10; i>=1; i--) {		
//		System.out.printf("%d\n",i);
		
	
	}
	for(int i=1; i<=10; i+=2) {
//		System.out.print(i);
		
	}
	
	for(int i=1; i<=10; i++) {
		
	
	 if(i%2 ==0) {
		 
		 System.out.print(i+" ");

		 
		 
		 
	 			}  else {
	 				System.out.print("홀수극혐 ");
	 			
	 		}
	
		}
		/*1~10까지의 합계
		 * (1+2+3+....10)
		 *초기화 조건식 1부터 10까지 증감식 1++ 
		 */
		
	System.out.println();
	int sum=0;
	for(int i = 0; i<=10; i++) {
		sum =sum+i;
		}
	
	System.out.println(sum);
	 
	}

}
