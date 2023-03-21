package day04;

public class While문 {

	public static void main(String[] args) {
		/*while(조건식) {
		 * 				실행문; (실행문은 무조건 조건식의 true);
		 * 				증감식;
		 * 				}
		 * for문 변환 시 초기화; while(조건식) { 실행문; 증감식; }
		 * while문은 조건식의 범위가 불분명할때,  
		 * 
		 */
		
		
			
			for(int i=1; i<=10; i++) {
				System.out.print(i+" ");
			}
			System.out.println();
			System.out.println("while문 활용");
			int j = 1;
			
			while(j<=10) { 
				
				System.out.print(j+" ");
				j++;
				
			}
			
			
			/*while문을 활용하여 짝수 출력
			 * 
			 * 
			 */
			
			System.out.println();
			System.out.println();
			
			
			
			int k = 0;
			int l = 0;
//			while(k<= 10) {
//				
//					System.out.print(k+ " ");
//				k+=2;
//			}
			
			while(l<=10) {l++;
				if(l%2==0) {
					
					System.out.print("dd "+l);
					
				}
				
			}
			System.out.println();
			System.out.println();
			while(k<=10) { 
				k++;
				if(k%2!=0) {
				
					continue;
				
				}
				System.out.print(k+" ");
				
				}
			
			
			
			
			
			
			
			
			
			
			
	
	}

}
