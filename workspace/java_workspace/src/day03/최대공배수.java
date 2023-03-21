package day03;

public class 최대공배수 {

	public static void main(String[] args) {
//		최대 공배수
		/* 배수 :곱해서 나타나는 수
		 * 2의 배수 : 246810............ 무한
		 * 공배수 : 두 정수에서 공통적으로 있는 배수 / 최소 공배수: 공배수에서 최소값
		 * 10의 배수 : 10 20 30 40 50 60 .. / 15의 배수 : 15 30 45 60 75...
		 * 공배수 : 30부터 60... 무한
		 * 최소 공배수 : 30 
		 */
		
		int num1=10;
		int num2=15;
		
		int gg = 0;
		for(int i=num1;;i+=num1) {
			
			
			
			if(i%num1 == 0 && i%num2==0) {
				
				System.out.println("두 수의 최소공배수 : "+i);
				break;
			}
		}
		
		for(int j = num1; j>=1; j--) {
			if(num1%j==0 && num2%j==0) {
				System.out.println("최대공약수: "+j);
				System.out.println("최소공배수: "+num1*num2/j);
				break;
			}	
		}
		/* 최소 공배수 구하는 다른 방법
		 * 두 수를 곱해서 최대공약수로 나누기
		 *10*15 = (최소공배수)150/(두수의최대공약수)5=30 
		 */
		}
		 
	}

