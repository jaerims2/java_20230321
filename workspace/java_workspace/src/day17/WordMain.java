package day17;

import java.io.IOException;
import java.util.Scanner;


public class WordMain {

	public static void main(String[] args) throws IOException {
		Scanner scan= new Scanner(System.in);
		WordManager wm = new WordManager();
		
		int menu = -1;
		wm.exWord();
		do {
			wm.printWord();
			wm.menu();
			System.out.println("> 입력 : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1: wm.insertWord(scan); break;
			case 2: wm.searchWord(scan); break;
			case 3: wm.modifyWord(scan); break;
			case 4: wm.printWord(); break;
			case 5: wm.fileWord(); break;
			case 6: wm.deleteWord(scan); break;
			case 7: break;
			default: System.out.println("잘못된 입력"); break;
			}
		}while (menu != 7); 
		System.out.println("종료되었습니다");	
		
		scan.close();
	}
}
