package day10;

public class 클래스06 {

	public static void main(String[] args) {

		/* final : 클래스, 변수, 멤버메서드에 붙일 수 있음.
		 * final : 수정 불가.
		 * final + 멤버변수 : 상수
		 * final 멤버메서드 : 오버라이딩(기존에 있는 메서드 재사용) 불가  
		 * final + class : 상속 불가. 부모 클래스가 될 수 없다.
		 */
		EzenStudent sp = new EzenStudent();
		System.out.println(sp);
		sp.setJijeom("서울");
		sp.setName("홍길동");
		sp.set반("프론트엔드");
		sp.setPhoneNum("010 123 4567");
		sp.print();
		System.out.println(); // 줄바꿈
		
		EzenStudent myip = new EzenStudent("인천", "신재림", "JAVA 웹 개발", "010 2328 5121");
		myip.print();
		System.out.println(myip);
		
		
	}

}
/* 초기화 방법 : 멤버변수 선언후 {}블럭 사용하여 지정; 
 * 기본값, 명시적 초기값 - > final , static등으로 중요도 설정 
 * 1. 명시적 초기화 : 멤버변수 선언과 동시에 초기값 지정
 * 2. 초기화 블럭{} : {}멤버변수 초기화
 * 3. 생성자 : 객체를 생성할 때 초기화 해서 생성 
 * 
 * -------------------- 우선순위 -------------------------
 * 4.기본값 > 3.명시적초기값 > 2.{} 초기화블럭 > 1.생성자(가장높음)
 * 
 */

// 멤버변수 : 지점 , 이름 , 반 , 전화번호 
// 메서드 : 출력(toString , sysout가능)
// get set
class EzenStudent {
	private String 지점 ;
	private String name;
	private String 반;
	private String phoneNum; // 010 = > int type은 8진수로 변환 - > 연산 필요 시 사용 
	{
		// 초기화 블럭 : 멤버변수들을 초기화;
		반 = "미정";
	}
	public EzenStudent()  {}
	
	
	
	public void print () {
	 System.out.println("지점 : "+ 지점);
	 System.out.println("이름 : "+ name);
 	 System.out.println("반 : "+ 반);
 	 System.out.println("핸드폰 번호: "+ phoneNum);
	}

	@Override
	public String toString() { // 프린트
		return "EzenStudent [지점=" + 지점 + ", name=" + name + ", 반=" + 반 + ", phoneNum=" + phoneNum + "]";
	}

	public EzenStudent(String jijeom, String name, String 반, String phoneNum) {

		//생성자
		super();
		this.지점 = jijeom;
		this.name = name;
		this.반 = 반;
		this.phoneNum = phoneNum;
	}

	public String getJijeom() {
		return 지점;
	}

	public void setJijeom(String jijeom) {
		this.지점 = jijeom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String get반() {
		return 반;
	}

	public void set반(String 반) {
		this.반 = 반;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
} 