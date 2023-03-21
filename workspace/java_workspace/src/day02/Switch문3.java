package day02;

public class Switch문3 {

	public static void main(String[] args) {

		/*계절을 출력
		 * 월 랜덤생성 1~12월 생성후 /  월과 계절을 출력
		 * 봄 3~5/6~8여름/9~11가을/12~2겨울
		 * 
		 */
	
		int num = (int)(Math.random()*12)+1;
		
		switch(num) {
		case 1: case 2:
			System.out.println(num+ "월은 겨울입니다.");
			break;
		case 3: case 4: case 5:
			System.out.println(num+" 월은 봄 입니다.");
			break;
		case 6: case 7:	case 8:
			System.out.println(num+" 월은 여름 입니다.");
			break;		
		case 9: case 10: case 11:
			System.out.println(num+" 월은 가을 입니다.");
			break;
		 case 12:
			System.out.println(num+" 월은 겨울 입니다.");
			break;
	
		}
		
		
	}

}
