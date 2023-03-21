package day15;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class WordProgram implements ManagerWord {

	Scanner scan = new Scanner(System.in);
	private ArrayList<Word> wList = new ArrayList<>();

	public int menu() {
		System.out.println("1. 단어 추가");
		System.out.println("2. 단어 출력");
		System.out.println("3. 단어 검색");
		System.out.println("4. 단어 수정");
		System.out.println("5. 단어 삭제");
		System.out.println("6. 파일 출력");
		System.out.println("7. 종료");
		System.out.println("> 입력");
		return scan.nextInt();
	}

	public void exWord() {
		wList.add(new Word("1", "미리 추가한 단어"));
		wList.add(new Word("하", "2"));
		wList.add(new Word("가", "3"));
		wList.add(new Word("다", "4"));
		wList.add(new Word("나", "5"));
		wList.add(new Word("파", "7"));
	}

	@Override
	public void add() {
		for (int i = 0; i < 5; i++) {
			String word;
			System.out.println("> 5개의 단어 입력 ( " + (i + 1) + " 번째) :");
			word = scan.next();
			System.out.println("> 의미 입력 : ");
			String mean = scan.next();
			Word w = new Word(word, mean);
			wList.add(w);
		}
	}

	@Override
	public void wordPrint() {
		int num = 0;
		wList.sort(new Comparator<Word>() {
			@Override
			public int compare(Word o1, Word o2) {
				return o1.getWord().compareTo(o2.getWord());
			}
		});
		for (Word tmp : wList) {
			++num;
			System.out.println(num + ") " + tmp);
		}
	}

	@Override
	public void update() {
		int index = -1;
		System.out.println("단어를 입력하세요");
		String word = scan.next();
		System.out.println("의미를 입력하세요");
		String mean = scan.next();
		for (int i = 0; i < wList.size(); i++) {
			if (wList.get(i).getWord().equals(word)) {
				Word w = new Word(word, mean);
				wList.set(i, w);
				System.out.println("> " + word + " 수정이 완료되었습니다");
				index = i;
			}
		}
		if (index == -1) {
			System.out.println("등록된 단어가 없습니다");
		}
	}

	@Override
	public void delete() {
		int index = -1;
		System.out.println("삭제할 단어를 입력하세요");
		String word = scan.next();
		for (int i = 0; i < wList.size(); i++) {
			if (wList.get(i).getWord().equals(word)) {
				wList.remove(i);
				index = i;
				System.out.println("> " + word + "삭제가 완료되었습니다.");
			}
		}
		if (index == -1) {
			System.out.println("등록된 단어가 없습니다");
		}
	}

	@Override
	public void search() {
		int index = -1;
		int i = -1;
		System.out.println("검색할 단어 or 의미를 입력하세요");
		String word = scan.next();
		for (Word tmp : wList) {
			i++;
			if (wList.get(i).getWord().equals(word) || wList.get(i).getMean().equals(word)) {
				System.out.println(tmp);
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("등록된 단어나 의미가 없습니다.");
		}
	}

	public void filePrint() {

		try {
			PrintWriter pw1;
			pw1 = new PrintWriter("word.txt");
			StringBuffer sb = new StringBuffer();
			for (Word tmp : wList) {
				sb.append(tmp);
				sb.append("\r\n");
			}
			pw1.write(sb.toString());
			System.out.println("파일 출력 완료\n");
			pw1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}