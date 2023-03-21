package day02;

public class Swith문2 {

	public static void main(String[] args) {
		
		
		int num = (int)(Math.random()*12)-6;
		
//		System.out.println(num);
		
		if(num == 0) {
			System.out.println(num+"은 제자리");
		} else if (num > 0) {
			System.out.println(num+ "만큼 전진하세요");
		} else if (num < 0) {
			System.out.println(Math.abs(num)+ "만큼 후진하세요");
			
		}
	}
}