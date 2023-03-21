package day13;

import java.util.ArrayList;
import java.util.*;

public class Collection {

	public static void main(String[] args) {

		/* 컬레션 프레임워크 : 표준화된 방식의 자료구조
		 * <List Set Map>
		 * 
		 *  데이터를 묶어서 관리할 때 사용
		 *  주로배열대신 사용
		 *  
		 *  1. List 
		 * - 배열과 동일
		 * - 값을 하나씩 저장
		 * - 순서를 보장
		 * - 중복 허용
		 * - 배열 대신 ,가장 많이 사용
		 * 
		 *  2. Set
		 * 
		 * - 값을 하나씩 저장
		 * - 순서를 보장x(Index라는 번지가 없음)
		 * - 중복 허용X
		 *  
		 * 
		 * 3. Map
		 * - 값을 두개 저장, key/value 쌍으로 저장 
		 * - key는 중복 불가, value는 중복 가능
		 * - key가 중복되면 덮어쓰기 됨.(중복 허용x)
		 * - id, password처럼 같이 묶어서 하나의 자료로 저장해야 할 때 사용
		 * 
		 * int arr[] : 기본 자료형 사용가능.
		 * collection 에서는 어떤 클래스로 데이터를 관리할지 지정해야 함.
		 * 
		 * int -> Integer , String , (나머지 자료형들은 첫글자만 대문자로 변환) Byte, Boolean ...
		 * 클래스를 지정하지 않으면 Object 가 자동 들어간다.
		 * 
		 */

//		List list1 = new List(); // error
		List list1 = new ArrayList(); // Object class가 자동 지정된 케이스. list를 자동 구현함
		ArrayList list2 = new ArrayList(); // Object가 자동 지정된 케이스.
		
		// 숫자만 가능한 ArrayList 생성
		ArrayList<Integer> list = new ArrayList<Integer>(); // 
		//문자열만 가능
		ArrayList<String> list3 = new ArrayList<String>();
		
		//add() : 요소를 추가
		list.add(1);
		list.add(2);
		list.add(4);
		System.out.println(list); // list.toString과 같은 의미
		
		//size() : list의 총 개수
		System.out.println(list.size());
		
		list3.add("배고파");
		list3.add("너무너무");
		list3.add("배고파욤");
		list3.add("배가고파요");
		list3.add("배가고파요");
		System.out.println(list3);
		System.out.println(list3.size());
		//리스트 생성 후 1~10 저장 후 출력
		// 가능
		List<Integer> list10 = new ArrayList<>();
//		int size = 10;
		for(int i = 0; i<10;i++) {
			list10.add(i+1);
		}System.out.println(list10);
		for(int i = 0; i<10;i++) {
			list10.add(i+1);
		}System.out.println(list10); //
		//get(index) : index번지의 값을 가져와라
		System.out.println(list10.get(2));
		//set(index, 값) : index 번지의 값을 변경
		list10.set(0, 5);
		System.out.println(list10);
		
//		remove(index) : index 번지값 삭제
//		remove(Object) : Object 값으로 넣으면 값으로 삭제
		
		list10.remove(1); // 1번지 삭제
		System.out.println(list10);
		Integer a= 10;
		list10.remove(a);
		System.out.println(list10);
		
//		contains(Object) : list에 값이 있는지 검사 있으면 true / 없으면 false
		System.out.println(list10.contains(a));
//		clear() : list 삭제(비움)
		list10.clear();
		System.out.println(list10);
		
//		isEnpty()  :list가 비었는지 체크, 비었으면 true;
		System.out.println(list10.isEmpty());
	
		//list10에 for문으로 1~5까지만 입력
		// list10 통으로 출력
		for(int i = 5; i>0; i--) {
			list10.add(i);
		}System.out.println(list10);
		
		//list10 요소 출력
		for(int i =0; i<list10.size(); i++) {
			System.out.print(list10.get(i)+" ");
		}
		System.out.println();
		System.out.println("-----줄바꿈----------");
		
		//요즘 자주 사용 : 향상된 for문(set에서도 가능)
		for(int tmp : list10) {
			System.out.print(tmp+ " ");
		}
		System.out.println();
		System.out.println("--------줄바꿈---------");
		
		
		//Iterator : 컬렉션을 출력하기 위해 사용
		/* list는 순서를 보장하기 떄문에 get(i)를 이요하여 원하는 번지에 접근 가능.
		 * set은 순서를 보장하지 않기 때문에 for문을 이용할수 없음
		 * 향상된 for, Iterator 처럼 
		 * 순서와 상관없이 값을 가져올 수 있는 구문에서 출력가능.
		 * 
		 * 
		 */
		System.out.println();
		System.out.println("< Iterator 출력 >");
		Iterator<Integer> it = list10.iterator();
		
		while(it.hasNext()) { // 다음 요소가 있는지 체크.true / false
			Integer tmp = it.next(); // next 다음 요소 가져오기.
			System.out.print(" "+tmp + " "); // 출력
		}
		System.out.println();
		// indexOf(값) : 해당 값이 list index 번지를 반환 / 없다면-1
		Integer b = 5;
		System.out.println(list10.indexOf(b));
		
		
		//Collections.sort -> 오름차순만 가능
//		Collections.sort(list10);
		System.out.println(list10);

//		- sort(객체) : 객체= Comparator 인터페이스를 구현한 객체를 넣어야함.(익명클래스)
//		- 비교(compare) : 메서드를 사용하여 객체를 정렬
//			 내림차순 / 오름차순
//		 	String o1>o2 크기비교
		list10.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// o1-o2 : 오름차순, o2-o1:내림차순
				return o2-o1;
			}
		});
		System.out.println(list10);
	}

}
