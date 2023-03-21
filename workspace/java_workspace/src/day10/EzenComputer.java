package day10;

import java.util.Arrays;


public class EzenComputer {
	/* 학생 -기본정보
	 * 학원정보 : 학원이름 ="EZEN"final, 지점
	 * 수강정보 : 수강과목, 기간
	 * 출력정보
	 * - 한명의 학생은 여러과목 수강가능(과목 여러개..)
	 * 과목, 기간=> 배열로 처리.. -> 기본 5
	 * 홍길동 991818, 나이 20 , 번호 1234567 = 학생정보
	 * EZEN, 지점 인천 = 학원정보
	 * 자바(6개월), DB(1개월), html(2개월) = 수강정보
	 * 
	 * 
	 * 메서드
	 * 학생의 기본정보 출력
	 * 학생의 학원정보 (+이름) 출력
	 * 학생의 수강정보
	
	 */ 

	public final static String company= "EZEN";
	private String 이름;
	private String 생년월일;
	private int 나이;
	private String 핸드폰번호;
	


	private String 지점;
	private String [] group = new String [5];
	private String [] course =new String [5];
	private int cnt=0;
	
	
	public EzenComputer() { }
	
	
	public EzenComputer(String 지점, String 이름, String 생년월일, int 나이,String 핸드폰번호) {
//		super();
		this.지점 = 지점;
		this.이름 = 이름;
		this.생년월일 = 생년월일;
		this.나이 = 나이;
		this.핸드폰번호 = 핸드폰번호;
		}
	public EzenComputer(String 이름, String 핸드폰번호, String 지점) {
		this.이름= 이름;
		this.핸드폰번호=핸드폰번호;
		this.지점=지점;
	}

	
	
	public void printStudent() {
		
		System.out.println("name: "+ 이름);
		System.out.println("birth: "+ 생년월일);
		System.out.println("age: "+ 나이+" 세");
		System.out.println("phone Number : "+ 핸드폰번호);
		System.out.println("지점 : "+ 지점);
	}
	
	
	public void printCompany() { 
		System.out.println("---"+이름+"학생의 학원정보-------");
		System.out.print("학원명 : "+ company+" / 지점 : "+ 지점);
		}
	
	
	//for문으로 반복하여 출력 : 배열
	public void insertCourse(String group, String 기간) {
		this.group[cnt] = group; 
		this.course[cnt] = 기간;
		cnt++; //과목 추가시 index 번지 1씩 증가.
	}
	
	 public void printCourse() { // 수강과목 및 기간 출력 메서드
	        if(group == null || group.length == 0 || cnt == 0) {
	            System.out.println("수강 이력이 없습니다.");
	            return; // 실행되면 결과값을 리턴(break;).  메서드의 종료. 이후 실행 안됨.
	        }
	        
	        for(int i=0; i<cnt;i++) { // 추가되지 않은 값은 출력 x
	            System.out.print("과정: "+ group[i]);
	            System.out.println("(기간: "+ course[i]+")");
	        }
	
	 }
	
	

	
	
	
	
	
	
	
	
	
	
	
	 public String get핸드폰번호() {
		 return 핸드폰번호;
	 }
	 
	 public void set핸드폰번호(String 핸드폰번호) {
		 this.핸드폰번호 = 핸드폰번호;
	 }
	
	public String get지점() {
		return 지점;
	}

	public void set지점(String 지점) {
		this.지점 = 지점;
	}

	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public String get생년월일() {
		return 생년월일;
	}

	public void set생년월일(String 생년월일) {
		this.생년월일 = 생년월일;
	}

	public int get나이() {
		return 나이;
	}

	public void set나이(int 나이) {
		this.나이 = 나이;
	}

	public String[] getGroup() {
		return group;
	}

	public void setGroup(String[] group) {
		this.group = group;
	}

	public String[] getPeriod() {
		return course;
	}

	public void setPeriod(String[] 기간) {
		this.course = 기간;
	}

	public static String getCompany() {
		return company;
	}


	public int getCnt() {
		return cnt;
	}


	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	
	
	
}

