package StudentManager;

import java.util.Arrays;

public class Student {
	/*
	 * 학생 클래스: 한 학생의 정보를 나타내는 클래스 - 학번 , 이름 , 주민번호 , 학부, 학과, 수강과목s (과목 클래스를 배열생성) -
	 * 수강과목에 대한 번지를 대신할 count 변수 필요함.(겟셋) - 메서드 : 1. 수강과목 추가(배열이 다 찼다면 늘려주기) 그때그때 추가
	 * 2. 수강과목 삭제. - 생성자 겟 셋 / printMethod 2개
	 */

	private String name; // 이름
	private String birth; // 생년월일
	private String number; // 학번
	private String department; // 학과
	private String division; // 학부
	private int count; // 수강과목(신청)이 추가되면 count++;
	private Subject[] arraySubject = new Subject[5]; // new로 객체 생성
	
	public Student() { }
	
	public Student(String name, String birth, String number, String department, String division) {
//		super();
		this.name = name;
		this.birth = birth;
		this.number = number;
		this.department = department;
		this.division = division;
	}

	public void stdPrint() {
		System.out.println("학생명(학번) : " + name + " ( " + number + " )");
		System.out.println("학부(학과) : " + division + " ( " + department + " )");
	}

	public void subPrint() {
		// 수강과목이 없을 때 or 수강과목이 있을 때

		if (count == 0) {
			System.out.println("수강중인 과목이 없습니다.");
			return;
		}
		System.out.println("== 수강중인 과목 ==");
		for (int i = 0; i < count; i++) {
			System.out.print(arraySubject[i].getSubject()+" "); // toString 이용한 출력
		} System.out.println();
	}

	public void insertSubject(Subject subName) {
		// 매개변수 : Subject 클래스에 있는 name
		// Subject 객체를 만들어서 가져오기

		if (count == arraySubject.length) { // count = 추가된 개수 / length = 기존 개수
			Subject[] tmp = new Subject[count + 5]; // 신규 배열 생성(복사원본 보다 더 큰 배열 생성)
			System.arraycopy(arraySubject, 0, tmp, 0, tmp.length);
			// 구배열 , 시작번지 신배열 시작번지 총 개수
			arraySubject = tmp;
		}
		arraySubject[count] = subName;
		count++;
	}

	public void deleteSubject(String subName) {

		int index = -1;
		if (subName == null) {
			return;
		}

		for (int i = 0; i < count; i++) { // 추가한 길이(count) 만큼만 반복
			if (arraySubject[i].getSubject().equals(subName)) {
				// true 라면 index에 i번지 값을 저장
				// false 라면 index는 -1번지
				index = i;
				break;
			}
		}

		if (index == -1) {
			System.out.println("해당 과목은 등록되어 있지 않습니다.");
			return;
		}

		// subName을 찾아서 index값에 i번지값이 저장됨
		// 찾았을 경우 삭제.
		// 찾은 위치부터 뒷번지의 과목을 앞번지로 옮기는 작업
		for (int i = index; i < count - 1; i++) {
			arraySubject[i] = arraySubject[i + 1];
		}
		arraySubject[count - 1] = null;
		count--;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", birth=" + birth + ", number=" + number + ", department=" + department
				+ ", division=" + division + ", count=" + count + ", arraySubject=" + Arrays.toString(arraySubject)
				+ "]";
	}

	public Subject[] getArraySubject() {
		return arraySubject;
	}

	public void setArraySubject(Subject[] arraySubject) {
		this.arraySubject = arraySubject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public int getCount() {
		return count;
	}
}
