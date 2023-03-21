package StudentM;
import java.util.ArrayList;
public class Student1 extends Subject1 {
	private String stdName;
	private String stdNum;
	private String stdBirth;
	private String stdMajor;
	private String stdFaculty;
	private ArrayList<Subject1> subList = new ArrayList<>();
	@Override
	public String toString() {
		return "이름 :" + stdName + " 학번 :" + stdNum + " 생년월일 :" + stdBirth;
	}
	public Student1() {
	}
	public Student1(String stdName, String stdNum, String stdBirth, String stdMajor, String stdFaculty) {
		this.stdName = stdName;
		this.stdNum = stdNum;
		this.stdBirth = stdBirth;
		this.stdMajor = stdMajor;
		this.stdFaculty = stdFaculty;
	}
	public void subPrint() {
		System.out.println("== 수강 정보 ==");
		for (Subject1 tmp : subList) {
			System.out.println(tmp + " ");
		}
	}
	public void subRegister(String subName, String subCod, String professor) {
		Subject1 sub = new Subject1(subName, professor, subCod);
		subList.add(sub);
	}
	public void subUpdate(String subName, String upName, String subCode, String professor) {
		int index = -1;
		for (int i = 0; i < subList.size(); i++) {
			if (subList.get(i).getSubName().equals(subName)) {
				Subject1 sub = new Subject1(upName, professor, subCode);
				subList.set(i, sub);
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("등록된 과목이 없습니다.");
		}
	}
	public void subDelete(String subName) {
		int index = -1;
		for (int i = 0; i < subList.size(); i++) {
			if (subList.get(i).getSubName().equals(subName)) {
				subList.remove(i);
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("등록된 " + subName + " 이 없습니다.");
		}
	}
	public void stdprint() {
		System.out.println("== 학생 인적사항 ==");
		System.out.println("이름 (학번) : " + stdName + "( " + stdNum + " )");
		System.out.println("학부(학과) : " + stdFaculty + "( " + stdMajor + " )");
		subPrint();
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdNum() {
		return stdNum;
	}
	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}
	public String getStdBirth() {
		return stdBirth;
	}
	public void setStdBirth(String stdBirth) {
		this.stdBirth = stdBirth;
	}
	public String getStdMajor() {
		return stdMajor;
	}
	public void setStdMajor(String stdMajor) {
		this.stdMajor = stdMajor;
	}
	public String getStdFaculty() {
		return stdFaculty;
	}
	public void setStdFaculty(String stdFaculty) {
		this.stdFaculty = stdFaculty;
	}
	public ArrayList<Subject1> getSubList() {
		return subList;
	}
	public void setSubList(ArrayList<Subject1> subList) {
		this.subList = subList;
	}
}
