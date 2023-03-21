package day02;

public class 콘솔출력 {

	public static void main(String[] args) {
	/* System.out.print(); = 줄바꿈 안됨.
	 * System.out.println(); = 줄 바꿈 가능.
	 * System.out.printf(); = c언어에서 주로 사용하는 콘솔 출력함수.
	 * 
	 * 서식 지정자를 통해 데이터의 서식을 지정할 수 있음.
	 * %c :char형태 / %s : 문자열 / %d : 10진 정수. / %f : 실수
	 * escape sequence(역슬래시) 
	 * \' \" \n(줄바꿈) \r(캐리지return) \t (tab) 
	 */

		int num1 = 3;
		int num2 = 5;
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.println(num1 + num2);
		
		System.out.printf("%d+%d=%d\n",num1,num2,(num1+num2));
		
		
		double num3=5;
		double num4=670;
		System.out.println(num3/num4);
		System.out.printf("%.000000f/%.000000f=%.3f\n", num3,num4,(num3/num4));
	}

}
