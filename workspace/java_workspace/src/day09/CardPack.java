package day09;

public class CardPack {
 
	/* CardPack 클래스
	 * - 카드팩 : 52장의 카드들
	 * 
	 * -카드를 섞는 기능
	 * -한장을 선택하는 기능
	 * -카드 초기화 기능
	 * -출력 기능
	 * -card 클래스에서 가져오기.
	 * -생성자 - 52장의 카드를 모두 생성( 객체(card)=자료형 / 52개의 값을 배열에 담기)
	 */
	/* 멤버변수 : 1. 카드를 담을 수 있는 객체 배열 52장 (main)
	 *          2. 
	*/
	private Card[] pack = new Card[52]; // 카드 팩 배열 
	private int cnt=0; // 카드가 남아있는 개수 // pack 번지
	
	/* 1.카드 섞기 기능.
	 * 메서드명 : shuffle
	 * 매개변수 : arr[]
	 * 리턴 타입 :  
	 */
	
	public void shuffle() {
		
		int min =0;
		int max =pack.length-1;
		  // 
		for(int i =0; i<pack.length; i++) {
			int index = (int)(Math.random()*(max-min-1))+min;
			Card tmp = pack[i];
			pack[i] = pack[index];
			pack[index] = tmp;
		}
	}
	/* 카드를 한 장 빼내느 pick..
	 * 메서드명 : pick 
	 * 리턴 : 생성자의 Card 1장..
	 * cnt = 52 가정 / Card
	 */
	public Card pick() {
		if(cnt == 0) {
			return null; // 객체의 기본값 null을 리턴
		}
			cnt--;
			return pack[cnt];
		
	}
	
	/* 초기화를 카드개수 
	 */
	public void init() {
		cnt = 52;
//		char shape ='♥';
//		for(int i=1; i<=4; i++) {
//			switch(i) 	{
//				case 1: shape = '♥'; break;
//				case 2: shape = '♣'; break;
//				case 3: shape = '◆'; break;
//				case 4: shape = '♠'; break;
//				}
//			for(int j =1; j<=13; j++) {
//			 Card c= new Card(); // 카드한장 생성
//			 c.setShape(shape);
//			 c.setNum(j);
//			 pack[cnt] = c; // shape = 하트,
//			 cnt++; // 번지 증가 
//		}
	}
	public CardPack() {
		/* 객체: 52개 다 만들기
		 * 
		 */
		// ♥ ♣ ◆ ♠
		char shape = '♥';
		for(int i=1; i<=4; i++) {
			switch(i) 	{
				case 1: shape = '♥'; break;
				case 2: shape = '♣'; break;
				case 3: shape = '◆'; break;
				case 4: shape = '♠'; break;
				}
			for(int j =1; j<=13; j++) {
			 Card c= new Card(); // 카드한장 생성
			 c.setShape(shape);
			 c.setNum(j);
			 pack[cnt] =c; // shape = 하트,
			 cnt++; // 번지 증가 
			}
		}
	}
	
}//CardPack클래스끝
