package day05;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
/* 숫자를 입력 받아서 , 입력 받은 숫자를 거꾸로 출력.
 * ex) 5자리 숫자를 입력 받아서.. 11456입=>65411출 
 * 각 자리수 합계 6+5+4+1+1 출력..
 * 55678 8을 1으로나눈 나머지값. 78을10으로 나눈 나머지값
 */
/*	입력받기
 * 	배열선언, 변수들 선언
 *	반복문 이용하여 마지막 자리가 없어질 때까지 배열에 저장// 합계
 */	
 
		
		
		
		Scanner scan = new Scanner(System.in);

	 
	 
	 
	 
	 int size =5;
	 int[] arr = new int[5];
	 int sum=0, i=0;
	
	System.out.println("5자리의 숫자를 입력해주세요");
	 int input = scan.nextInt();
	
	//for문 이용.. 
//	 for(i=0;i< arr.length; i++) {
//		  
//		// 12345 % 10 =5 
//		
//		arr[i] = input%10;
//		 input= input/10;
//		 sum+= arr[i];
//		 
//		
//		
//		 
//		 for(int tmp : arr) {
//			 System.out.print(tmp+" ");
//		 }
//		System.out.println();
//		System.out.println("합계 : "+ sum);
//	 }	 
		 
	 
	 
	 
	 //while문 이용
	 while(input>0) { // input 값이 0이 되기 전까지 반복 (true)
		 int b = input % 10; //마지막 자리
		 
		 
		 arr[i] =b;
		 sum=sum+b;
		 
		 input = input/10; // 몫만 저장하게됨. 정수/정수=정수
		 System.out.print(arr[i]+ " ");
		 ++i;
		 
	 }
	 System.out.println();
	 System.out.println("합계 : " + sum);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 scan.close();
		
		
	}

}
