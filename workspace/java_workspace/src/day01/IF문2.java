package day01;

public class IF문2 {

	public static void main(String[] args) {
		
		/*Q. 국영수 점수 합계 평균 출력
		 * 평균 80<= 합격  , 아니면 불합격
		 * 출력 = 합계 평균 평가
		 */
		int kor = 90, eng = 88, math = 77;
		int sum = kor+eng+math;
		double avg = sum/3.0;
		System.out.println("합계 : "+sum+" , "+"평균 : "+ avg);
		
//		평가를 
//		A90이상 B80 C70 D60 F60미만
		
		if(avg >= 80) {
		
			System.out.println("평가 : 합격");
		
		}else {
		
			System.out.println("평가 : 불합격");
		}
		
		
		if(avg>=90) {
			System.out.println("학점  : A");
		}else if(avg>=80) {
			
			System.out.println("학점 : B");
		
		}else if (avg >=70) {
			System.out.println("학점 : C");
			
		}else if(avg >= 60) {
			System.out.println("학점 : D");
		
	}else {
		System.out.println("학점 : F");
	}

	}
}