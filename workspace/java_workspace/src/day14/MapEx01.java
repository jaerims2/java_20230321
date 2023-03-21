package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx01 {

	
	
	// 멤버변수 자리
	// Map생성
	private HashMap<String,String> map =new HashMap<>(); // 1.멤버변수 형태
	Scanner scan = new Scanner(System.in);
	private int size =5;
	
	public static void main(String[] args) { //static은 instance메서드를 사용불가

		/* 단어장 -> 메서드로 변경
		 * 단어를 입력 받는 메서드
		 * 
		 * 1. 저장공간을 어디에다가 둘지
		 *  1-1. 멤버변수 => 공용변수로 있는 형태
		 *  1-2. 메서드 내부에 생성 후 반환(리턴) => 리턴의 형태
		 *  1-3. main(비추) 외부 메서드 <-> 매개변수로 받는 형태. => 매개변수로 받는 형태
		 * 
		 */
	
		MapEx01 ex = new MapEx01(); 
		// map이 static이 아닌 인스턴스변수라서 캑체를 반드시 생성해야함
		
		// 저장공간에 따른 매개변수와 리턴타입을 결정/ 메서드명까지 결정 => interface생성
		//package 프로젝트 생성 후 
		//class : interface 1:1비율로 생성
		//class 파트 정해서 구현.
		
//		HashMap<String,String> map =new HashMap<>();// 3번. main
			
		
//		HashMap<String,String> map1 =ex.make2();
		
		
		
//		2번째.
//		HashMap<String,String> map =new HashMap<>();
//		ex.make2();
//		
		
		
//		3번째 .main에 매개 map생성
//		HashMap<String,String> map =new HashMap<>();
//		Iterator<String> it1 = ex.map.keySet().iterator();	//java.util
//		while(it1.hasNext()) {
//			String word = (String) it1.next(); //key 반환
//			String mean = ex.map.get(word);// value 반환
//			
//		System.out.println("단어 : " + word);
//		System.out.println("의미 : " + mean);
		
		
		
		
		// 1.멤버변수 출력형태
		ex.make1(); // 1번메서드 호출
		Iterator<String> it1 = ex.map.keySet().iterator();	//java.util
		while(it1.hasNext()) {
			String word = (String) it1.next(); //key 반환
			String mean = ex.map.get(word);// value 반환
			
		System.out.println("단어 : " + word);
		System.out.println("의미 : " + mean);
		
		}
		}
		
	
	// 1번 메서드 자리.
	// 리턴타입 매개변수 메서드명 결정
	// 1. 멤버변수로 map이 선언되어 있는 상태(저장공간 확보) = 공용 = 리턴x매개변수x
	public void make1 () { // method선언
		while(map.size()<size) { // 멤버변수의 map에 들어감
			System.out.println("단어 : ");
			String word = scan.next();
			System.out.println("의미 : ");
			String mean = scan.next();
			map.put(word, mean);
		}
	}
	
	//2. 메서드 내부에서 생성하는 형태( return 이 Map인 형태) 
	
	public HashMap<String,String> make2() {
		HashMap<String, String> map =new HashMap<String,String> () ;
		while(map.size()<size) { // 호출한 class의 매개map에 들어감
			System.out.println("단어 : ");
			String word = scan.next();
			System.out.println("의미 : ");
			String mean = scan.next();
			map.put(word, mean);
		}
		return map;
	}
	
	// 3. 외부에 map이 있는 형태 (매개변수로 map을 가져오기)
	// 
	public void make3(HashMap<String, String> map) {
		while(map.size()<size) { // 매개 map에 들어감
			System.out.println("단어 : ");
			String word = scan.next();
			System.out.println("의미 : ");
			String mean = scan.next();
			map.put(word, mean);
		}
			
	}
	
}//mainclass끝
