package day01;

import java.util.Scanner;

public class IF문3 {

	public static void main(String[] args) {
//		Scanner 클래스 사용 = 값을 입력 받을 때 사용
//		import문을 사용하여 scanner클래스사용
		Scanner scan = new Scanner(System.in); 
// 		1.새로운 스캐너 객체(이름 아무개) 만듦. system in 이라는 매개변수 사용.(입력 받기)
		
		System.out.println("점수를 입력해주세요. (0~100) : 국어, 영어 , 수학 순으로 입력"); 
		int kor  = scan.nextInt();
		int eng  = scan.nextInt();
		int math = scan.nextInt();
//		3개의 정수값을 입력 받겠다.
		if(kor < 0 || kor > 100) {
			System.out.println("국어 점수오류");
		}
		if(eng <0 || eng >100) {
			System.out.println("영어 점수오류");
		}
		if(math < 0 || math>100) {
			System.out.println("수학 점수오류");
		}
		
		int sum = kor+math+eng;
		double avg = (double)sum/3.0;
		
		
		
		System.out.println("합계 : "+ sum);
		System.out.println("평균 : " + avg);
		
		char ch= 'F'; // 일반 지역변수는 초기화=초기값을 지정 해주기
		// int a = 0 / char 가 ='' 
		if(avg >100 || avg <0) { 
			System.out.println("평균 계산 오류");
		}else if(avg>=90) {
			ch= 'A';
		}else if(avg>=80) {
			ch= 'B';
		}else if (avg>=70) {
			ch = 'C';
		}else if (avg>=60) {
			ch= 'D';
		}else {
			ch= 'F';
		}
		System.out.println("등급 : "+ ch);
		scan.close();
		

	}

}
