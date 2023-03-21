package day10;

public class EzenComputerMain {

	public static void main(String[] args) {
		
		
		/* 배열로 5명의 학생을 등록 후
		 * -학생이름으로 검색
		 * -지점명으로 검색
		 * 
		 */
		EzenComputer ec = new EzenComputer();
		
		
		ec.set이름("신재림");
		ec.set나이(30);
		ec.set생년월일("940807");
		ec.set핸드폰번호("01023285121");
		ec.set지점("인천");
		ec.printStudent();
		ec.insertCourse("JAVA", "6개월");
		ec.insertCourse("DB", "1개월"); // 과정2개 듣는 경우 insert추가
		ec.printCourse();
		
		
		EzenComputer ec1 = new EzenComputer("인천", "손승아", "940505", 30, "010123456");
		
		ec1.printStudent();
		ec1.printCompany();
		ec1.insertCourse("CAD ", "3개월");
		ec1.printCourse();
		System.out.println();
		EzenComputer[] std = new EzenComputer[5]; 
		
		std[0] = new EzenComputer("이범석", "0104567875", "인천");		
		std[1] = new EzenComputer("이현지", "0105555555", "서울");		
		std[2] = new EzenComputer("손승아", "0108524657", "부천");		
		std[3] = new EzenComputer("박채형", "01078974512", "인천");		
		std[4] = new EzenComputer("이범석", "010879878945", "강남");		
		
		String searchName = "이범석";// 이범석이 상담받은 지점정보/범석이 개인정보출력
		
		for(EzenComputer tmp: std) {// 이름 : private 변수라서 get으로 호출 
			if(tmp!= null && tmp.get이름().equals(searchName)) { 
				System.out.println("-- 검색한 "+ searchName +" 님의 정보 --");
				tmp.printStudent();
				tmp.printCompany();
			}System.out.println();
		}
		
		
		
		String search지점 = "인천"; 
		for(EzenComputer tmp : std) { // Ezencomputer 객체의 tmp 생성 
		if(tmp!= null && tmp.get지점().equals(search지점)) {
			System.out.println("-- 검색한 "+ search지점 +" 지점 정보--");
			tmp.printStudent();
			tmp.printCompany();
		}System.out.println();
	}
	
	
	
	}
}
