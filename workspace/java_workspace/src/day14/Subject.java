package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Subject {
		

	static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		/* map을 이용하여 성적관리 프로그램 작성
		 * >> menu 
		 * 1. 성적추가 (국어 97) 
		 * 2. 성적조회 (전체 출력) : 합계/평균(전체조회 할때만)
		 * 3. 성적조회 (과목) : 서치 후 일치하는 과목 출력 
		 * 4. 성적수정 : 서치 후 수정(국어 과목을 수정하겠습니다)
		 * 5. 성적삭제
		 * 6. 종료
		 * 
		 * C: Create생성 / R:read 조회 / U: update 수정 / D: delete 삭제 
		 */
	
	
		// class 를 list화
//		ArrayList<Subject>
	
		Subject sj = new Subject();
		
		HashMap<String, Integer> Map1 = new HashMap<String,Integer>();
		
		int avg= 0;
		
		
	            sj.menu();
	            
	            int input = scan.next().charAt(0);
	            switch(input) {
	            case '1': sj.make(Map1); break;
	            case '2': sj.print(Map1); break;
	            case '3': sj.search(Map1); break;
	            case '4': sj.search(Map1); break;
	            case '5': break;
	            case '6': System.out.println("프로그램 종료");break;
	            default: System.out.println("잘못 입력하셨습니다"); break;
		 	}   
	}
	 
			
		
				
			
			
	
	public void search(HashMap<String, Integer> map) {
		
		Iterator<String> it = map.keySet().iterator();
		String std=null;
		
		while(it.hasNext()) {
			std = scan.next();
			String key= it.next();
			Integer value =map.get(key);
			if(std.equals(key))
			System.out.println(key +" 점수 검색 결과입니다 >");
			System.out.println(key+" : "+ value);
		}
	}

	public void make(HashMap<String, Integer> map) {
		// main map을 매개 map으로 사용
		int size = 3;
		
		while(map.size()<size) {
		System.out.println("상품");
		String product = scan.next();
		System.out.println("가격");
		int price = scan.nextInt();
		
		map.put(product, price);
		}
	}
	public void print(HashMap<String, Integer> map) {
		Iterator<String> it = map.keySet().iterator();
		int sum=0;
		while(it.hasNext()) {
			String key= it.next();
			Integer value =map.get(key);
			sum+=value;
			System.out.println(key+" : "+ value);
		}System.out.println("합계 : "+ sum);
	}

	public void update (HashMap<String, Integer> map) {}
	
	public void menu () { // 메뉴출력
		System.out.println("== 성적관리 프로그램 ==");
		System.out.println("1. 성적추가 ");
		System.out.println("2. 과목별 성적조회");
		System.out.println("3. 성적 전체조회 ");
		System.out.println("4. 성적수정");
		System.out.println("5. 성적삭제");
		System.out.println("6. 종료");
		System.out.println("==  메뉴 숫자 선택  == ");
	}
}
