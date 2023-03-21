package day03;

import java.util.Scanner;

public class For문break문 {

	public static void main(String[] args) {
//		Break문 : 반복문을 빠져나오는 역할을 하는 키워드.
//		반복문에서 조건 (if문을) 동반한다.
//		1~100까지의 합계
		
		int i=1, sum=0;
		
		for(;;) {
//			System.out.print(i+" ");
			 
			sum = sum+i; // 합계
			
			if(i==10) {
				break;
			}
			i++;
		}
//			System.out.println();
//			System.out.println("1~100까지의 합 : "+sum);

			/* 한글자를 입력받아 그대로 입력받은 글자를 출력.
			 * y를 입력 받으면 종료.
			 * a->a / b->b, c->c / y-> 종료
			 */
			Scanner scan = new Scanner(System.in);
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			System.out.println("한문자를 입력하세요.(y입력 : 종료)");
			
			
		
		
			
			for(;;) {
				
				char ch= scan.next().charAt(0); //   int i를 정의해 주는 부분(시작부분)
				System.out.println("한문자를 입력하세요.(y입력 : 종료)");
				System.out.println(ch);
				if(ch=='y' || ch =='Y') { //   i의 종료지점.
					System.out.println("종료되었습니다byebye..");
					
					break;
			
					// 증감 연산자는 생략...
			}	
		} 

	
	
	
	
	
	}
	

}
