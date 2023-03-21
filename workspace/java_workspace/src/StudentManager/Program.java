package StudentManager;

import java.util.Scanner;

class Program implements ProgramManager {

	private Student[] student = new Student[10];
	private int stdCount; // 등록한 학생 카운트

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub

		System.out.println("----- 전체 학생 리스트 -----");
		for (int i = 0; i < stdCount; i++) {
			student[i].stdPrint();
			student[i].subPrint();
//			printAll(student[i]); // 정보 + 수강정보 출력
			System.out.println("---------------------");
		}
	}

	@Override
	public void insertStudent(Scanner scan) {
		// 1명의 학생정보 값을 입력 받아 객체를 생성한 후 student 배열에 등록
		// 학번 이름 주민번호 학부 학과
		System.out.println("== 학생정보 입력 ==");
		System.out.println(" > 이름 :");
		String name = scan.next();
		System.out.println(" > 학번 :");
		String number = scan.next();
		System.out.println(" > 생년월일 :");
		String birth = scan.next();
		System.out.println(" > 학부 :");
		String faculy = scan.next();
		System.out.println(" > 학과 :");
		String major = scan.next();
		System.out.println("--------------------------");
		Student std = new Student(name, birth, number, faculy, major);
		// 배열이 다 찼다면 ?

		if (stdCount == student.length) { // 배열이 다 찼을 경우 늘려줌
			Student[] tmp = new Student[stdCount + 5];
			System.arraycopy(student, 0, std, 0, stdCount);
			student = tmp;
		}
		student[stdCount] = std;
		stdCount++; // 인원증가 (배열 번지 증가)
	}

	@Override
	public void searchStudent(Scanner scan) {
		// 검색할 학생이름을 입력받아 배열에서 탐색 후 있다면
		// 학생정보 + 수강정보 출력 => printAll() call

		boolean a = false; // int index 로 해도 무방 // index로 할땐 입력순서도 알수있음
		System.out.println("> 검색할 이름 입력 : ");
		String name = scan.next();

		for (int i = 0; i < stdCount; i++) {
			if (student[i].getName().equals(name)) {
				a = true; // index = i;
				student[i].stdPrint();
				student[i].subPrint();
				break;
			}
		}
		if (a == false) { // (index == -1)
			System.out.println("검색하신 " + name + " 학생 정보가 없습니다");
		}
	}

	@Override
	public void registerSubject(Scanner scan) { // 수강등록
		// 이름 학번 index 필요함
		// 수강신청자 정보확인(학번) = student배열 해당 인덱스 구하기
		// if 입력한 학번이 없을시 문구 있을 시 해당 학생 객체 과목 객체배열에 저장
		// 신청할 과목의 객체 생성(과목정보 입력 받기)
		// insert(객체) 호출
		
		int index = -1;
		System.out.println("> 학번을 입력하세요");
		String input = scan.next();

		while (true) {

			for (int i = 0; i < stdCount; i++) {
				if (student[i].getNumber().equals(input)) {
					index = i;
					break;
				}
			}
			if (index == -1) {
				System.out.println("등록된 학번이 없습니다\n");
				return;
			} else {
				System.out.println("> 등록할 과목명을 입력하세요");
				String subName = scan.next();
				Subject sub = new Subject(subName);

				student[index].insertSubject(sub);
				System.out.println("수강등록이 완료되었습니다.\n");
				break;
			}
		}
	}

	@Override
	public void deleteSubject(Scanner scan) { // 수강철회

		int index = -1;
		System.out.println("> 학번을 입력해 주세요");
		String input = scan.next();

		while (true) {
			for (int i = 0; i < stdCount; i++) {
				if (student[i].getNumber().equals(input)) {
					index = i;
					break;
				}
			}
			if (index == -1) {
				System.out.println("등록된 학번이 없습니다\n");
			} else {
				System.out.println("> 철회할 과목명을 입력해 주세요");
				String input2 = scan.next();
				student[index].deleteSubject(input2);
				break;
			}
		}

	}

	// 한 학생의 학생정보 및 수강정보를 같이 출력하고 싶을 때
	public void printAll(Student std) {

		System.out.println("-- 학생정보 --");
		std.stdPrint();
		System.out.println("-- " + std + " 학생의 수강정보 --");
		std.subPrint();
	}
}
