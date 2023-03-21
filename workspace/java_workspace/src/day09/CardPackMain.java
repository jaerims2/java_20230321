package day09;

public class CardPackMain {

	public static void main(String[] args) {

		/* 카드 생성
		 * 
		 * 
		 * 
		 */
		Card c= new Card(); // 하트1
//		c.print();
		CardPack cp =new CardPack();
//		Card tmp = cp.pick();
//		tmp.print();
//		tmp = cp.pick();
//		
		//4줄 
		//한 모양이 끝나면 줄바꿈
		
		
		System.out.println();
		char shape = ' ';
		Card c1= new Card();

			for(int i=1; i<=4; i++) {
				for(int j=1; j<=13; j++) {
					Card tmp = cp.pick();
					tmp.print();
				}
				System.out.println();
			
			}
			System.out.println("---------------------");
			cp.init();
			cp.shuffle();
			
		a:  for(int i =1; i<=4; i++) {
			for(int j=1; j<=13; j++) {
				Card tmp2= cp.pick();
				if(tmp2 != null) {
				tmp2.print();
			} else {
				System.out.println("카드가 없습니다 . 초기화하세요");
				break a;
				}
		
			}
			System.out.println();
		}
			System.out.println("---------------------");
			cp.init();
			cp.shuffle();
			cp.pick().print();
			
	}	
}

