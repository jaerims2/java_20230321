package StudentM;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager implements ProgramInterface {
	Scanner scan = new Scanner(System.in);
	private ArrayList<Student1> stdList = new ArrayList<>();

	public int menuPrint() {
		System.out.println("[1] 학생추가 [2] 학생 조회 [3] 학생검색 [4] 학생삭제\n" + "[5] 수강신청 [6] 과목수정  [7] 수강철회 [8] 종료");
		System.out.println("> 입력");
		return scan.nextInt();
	}

	@Override
	public void stdAdd() {
		System.out.println("학생 이름 :");
		String stdName = scan.next();
		System.out.println("학번 :");
		String stdNum = scan.next();
		System.out.println("생년월일 : ");
		String stdBirth = scan.next();
		System.out.println("학부 : ");
		String stdFaculty = scan.next();
		System.out.println("학과 : ");
		String stdMajor = scan.next();
		Student1 std = new Student1(stdName, stdNum, stdBirth, stdMajor, stdFaculty);
		stdList.add(std);
		System.out.println(stdName + " 학생 등록이 완료되었습니다.");
	}

	@Override
	public void subAdd() {
		int index = -1;
		System.out.println("학번 입력 : ");
		String stdNum = scan.next();
		for (int i = 0; i < stdList.size(); i++) {
			if (stdList.get(i).getStdNum().equals(stdNum)) {
				index = i;
				System.out.println("과목 이름 :");
				String subName = scan.next();
				System.out.println("과목 코드 :");
				String subCode = scan.next();
				System.out.println("교수 : ");
				String professor = scan.next();
				stdList.get(i).subRegister(subName, subCode, professor);
				System.out.println(subName + " 수강신청이 완료되었습니다");
				break;
			}
		}
		if (index == -1) {
			System.out.println("등록된 학번이 없습니다.");
		}
	}

	@Override
	public void stdSearch() {
		int index = -1;
		System.out.println("조회할 학생 이름 : ");
		String stdName = scan.next();
		for (int i = 0; i < stdList.size(); i++) {
			if (stdList.get(i).getStdName().equals(stdName)) {
				index = i;
				stdList.get(i).stdprint();
				index = i;
			}
		}
		if (index == -1) {
			System.out.println("등록된 학생이름이 없습니다.");
		}
	}

	@Override
	public void stdPrint() {
		System.out.println("== 전체 학생 리스트 ==");
		int num = 0;
		for (Student1 tmp : stdList) {
			++num;
			System.out.println(num + ". " + tmp);
		}
	}

	@Override
	public void subDelete() {
		int index = -1;
		System.out.println("학번 입력 : ");
		String stdNum = scan.next();
		for (int i = 0; i < stdList.size(); i++) {
			if (stdList.get(i).getStdNum().equals(stdNum)) {
				System.out.println("삭제할 과목 입력 : ");
				String subName = scan.next();
				stdList.get(i).subDelete(subName);
				System.out.println(subName + " 과목이 삭제되었습니다.");
				index = i;
			}
		}
		if (index == -1) {
			System.out.println("등록된 학번이 없습니다.");
		}
	}

	@Override
	public void subUpdate() {
		int index = -1;
		System.out.println("학번 입력 : ");
		String stdNum = scan.next();
		for (int i = 0; i < stdList.size(); i++) {
			if (stdList.get(i).getStdNum().equals(stdNum)) {
				System.out.println("과목 입력 : ");
				String subName = scan.next();
				System.out.println("수정할 과목 이름 : ");
				System.out.println(subName + "을 대체할 과목 입력 :");
				String upName = scan.next();
				System.out.println(upName + " 교수 입력 : ");
				String professor = scan.next();
				System.out.println(upName + " 코드 입력 : ");
				String subCode = scan.next();
				stdList.get(i).subUpdate(subName, upName, subCode, professor);
				System.out.println(subName + " 과목 수정완료");
				index = i;
			}
		}
		if (index == -1) {
			System.out.println("등록된 학생이름이 없습니다.");
		}
	}

	@Override
	public void stdDelete() {
		int index = -1;
		System.out.println("삭제할 학번 입력 :");
		String stdNum = scan.next();
		for (int i = 0; i < stdList.size(); i++) {
			if (stdList.get(i).getStdNum().equals(stdNum)) {
				stdList.remove(i);
				System.out.println("삭제가 완료되었습니다.");
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("등록된 학번이 없습니다.");
		}
	}
}