package day04;

import java.util.Scanner;

public class 배열3 {

	public static void main(String[] args) {

		
			/* 5명의 점수를 입력 받아서 배열에 저장하고,
			 * 점수의 합계와 평균을 출력
			 * 합계 :
			 * 평균:
			 * 배열 5개,
			 */
			
		
		/* 1. 배열선언 int[] arr= new int  [size] 
		 * 
		 * 
		 */
		Scanner scan= new Scanner(System.in);
		
		
		
		
		
		int score=0;
		int input = 0;
		int size = 5;
		
		
		
		int arr[] = new int[size];
		int sum=0,avg=0,max=0,min=0;
		
		
		
		
		for(int i =0; i<arr.length; i++) {
			System.out.println("점수를 입력해주세요 ");
			score = scan.nextInt();
			
			arr[i] = score;
			sum += score;
			min =arr[0];
			max = Math.max(max,arr[i]);
			min = Math.min(min, arr[i]);
			
				
			
			
		
			
			
			System.out.println(arr[i]);			
			
			
			
		}avg = sum/arr.length;
		
		
		System.out.println(sum);
		System.out.println((double)avg);
		System.out.println("최고 점수: " + max);
		System.out.println("최저 점수: "+ min);
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
			
	
	}

}
