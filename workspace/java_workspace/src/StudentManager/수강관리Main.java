package StudentManager;

import java.util.Scanner;

public class 수강관리Main {

	public static void main(String[] args) {

		/* 수강관리 프로그램 - 배열 이용
		 * interface - program
		 * 1. 학생 리스트 출력
		 * 2. 학생 등록
		 * 3. 학생 검색
		 * 4. 수강 신청
		 * 5. 수강 철회
		 * 
		 * class - subject(별도 생성)
		 * 과목 클래스 : 한 과목의 정보를 나타내는 클래스
		 * - 과목코드, 과목명, 학점, 몇시간 수, 교수명, 학기, (전공)분류, 수업 시간표 / 변수선언후 겟셋 생성자 정도..
		 * 
		 * class - student(별도 생성)
		 * 학생 클래스: 한 학생의 정보를 나타내는 클래스
		 * - 학번 , 이름 , 주민번호 , 학부, 학과, 수강과목s (과목 클래스를 배열생성) 
		 * - 수강과목에 대한 번지를 대신할 count 변수 필요함.(겟셋)
		 * - 메서드 : 1. 수강과목 추가(배열이 다 찼다면 늘려주기) 그때그때 추가 2. 수강과목 삭제.
		 * 
		 *  class - studentManager - program 인터페이스 오버라이딩 후 구현 
		 *  class main 
		 *  - 메뉴구성
		 *  - 클래스 객체 만들어서 메서드 호출
		 *  
		 *  1. 학생등록
		 *  2. 학생확인 (학생 리스트)
		 *  3. 학생검색 (한 학생의 정보(학생정보 , 수강정보) 출력)
		 *  4. 수강신청 
		 *  5. 수강철회
		 *  6. 종료
		 *  
		 */
	ProgramManager p = new Program();
	Scanner scan = new Scanner(System.in);
	String menu;
	
	
	do {
		
		System.out.println("1. 학생등록 2. 학생리스트 3.학생검색 \n"
				+ "4. 수강신청 5. 수강철회 6.종료\n");
		System.out.println("> 입력 : ");
		
		menu = scan.next();
		
		switch(menu) {
		
		case "1": p.insertStudent(scan); break; // n번 생성 시 n명의 학생 저장
		case "2": p.printStudent(); break;
		case "3": p.searchStudent(scan); break;
		case "4": p.registerSubject(scan); break;
		case "5": p.deleteSubject(scan); break;
		case "6": break;
		default: System.out.println("잘못된 메뉴입니다");break;
		}
	} while(!menu.equals("6"));
	System.out.println("종료되었습니다."); 
	scan.close();
	
	
	}

}
