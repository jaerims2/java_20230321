package day14;


import java.util.Random;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		/* 로또번호 출력 : Set (중복x)// main에서
		 * random으로 생성 1~45 중 6개
		 * Set / Map 중복 값이 있을 땐 for문 이용x
		 * 
		 * 
		 * int a = Math.random() -> Math class에 있는 메소드 호출
		 * 
		 * int a = new Random().nextInt(max)+min; -> java util 내에 random class이용(import문 추가)
		 */
		
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		int size = 6;
	
		System.out.println("while lotto");
		
		while(lotto.size()<size) {
			int ramdom = new Random().nextInt(45)+1;
			lotto.add(ramdom);
		} System.out.println(lotto);
		System.out.println("== 로또 num ==");
		for(int tmp : lotto) {
			System.out.print(tmp+" ");
			}
		System.out.println();
		System.out.println("== Tree test ==");
		System.out.println("min 값 : "+lotto.first());
		System.out.println("max 값 :"+lotto.last());
		System.out.println("제일 작은값 소모: "+lotto.pollFirst());
		System.out.println(lotto);
		
		
		
		
		
		
		
	}

}
