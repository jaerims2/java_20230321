package day03;

public class 최대공약수 {

	public static void main(String[] args) {
		
		/*최대 공약수 구하기
		 * 공약수  : 두 수의 공통된 약수
		 * 최대 공약수 : 두 수의 공통된 약수 중 가장 큰 값
		 * 8 과 12의  공약수 : 1 2 4 / 최대 공약수 : 4
		 */
		
		int num1 = 8;
		int num2 = 12;
		int gcd=0;
		for(int i =num2; i>=1; i--) {  // 종료값은 공약수이기 때문에 작은값으로 설정 
//			System.out.println(i);
			if(num1%i== 0 && num2%i ==0) { 
				gcd = i; //없어도됨
//				System.out.println(i);
				
				break;
				}	
			
				
			}System.out.println("두 수의 최대 공약수 : "+gcd);
	
			/* 반복횟수 : num1 부터 1씩 감소
			 * 조건이 맞다면 그냥 break;
			 * 
			 */
	
	for(int i=num1; i>=1;i--) {
		if (num1%i==0 && num2%i== 0) {
			System.out.println(i);
			break; //처음 만나는 공약수 = 최대공약수 한번 찍고 break;
		}
	}
	
				for(int i = 1; i<=num1; i++) {// 1 2 3 4567..

				
				if(num1%i==0 && num2%i==0) { 
					gcd = i;
					

					break;
					
				}System.out.println("dkdkk"+gcd);
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
	}
}


