package StudentM;
public class Subject1 {
	
	private String subName;
	private String professor;
	private String subCode;
	
	public Subject1(String subName, String professor, String subCode) {
		super();
		this.subName = subName;
		this.professor = professor;
		this.subCode = subCode;
	}
	public Subject1 () {}
	@Override
	public String toString() {
		return "과목 : "+subName + " 교수 :" + professor + " 코드 :" + subCode;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public String getSubCode() {
		return subCode;
	}
	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	
}