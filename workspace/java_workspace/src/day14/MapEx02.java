package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MapEx02 {

	
	private HashMap<String,Integer> map =new HashMap<>(); // 1.멤버변수 형태
	Scanner scan = new Scanner(System.in);
	private int size =100;
	private int sum=0;
	
	public static void main(String[] args) {

		/* Map에 상품명과 가격을 입력받고 출력(=단어장)
		 * 
		 * 총 지불가격 출력 // 뭐구매할지 보여주기 sum 
		 * 입력 / 출력 -> 메서드로 구현 static 금지.
		 */
		MapEx02 ex = new MapEx02();
		
		int sum=0;
		System.out.println("상품/ 가격등록 (n입력 : 종료)");
		ex.map();
		for(Map.Entry<String, Integer>tmp: ex.map.entrySet()) {
			
			sum+=tmp.getValue();
			System.out.println(tmp.getKey()+" : "+tmp.getValue());
			}
		System.out.println("합계 : "+ sum);
		
	
	}//main
	
	
	public void map2 () {
		HashMap<String, Integer> map2 = new HashMap<>();
		
		System.out.println("상품 / 가격 등록(n : 종료) ");
		while(true) {
			System.out.println("상품이름 : ");
			String name = scan.next();
			System.out.println("가격 : ");
			Integer price = scan.nextInt();
			map2.put(name, price);
			sum+=price;
			}
	}
				
		public void map () { // method선언
		while(true) { // 멤버변수의 map에 들어감
			System.out.println("상품이름 : ");
			String name = scan.next();
			if(name.equals("n")) {
				System.out.println("종료되었습니다.");
				break;}
			
			System.out.println("가격 : ");
			Integer price = scan.nextInt();
			map.put(name, price);
			sum+=price;
		}
	}
}
