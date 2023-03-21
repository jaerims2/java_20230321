package day02;

public class MathClass {

	public static void main(String[] args) {
		
		/* Math.method
		 * 수학적인 기능을 하기위한 클래스.
		 * round 반올림 / 올림 / 버림 / max.min.random 등등..
		 */
		
		double num1 = 5.33456;
		double num2 = -5.23456;
		//Math.round : 반올림 메서드..
		System.out.println(Math.round(num1)); // 정수형으로 반올림함.
		//Math.ceil : 올림 
		//Math. floor : 버림
		System.out.println(Math.ceil(num1));
		System.out.println(Math.floor(num1));
		
		//Math.max.min : 최대값 최소값
		
		System.out.println(Math.max(8, 9));
		System.out.println(Math.min(num1, num2));
		
		//Math.abs 절대값
		System.out.println(Math.abs(num2));
		
		//Math.pow : 제곱 Math.sqrt: 루트, Math.ramdom : 0~1사이의 랜덤 값 추출
		System.out.println(Math.pow(2,3));
		System.out.println(Math.sqrt(25));
		System.out.println(Math.random());  // 괄호안에 값이 없음. 0~1사이의 아무 값 출력
		
		// random값.. 1~10까지의 랜덤값 추출 
		
		int random = (int)(Math.random()*20)+1; // random 변수에 랜덤메서드를 int으로 형변환.
		// (int) (Math.random()* n)+ start 숫자
		// (int)(Math.random()*55)+1 = 1부터 55 random값
		
		System.out.println(random);
		
	}

}
