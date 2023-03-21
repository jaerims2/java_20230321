package day06;

import java.util.Scanner;

public class Method07 {

	public static void main(String[] args) {


		
		Scanner scan= new Scanner(System.in);
		System.out.println("기호를 입력해주세요");
		String str = scan.next();
		System.out.println("숫자를 입력해주세요");
		int num = scan.nextInt();
		
		a(num, str);
		
		
		
		/* 숫자와 기호를 주고 기호를 숫자만큼 출력(void) 
		 * ex) 3, *=> ***
		 * ex) 5, O=> ooooo
		 * ex) 7, ★ -> 별 x7
		 */
		
		scan.close();
	}

	
	
	
	public static void a(int num, String str) {
		
		for(int i=1;i<=num; i++) {
			 System.out.print(str);
		}
	}

	public static void symbol(int num, String st) {
		for(int i=1; i<=num; i++) {
			System.out.print(st);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}			
			
		
	
	
	

