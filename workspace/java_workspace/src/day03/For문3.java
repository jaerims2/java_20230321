package day03;

import java.util.Scanner;

public class For문3 {

	public static void main(String[] args) {
		
//		1부터 100까지 합계
		
		
		int sum = 0;
//		int i = 1;
		for(int i=1;i<=100; i++) {
			sum = sum+i; //누적 => 내변수 = 내변수+sum대상 (sum+=i;)
			//i = 0+1 / 1+2/ 3+4 .... 99..100
			i=i+1;
			
		
		
		}
//		System.out.println(i);
//		System.out.println(sum);
	
		/* 약수 구하기.
		 * 약수 : 나누어서 떨어지는 수들의 모임
		 * ex) 12의 약수 = 1,본인 수 고정/ 2.3.4.6
		 * num =12;  1부터12까지의 수를 num과 나누어서 떨어지는 나머지가0이 되는 수를 출력
		 * 초기값 1
		 * 조건식 num꺼지  
		 * 증감식 1씩 증가
		 * 실행문은 = 나머지가 0이 되는 수를 출력
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.(약수를 구해드립니다.)");
		
		
		
		
		
		
		
		int num = scan.nextInt();
		
		for(int j=1; j<=num; j++) {
			
			if(num%j==0) {
				System.out.printf("%d ",j);
				
			}
		}
	scan.close();	
	}

}
