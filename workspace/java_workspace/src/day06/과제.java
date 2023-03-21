package day06;

import java.util.Scanner;

public class 과제 {

	static Scanner scan = new Scanner(System.in);
	// 멤버변수 (class 내 모든 메서드에서 공통적으로 사용가능)
	
	public static void main(String[] args) {

		/* ㄱㅖ산기(덧 뺼 곱 나누기 나머지) 가각가가 메서드 만들기
		 * 메서드에서 바로 출력(void) 3+2=5
		 * 1. 숫자를 배열로 입력받는 메서드 (Scanner로 입력받아서 매개변수는 없음)
		 * 	입력 받은 숫자를 int배열로 리턴
		 *  
		 * 숫자를 배열로 받아주세요...int[] int[0] =num1, int[1]=num2
		 * 2.메뉴 메서드
		 *  -원하는 계산을 선택해주세요 scan >  switch
		 *  -1: 덧셈 2:뺄샘 3:곱셈 4나눗셈 5나머지 즁 골라주세요!!
		 *  3. 각기능 메서드 => 메서드에서 바로 출력..
		 *  
		 *  
		 * 3. 메인에서 처리.. 스위치로
		 *   1.1메서드) 입력받은 숫자 호출 => 숫자를 배열로 저장
		 *   2. 2번 메서드 호출 = > 내가 선택한 번호 return 받아서 가져오기..
		 *   3. switch(2번 return)
		 *   4. case에 따라서 계산기 메서드 호출.
		 */
		int arr[] = input();
		int input3 = menu();
		//메소드를 호출하려면 main에 먼저 리턴타입에 맞는 변수선언해주기!
		
		switch(input3) {
		case 1: 
			aa(arr);
			break;
		
		case 2:
			bb(arr);
			break;
		case 3:
			cc(arr);
			break;
		case 4:
			dd(arr);
			break;
		case 5:
			ee(arr);
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			break;
		}
			
	}
	
		public static int[] input() {
			
			
			
			
			
			
			
			int[] arr = new int[2];
			for(int i =0; i<arr.length;i++) {
				System.out.println((i+1)+"번째 숫자를 입력해주세요.");
				arr[i]= scan.nextInt();
			} 
			
			
		return arr;
		
		
	}

	public static void aa(int num[]) {
		System.out.println(num[0]+" + "+num[1]+ " = "+ num[0]+num[1]);
	}
	public static void bb(int num[]) {
		int a = num[0]-num[1];
		
		System.out.println(num[0]+" - "+num[1]+ " = "+a);
	}
	public static void cc(int num[]) {
		System.out.println(num[0]+" * "+num[1]+ " = "+ num[0]*num[1]);
	}
	public static void dd(int num[]) {
		System.out.println(num[0]+" / "+num[1]+ " = "+ num[0]/num[1]);
	}
	public static void ee(int num[]) {
		System.out.println(num[0]+" % "+num[1]+ " = "+ num[0]%num[1]);
	}
	
	public static int menu() { 
		// 입력 받기 떄문에 매개변수 x // 리턴값은 사용자가 선택한 값을 리턴.

		System.out.print("원하는 계산을 선택해주세요(1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 5.나머지) : ");

		int ch = scan.nextInt();
		return ch;
	
	
	
	}
	public static void getSumResult(int nums[]) {
		int result =0;
		for(int i =0; i< nums.length; i++) {
			result = result +nums[i];
			
		}
	System.out.println(nums[0]+"+"+nums[1]+"="+result);
	}
	public static void sub(int num[]) {
		int result = num[0] -num[1];
		System.out.println(num[0]+"-"+num[1]+"="+result);
	}


}
	
