package day06;

public class Method05 {

	public static void main(String[] args) {

		
		/*2~100까지 소수를 출력 for문을 이용해 2~100 까지의 수를
		 * isprime을 호출하여 true라면 출력 / 아니면 pass. continue?
		 * 
		 * 
		 * */
		int sum=0;
		for(int num1=2; num1<=100; num1++ ) {
				
			if(sosu(num1)==true) {
				sum=sum+num1;
				System.out.print(num1+ " ");
			}
		}
		System.out.println();
		System.out.println("-----소수의 합계-------");		
		System.out.println(sum);
	}
	
	public static boolean sosu(int num1) {
		
		int  cnt = 0;
		
				for(int i=1; i<=num1; i++) {
				
					if(num1%i == 0) { // 조건식이 참일때 cnt+1 
						cnt = cnt+1;
						
					}
				}
				if(cnt==2) { // 위에 if
					return true;
	} 			else { 
					
					return false;
	}
				
				
				
				//소수 복습 . .
//				
//		public static boolean isPrime(int num) {
//			int cnt =0;
//			
//			for(int i=1; i<num; i++) {
//				if(num% i==0) {
//					cnt= cnt +1; // 약수의 개수
//				
//				}
//			} // for문을 빠져나와서 cnt값을 추출함.
//				if(cnt == 2) {
//				return true;
//				
//			}
//				return false;
			
				
				
				
				
				
	}
}
				
	
				
	
	


	
	/* 기능 : 정수가 주어지면 해당 정수가 소수인지 아닌지 판별(true / false)
	 * 소수 :  1과 자기자신 약수가2개인수 
	 * 리턴타입 :  boolean
	 * 
	 * 매개변수 : ?
	 * 메서드명 : isPrime
	 * 
	 */
		
	
