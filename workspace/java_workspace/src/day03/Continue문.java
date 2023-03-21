package day03;

public class Continue문 {

	public static void main(String[] args) {

		/*continue : pass 지금만 패스 ..(조건이 true면) 
		 * 1-10 까지 출력 5만 빼고 출력.
		 * 1234678910
		 * 
		 */
	
		for(int i = 1; i<=10; i++) {
			if(i == 5) { //5와 같다면 pass하겠다.
				continue;
			}
			
			System.out.print(i+" "); // continue문을 타고 5가 pass 되며 출력.
			
		}System.out.println();
	
		for(int i = 1; i<=10; i++) {
			if(i%2!=0) { // != 같지 않다. == 같다 
				
				continue;
			}
			System.out.print(i+" ");
		}
	
	
	
	
	
	
	
	
	}
	

}
