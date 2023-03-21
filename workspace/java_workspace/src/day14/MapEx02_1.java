package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx02_1 {
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapEx02_1 ex = new MapEx02_1();
		HashMap<String, Integer> map = new HashMap<>();
		ex.make(map);
		ex.print(map);
		
		
	}
	//입출력
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
}
	
