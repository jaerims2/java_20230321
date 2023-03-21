package StudentManager;

public class Subject {

	/*class - subject(별도 생성)
	 * 과목 클래스 : 한 과목의 정보를 나타내는 클래스
	 * - 과목코드, 과목명, 학점, 몇시간 수, 교수명, 학기, 
	 * (전공)분류, 수업 시간표 
	 * 겟 셋 생성자 toString 필수 
	 */
	
	/* 멤버변수 private 선언
	 * 
*/	
	private String subjectCode; // 기본 값 null
	private String subject; // 과목
	private double grade;//학점
	private String professor; // 교수
	private String term; // 학기
	private int subTime; // 시
	private String subCategory;
	private String subScheduler;

	// 생성자는 기본 아무것도 없는 값을 가지고 있다 : 생성자를 추가하지 않는다면 자동 생성
	// 추가 생성자를 만든다면 기본 생성자는 사라짐 (자동생성x -> 직접 만들어야함)
	public Subject() { }; // 기본생성자
	
	public Subject(String subName) { // 과목명만 가지는 생성자
		this.subject = subName;
	}

	public  Subject(String subCode, String subName, double grade) {
		this.grade = grade;
		this.subject = subName;
		this.subjectCode = subCode;
	}
	
	public Subject(String subjectCode, String subject, double grade, 
			String professor, String term, int subTime,
			String subCategory, String subScheduler) {
//		super();
		this.subjectCode = subjectCode;
		this.subject = subject;
		this.grade = grade;
		this.professor = professor;
		this.term = term;
		this.subTime = subTime;
		this.subCategory = subCategory;
		this.subScheduler = subScheduler;
	}
	
	@Override
	public String toString() {
		return "Subject [subjectCode=" + subjectCode + ", subject=" + subject + ", grade=" + grade + ", professor="
				+ professor + ", term=" + term + ", subTime=" + subTime + ", subCategory=" + subCategory
				+ ", subScheduler=" + subScheduler + "]";
	}

	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public String getTerm() {
		return term;
	}
	
	public void setTerm(String term) {
		this.term = term;
	}
	
	public int getSubTime() {
		return subTime;
	}
	
	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}
	
	public String getSubCategory() {
		return subCategory;
	}
	
	
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	
	
	public String getSubScheduler() {
		return subScheduler;
	}
	
	public void setSubScheduler(String subScheduler) {
		this.subScheduler = subScheduler;
	}
	
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
}

