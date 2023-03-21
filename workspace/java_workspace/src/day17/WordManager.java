package day17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


import day15.Word;

public class WordManager {
	/*
	 * package day15에서 생성한 Word 클래스 객체화해서 사용
	 */
	private ArrayList<Word> list = new ArrayList<>();

	// 1단어등록 , 2검색 , 3수정 , 4단어출력, 5파일로출력 6단어삭제

	public void menu() {
		System.out.println("------단어장 프로그램 --------");
		System.out.println("[1] 단어추가 [2] 검색 [3] 수정\n" + "[4] 출력 [5] 파일출력 [6] 삭제 [7] 종료");
	}

	public void exWord() {
		list.add(new Word("가", "1"));
		list.add(new Word("하", "2"));
		list.add(new Word("파", "9"));
		list.add(new Word("쵸", "4"));
		list.add(new Word("뚀", "0"));
		list.add(new Word("잉", "55"));
	}

	public void insertWord(Scanner scan) {
		System.out.println("단어 입력 : ");
		String word = scan.next();
		System.out.println("의미 입력 : ");
		String mean = scan.next();
		list.add(new Word(word, mean));
		System.out.println(word + " 단어 추가 완료");
	}

	public void searchWord(Scanner scan) {
		System.out.println("검색단어입력");
		String word = scan.next();
		for (Word w : list) {
			if (w.getWord().equals(word)) {
				System.out.println("검색 결과 >" + w);
				return;
			}
		}
		System.out.println("검색 단어가 없습니다.");
	}

	public void modifyWord(Scanner scan) {
		System.out.println("수정단어 입력 : ");
		String word = scan.next();
		System.out.println("수정 단어 입력 : ");
		String newWord = scan.next();
		System.out.println("수정 의미 입력 : ");
		String mean = scan.next();
		Word w = new Word(newWord, mean);
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getWord().equals(word)) {
				list.set(i, w);
				return;
			}
		}
		System.out.println("등록된 단어가 없습니다");

	}

	public void printWord() {
		System.out.println("--- 단어장 ---");
		list.sort(new Comparator<Word>() {
			@Override
			public int compare(Word o1, Word o2) {
				return o1.getWord().compareTo(o2.getWord());
			}
		});
		for (Word w : list) {
			System.out.println(w);
		}
	}

	public void fileWord() throws IOException {
		FileWriter fs = new FileWriter("word1.txt");
		BufferedWriter bw = new BufferedWriter(fs);
		
		StringBuffer sb = new StringBuffer();
		String data = null;
		int cnt = 0;
		sb.append("== 단어장 =="+"\r\n");
		while(cnt < list.size()) {
			sb.append(list.get(cnt).toString());
			sb.append("\r\n");
			cnt++;
		}
		data = sb.toString();
		bw.write(data);
		System.out.println("출력 완료");
		bw.close();
		fs.close();
//				StringBuffer sb = new StringBuffer();
//		try {
//			PrintWriter pw = new PrintWriter("word2.txt");
//			
//			for(Word tmp : list) {
//				sb.append(tmp+"\r\n");
//			}
//			pw.append(sb.toString());
//			
//			pw.close();
//			System.out.println("파일 출력 완료");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		
	}

	public void deleteWord(Scanner scan) {

		System.out.println("삭제단어 입력 : ");
		String word = scan.next();

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getWord().equals(word)) {
				list.remove(i);
				System.out.println(word +" 단어삭제 완료");
				return;
			}
		}
		System.out.println("등록된 단어가 없습니다");

	}
}
