package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class 과제1 {
	
	public static void main(String[] args) {
				// 과제1.
				Scanner scan = new Scanner(System.in);
				HashMap<String, String> note = new HashMap<String, String>();
				 
					
				for(int i = 1; i<=5; i++) {
					System.out.println("5개의 단어와 의미를 입력해주세요 ( n: 종료 )");
					System.out.println("단어 입력 >");
					String std = scan.next();
					if(std.equals("n")) {
						System.out.println("종료되었습니다");
					}
					System.out.println("의미 입력 > ");
					String mean = scan.next();
					note.put(std, mean);
				} 
				
				System.out.println(" == 입력하신 단어 List == ");
				System.out.println(note);
				
				
	
	
		HashMap<String,String> map = new HashMap<String, String> ();
		
		int size =5;
		//Map 길이 설정 
		
		while(map.size()< size) {// size 가  5보다 크면 
			
			System.out.println("단어 > ");
			String word = scan.next();
			System.out.println("뜻 :>");
			String mean =scan.next();
			
			map.put(word, mean);
		}
			
		Iterator it1 = map.keySet().iterator();	//java.util
			while(it1.hasNext()) {
				String word = (String) it1.next(); //key 반환
				String mean = map.get(word);// value 반환
				
			System.out.println("단어 : " + word);
			System.out.println("의미 : " + mean);
			
	
		
		
		
		
		
		}
	}
	
	
	
	
	
	
	
	}//main 