package StudentManager;

import java.util.Scanner;

/*  class - studentManager - program 인터페이스 오버라이딩 후 구현 
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
*  */

public interface ProgramManager {
	// ArrayList로 변환해서 클럽에 올리기
	// CRUD 중심으로 인터페이스로 만들어서 구현

	void printStudent(); // 학생 전체리스트

	void insertStudent(Scanner scan); // 등록 시 스캐너로 입력

	void searchStudent(Scanner scan);

	void registerSubject(Scanner scan);

	void deleteSubject(Scanner scan);

}

