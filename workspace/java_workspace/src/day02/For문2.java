package day02;

public class For문2 {

	public static void main(String[] args) {
		/*2단 출력 구구단
		 * 2*1=2....2*9=18
		 */
	
	/* 2중 for문 for문안에 for을 넣어서 2가지 반복문 생성 후 
	 * 
	 */
		int gugu = 0;
		for(int i=2; i<=9; i++) { 
			System.out.println();
			for(int j=1; j<=9; j++) {
				gugu = i*j;
		System.out.printf("%d*%d=%d\t",i,j,gugu);		
			}
		}
		
		
		
	 /*1-10 홀수 합
	  * 짝수합 출력
	  */
	int sum1=0;
	int sum2=0;
	for(int i=1; i<=10; i++) {
		
		if(i%2 == 1) {
		sum1 = sum1+i;	
			
		}else {
			sum2 = sum2+i;
		}
	}
	System.out.println("홀수의 합 : "+sum1);	
	System.out.println("짝수의 합 : "+sum2);	

		/*2중 for문
		 * 
		 */
	
	}	
}


