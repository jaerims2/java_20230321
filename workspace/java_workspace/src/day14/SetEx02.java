package day14;

import java.util.NavigableSet;
import java.util.TreeSet;

public class SetEx02 {

	public static void main(String[] args) {

		/* TreeSet 이용
		 * score 점수들 중.
		 * 가장 큰 점수 / 작은점수 
		 */
		
		
		int[] score = {80,98,75,48,95,62,57,80}; // TreeSet변환
		TreeSet<Integer> score1 = new TreeSet<>();

		
		for(int i =0; i<score.length;i++) {
			score1.add(score[i]);
				}
		System.out.println(score1);
		//가장 큰값
		System.out.println("꼴지 : "+ score1.first());
		
		System.out.println("-------------------");
		//headSet : 지정된 객체보다 작은 객체 출력 / tailSet : 지정된 객체보다 큰값
		System.out.println(score1.tailSet(80));//80 보다 큰 객체
		System.out.println(score1.headSet(80));//80보다 작은 객체
		System.out.println(score1.subSet(70,80)); //범위 안에있는 값
		
		//범위 검색 : 70은 포함 x , 뒷쪽 값은 포함
		System.out.println(score1.subSet(70,80)); // 70~90사이의 객체
		NavigableSet<Integer> desSet =score1.descendingSet();
		
		System.out.println(desSet);
	}

}
