package day08;

public class Method_Overloading {

	public static void main(String[] args) {
		
		/* 메서드 오버로딩 (Method Overloading) 
		 * - 동일한 이름을 가지는 메서드를 여러개 만드는 경우
		 * 1. 매개변수의 개수가 다르면 가능.
		 * 2. 매개변수의 종류(자료형 type)가 다르면 가능.
		 *    리턴타입, 이름 , 매개변수 :상관없음 
		 */
		System.out.println(sum(3, 5));
		System.out.println(sum(1.2, 1.5));
		int arr[] = { 1,2,3,4,5,6,7,8,98,9,5,4353,55,6};
		System.out.println("arr 배열의 합: "+ sum(arr));
		
		/* 가변길이 메서드 
		 * 1+2, 1+2+3 , 45+78 
		 * 연산자의 값이 일정하지 않을 경우 매개변수의 개수와 상관없이 매개값을 줄 때 사용.
		 * 
		 */
	}
	/* 더하기 메서드 생성.
	 * int num1.2 를 매개변수로 받아서 더한값 리턴
	 * 메서드명 sum
	 */
	 public static int sum(int num1,int num2) {
		 return num1+num2;
		 
	 }
	 public static double sum(int num1, double num2) {
		 return num1+num2;
	 }
	 public static double sum(double num1, double num2) {
		 return num1+num2;
	 }
	 public static double sum(double num1, int num2) {
		 return num1+num2;
	 }
	 public static int sum(int ...num) { // 가변 길이 메서드.
		 int sum=0;
		 
		 //가변길이 num은 배열처럼 사용.
		 for(int i =0; i <num.length; i++) {
			 sum= sum+num[i];
		 }
		 return sum; 
		 
	 }
}

