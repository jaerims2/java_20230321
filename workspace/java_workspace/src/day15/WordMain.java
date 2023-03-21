package day15;

import java.io.IOException;

public class WordMain {
	public static void main(String[] args){
		WordProgram wp = new WordProgram();
		boolean run= true;
		wp.exWord(); // 단어 미리 추가
		do {
			switch (wp.menu()) {
			case 1:
				wp.add(); break;
			case 2:
				wp.wordPrint(); break;
			case 3:
				wp.search(); break;
			case 4:
				wp.update(); break;
			case 5:
				wp.delete(); break;
			case 6: wp.filePrint(); break;
			case 7: run = false; break;	
			default:
				System.out.println("잘못 입력하셨습니다");
				break;
			}
		} while (run == true);
		System.out.println("종료되었습니다.");
	}
}