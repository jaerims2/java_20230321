package day03;

public class 이중For문 {

	public static void main(String[] args) {
		/*이중 for1 : (1초기값 ; 2조건식 ; 13증감식) { for1의 1 실행
		 * 		3실행문;
		 * 		for2 (5초기화;6.9.12조건식;8.11증감식) { for1_1의 for2의 끝까지.. false가 나오면 for1 } 끝으로 나감
		 * 			7.10실행문;
		 * 		}
		 * }
		 */
		int star = 0;
		
		
		for(int i=1; i<=10; i++) { // 1. for1_1 시작 ... /i가 행
			
			for(int j =10; j>=i; j--)  {// 2. for1_for2_1~5 반복 후 빠져나와서 /j가 열
			System.out.print(" "); 
			}
			for(int t = 1; t<=i; t++) {
					System.out.print("*");
			}
			for(int t2= 2; t2<=i; t2++) {
				System.out.print("*");
			}System.out.println();
		
		} // 3. for1_2 시작전 줄바꿈.
		}
}
//		
//		/* 공백의 조건 j <=5-1; 
//		 * 
//		 * 
//		 */
//
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) { //i=1
//				if(j<=5-i) { // i=4
////					System.out.print("O");
//				}else { //나머지 1을 별로
////					System.out.print("*");
//				
//			}
//		}
//		
//		}
		
	


	
	
	

