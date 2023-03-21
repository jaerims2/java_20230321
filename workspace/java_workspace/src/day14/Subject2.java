package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Subject2 {

	
	Scanner scan= new Scanner(System.in);
	HashMap<String,Integer> map = new HashMap<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject2 sb = new Subject2();
		int menu =1;
		
	
		do {
			sb.printMenu();
			menu = sb.scan.nextInt();
			switch(menu) {
			case 1:sb.insert(); break;
			case 2:sb.print(); break;
			case 3: sb.printSub(); break;
			case 4: sb.modify(); break;
			case 5: sb.delete();  break;
			case 6: break;
			default : System.out.println("잘못된 메뉴 입니다."); 
				break;
			}
			
		} while(menu !=6);
		System.out.println("프로그램 종료");
		
	}

	
	// 메뉴 print
	public void printMenu () {
		System.out.println("== 성적관리 프로그램 ==");
		System.out.println("1. 성적추가 ");
		System.out.println("2. 과목별 성적조회");
		System.out.println("3. 성적 전체조회 ");
		System.out.println("4. 성적수정");
		System.out.println("5. 성적삭제");
		System.out.println("6. 종료");
		System.out.println("==  메뉴 숫자 선택  == ");
	}
	
	//성적 추가
	public void insert() {
		System.out.println("과목과 성적을 입력해주세요 (ex: 국어 90 )");
		String subject = scan.next();
		int score = scan.nextInt();
		
		if(score <0 || score >100) {
			System.out.println("잘못된 점수입니다.");
			return;
		}
		if(map.get(subject) == null) {
			map.put(subject, score);
			
		}else {
			System.out.println(subject+"는 이미 존재 합니다.");
		}
	}
	
	
	public void print() {
		int sum =0;
	
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String subject = it.next();
			int score = map.get(subject);
			sum+=score;
			System.out.println(subject+":"+score);	
		}
		System.out.println("합계 : "+ sum);
		System.out.println("합계 : "+ sum/map.size());
	}
	//과목조회 후 출력
	public void printSub() {
		System.out.println("조회할 과목을 입력해주세요");
		String std = scan.next();
		
		Integer score = map.get(std);
		if(std == null) {
			System.out.println(std+"는 없는 과목입니다.");
		} else {
			System.out.println(std+" : "+ score);
		}
	}
	//수정
	
	public void modify() {
		System.out.println("수정할 과목과 점수를 입력해주세요 ex:국어 90");
		String std = scan.next();
		int score = scan.nextInt();
		
		if(score <0 || score >100) {
			System.out.println("잘못된 점수입니다.");
			return;
		}
		map.put(std, score); // map의 key는 중복되면 덮어쓰기
		System.out.println(std+" 성적이 "+ score+" 로 변경되었습니다.");	
	}
	
	//성적 삭제
	
	public void delete() {
		System.out.println("수정할 과목을 입력해주세요 ");
		String std = scan.next();
		if(map.get(std)== null) {
			System.out.println(std+" 없는 과목입니다.");
			}
		else {
			map.remove(std);
			System.out.println(std+"과목이 삭제되었습니다.");	
		}
	}
}
