package day05;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {


		/* 5개의 파일명이 주어졌을 때, 원하는 단어를 입력하면 입력한 단어가 있는
		 * 파일들을 출력하도록 코드를 작성.
		 * ex) java = > 검색 java가 포함되어있는 파일들이 나오게끔..
		 * ex) jpg=> jpg가 적혀있는 배열 값 전체 출력
		 */
	
		Scanner scan= new Scanner(System.in);
		int cnt =0;
		String[] fileName = {"java의 정석.txt","이것이 java다.jpg", "string 메서드.txt","String 함수,jpg","java의 정석표시.jpg"};
		System.out.println("원하는 단어를 입력해주세요.");
		String input = scan.next();
		System.out.println(" ---검색 값 :"+ input + "-------");
		
		
		
		for(String tmp  : fileName) {
			
			
			
			if(tmp.contains(input)) { // 
				System.out.println(tmp);
				cnt++;
			}
			
		}
		if (cnt ==0) {
			System.out.println("검색값이 없습니다");
		}
			 
	

		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
