package day13;

import java.util.*;
import java.util.Collections;
import java.util.Iterator;

public class List01 {

	public static void main(String[] args) {

		/* 하루 일과를 저장하는 list 생성
		 * 
		 * 
		 * 
		 */
	
	//get이용해서 추출
		ArrayList<String> daybyday = new ArrayList();
	
	daybyday.add("am 07:30 기상");
	daybyday.add("am 08:00 밥먹기");
	daybyday.add("am 08:30 씻기");
	daybyday.add("am 08:40 학원출발");
	daybyday.add("am 09:00 수업시작");
	daybyday.add("pm 01:00 점심");
	daybyday.add("pm 06:00 수업종료");
	daybyday.add("pm 07:00 집 복귀");
	daybyday.add("pm 10:00 하루 마무리");
	daybyday.add("pm 11:00 ott시청");
	
	for(int i =0; i<daybyday.size(); i++) {
		System.out.println(daybyday.get(i));
	}
	System.out.println(daybyday);
	System.out.println(daybyday.size());
	System.out.println(daybyday.get(6));
	System.out.println();
	
	for(String tmp : daybyday) {
		System.out.println(tmp +" ");
	}
	Iterator<String> it = daybyday.iterator();
	while(it.hasNext()) {
		String tmp= it.next();
		System.out.println(tmp);
	}
	
	Collections.sort(daybyday);
	System.out.println(daybyday);
	daybyday.sort(new Test());
	System.out.println(daybyday);
	}
	

}

class Test implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		//compareTo 메서드 활용
		
		return o1.compareTo(o2);
	}
	
}