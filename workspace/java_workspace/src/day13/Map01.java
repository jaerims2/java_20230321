package day13;

import java.util.*;

public class Map01 {

	public static void main(String[] args) {
		/* Map 
		 * -값을 2개 저장, key / value 값으로 저장
		 * -key는 중복불가, value는 중복가능
		 * -HashMap 을 가장 많이 사용
		 * 
		 * HashMap<String , Integer> map =new HashMap<String, Integer>();
		 * Map은 값이 2개여서 Iterator를 사용할수 없음.
		 * Map=> Set으로 변경 후 출력.
		 * 
		 * list , set => .add()    .get(index);
		 * map => .put(); // 추가
		 * getKey(), getValue(); // 추출
		 */
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("햄버거", 15000);
		map.put("피자", 20000);
		map.put("음료", 2000);
		map.put("과자", 2000);
		map.put("사탕", 500);
		System.out.println(map); // 순서 랜덤
		System.out.println(map.keySet()); // key값
		System.out.println(map.values()); // value값
		// key가 햄버거인 값을 출력
		System.out.println(map.get("햄버거")); // get key값 => value리턴
		
		System.out.println("------- iterator ------");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+ " : "+map.get(key));
			}
		System.out.println("------ 향상된 for문 ------");
		for(String tmp : map.keySet()) {
			System.out.println(tmp+" : "+map.get(tmp));
		}
		System.out.println(map);// key따로 value set구성
		System.out.println(map.entrySet()); // key+value
		int sum=0;
		System.out.println("-----entrySet 이용------");
		
		for(Map.Entry<String, Integer>tmp: map.entrySet()) {
			sum+=tmp.getValue();
			System.out.println(tmp.getKey()+" : "+tmp.getValue());
			}System.out.println("합계 : "+sum);
			
		for(String tmp : map.keySet()) {
			sum+=map.get(tmp);
		}System.out.println(sum);
		
		
	}

}//main끝
