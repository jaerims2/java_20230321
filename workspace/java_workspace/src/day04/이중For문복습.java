package day04;

public class 이중For문복습 {

	public static void main(String[] args) {
		/*이중 for문 사용
		 * 다음을 출력
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 * 증감 연산  ++변수 = 1 증가하고 표현 / 변수++ = 표현 후 1 증가 
		 * 
		 */
		int t = 10;
	
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=5; j++) {
				
				--t;
				
				System.out.print(t+" ");
					
				}System.out.println();
				
			}

	/* 
	 * 
	 */
	System.out.println("-------------다음이야------------");
				for(int i =1; i<=9; i++) {
				System.out.print(i+" ");
				if(i%3 ==0) {
					System.out.println();
				}
		
	}
	
	
	
	
	
	
	
	
	}
		
	}


