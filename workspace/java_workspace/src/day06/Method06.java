package day06;

import java.util.Scanner;

public class Method06 {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		
		
		System.out.println("출력할 단을 입력해주세요");
		int dan = scan.nextInt();
		
		gugu(dan);
		
		
		/* 구구단
		 * 1단 출력하는 메서드..
		 * 2
		 */
		scan.close();
	}

	public static void gugu(int num) { 
		// 매개변수 : 입력받을 값 n단 => int num // return: void // 메서드이름 gugu
		System.out.println(num+"단");
		
		for(int i=1;i<=9;i++) {
			int num2 = num*i;
		System.out.printf("%d x %d = %d%n",num,i,num2);	
		}
		
	}

}