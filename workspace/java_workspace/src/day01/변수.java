package day01;

public class 변수 {
//클래스 선언 후 
//	메서드 시작 메서드 = 클래스 내 기능역할/ 메인메서드 꼭 있어야함
	//main method 내에서 출력가능
	public static void main(String[] args) {
		// 변수명 클래스명 한글사용 가능..
		System.out.println("method 내부");
		System.out.println(1234);
//		같은 변수를 모두 변경하는 변수 오른쪽 클릭 리펙터 리네임
//		변수 : 리터럴값을 담는 메모리 공간
//		주석 한줄주석은 코드에 영향을 미치지 않는 구문, 설명을 위한 사용
		/* 여러줄
		 * 주석입니다
		 */
//		변수 선언 방법
//		변수타입_변수명;
		
		int num,num4,num2,num3;  //선언만,동시 여러개 가능 (같은 타입의 변수만 가능)
		num = 123; //선언 후 값을 지정
//		노란밑줄: 경고 한번도 사용하지 않았음.
//		빨간 밑줄 : error
		
		int num1 =123;
		byte num5;
		char ch1;
		float fl1;
		double dou;
		boolean bool;
		
		int appleCount; // 변수명은 의미 있게 지정 카멜법으로 적기.
		int applecount; // 변수명은 대소문자 구분 다른변수가됨, 중복 변수명 선언은 error
		System.out.println("num1의 값 : "+ num1);
		
//		Q.  a라는 int 변수를 선언 후 값을 지정하고 a변수의 값을 출력하시오.
		
		
		int a;
		a = 12345;
		
		System.out.println("a의 값:"+a);
		// sysout +ctrl+space
		System.out.println("a : "+a+","+ " num1 : "+num1); // 두개의 변수 출력은  +를 이용
		
		
		// 문자 1글자 
		char ch = '\''; // ""문자열, 1글자의 문자 ''
		
//		특수문자 표현 시 역슬래시 (\') 표시
	
		
		System.out.println("ch:"+ch);
		//일반 class 는 객체를 만들어 객체로 사용 String 자료형으로사용.
		String str = "abc"; // String = 문자열을 처리하는 자료형 클래스  
		System.out.println("str:"+str);
		

		int b = 10;  //10진수의 10을 저장
		int c = 010;  //8진수의 수 10을 저장. 앞에 0을 붙인다. 8=10
		int d = 0x10; // 16진수 0x를 붙임. 0~ABCDEF 16=10
	
//		int e = 123445566767778; int 저장범위 밖의 값은 에러.
		long e = 123445566767778L; // long 형은 접미사 필수로 L을 필수로 써야함. 값이 작아도 써줘야함.		
		float f = 1.234f;
		double g = 14.34556;
		
		bool = true;
		boolean bool2 = false;
		
		int kor = 100;
		int kor2 = kor;
		// = : 대입-> 오른쪽의 변수값을 왼쪽 변수에 저장.
		//기본 실수형은 double로 인식
		//float 형의 실수값은 접미사 f F를 반드시 써야함.
		
		int s =10, h = 20, y = 30;
		int k,j =10;
		
	}
	
}
