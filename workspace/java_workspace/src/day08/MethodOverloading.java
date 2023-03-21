package day08;

public class MethodOverloading {

	public static void main(String[] args) {
		/* calc(1,2,"+")
		 * calc(1,"+",2)
		 * calc("+",1,2)
		 * 메서드 오버로딩을 이용하여 두 정수와 연산자,  두 실수와 연산자를 입력했을 때
		 * 연산의 결과가 출력되는 calc 메서드를 완성하세요.
		 * 잘못된 연산자 입력 시 잘못된 연산자 입니다. 
		 */
	
		calc(1, "+", 3);
		
	
	} // main 끝
	public static void calc(int num1,int num2,String op) {
		if(op != "+") {
			System.out.println("잘못된 연산자입니다.");
		}else
			System.out.println(num1+"+"+num2+" = "+(num1+num2));
	}
	public static void calc(int num1,String op,int num2) {
		if(op != "+") {
			System.out.println("잘못된 연산자입니다.");
		}else
			System.out.println(num1+"+"+num2+" = "+(num1+num2));
	}
	public static void calc(String op,int num1,int num2) {
		if(op != "+") {
			System.out.println("잘못된 연산자입니다.");
		}else
			System.out.println(num1+" + "+num2+" = "+(num1+num2));
	}
	
	
	
	
	
}
