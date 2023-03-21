package day05;

import java.util.Scanner;

public class 배열연습 {

	public static void main(String[] args) {
		/* 5명의 점수 입력받아 배열에 저장 후
		 * 점수의 합계, 평균, 최대 최소값을 출력
		 * 
		 * 
		 * 
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		
		int size = 5;
		int[] arr1 =new int[size];
		int sum=0,avg=0, max=0,min=999,input=0;
		
		
		for(int i=0; i<arr1.length; i++) {
			
			System.out.println("점수를 입력해주세요.(5명의 점수)");
			input= scan.nextInt();
			
			arr1[i] = input;
			sum =sum+arr1[i];
			
			
			
			min = arr1[0];
			min = Math.min(min,arr1[i]);
			max = Math.max(max,arr1[i]);
			
			System.out.println(arr1[i]);
			}	
	
				avg = sum/arr1.length;
	
	
	System.out.println(sum);
	System.out.println((double)avg);
	System.out.println("최고 점수: " + max);
	System.out.println("최저 점수: "+ min);
	
	
	
	
	
	
	
	
	
	
	scan.close();
	
		}
}


