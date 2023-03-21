package day03;

import java.util.Scanner;

public class 소수구하기 {

	public static void main(String[] args) {
		
		/* 소수 : 약수가 1과 n만 가지는 수
		 * ex) 3 , 5,7,11,13 ... 
		 * 소수는 약수가 2개인 수. (1,n)  / 2개다..
		 * num를 입력 받아서 입력받은 num가 소수인지 아닌지 판별!
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);


		int num1 = 0;
		
		

		System.out.print("숫자를 입력해주세요 : ");

		int sosu = scan.nextInt(); // 먼저 입력받는 숫자

		for(int i =1 ; i<=sosu; i++) { //100을 입력했을때.. 1~100 ,,, 

				if(sosu%i==0) { //100%i==0
					// 약수의 개수
					num1= num1+1; // 카운트 0에서 1.2.4...
			}		
		}
//		
		if(num1==2) {

				System.out.println(sosu+"의 약수 개수는 "+num1+"개 입니다. 소수입니다");	
				}

		else  {
				System.out.println(sosu+"의 약수 개수는 "+num1+"개 입니다. 소수입니다.");

		}				
	
	scan.close();

	// 2~100 num1 = 2; num1<=100; num1++) { 소수인지 확인할 수
	
	}
}



	

	
