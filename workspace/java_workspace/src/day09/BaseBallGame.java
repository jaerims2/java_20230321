package day09;

import java.util.Scanner;

public class BaseBallGame {

	public static void main(String[] args) {

		/* 야구게임 메서드화
		 * 메서드 매개변수의 개수는 정해진것이 없음
		 * 리턴타입 -> 한개 
		 * while 문/ break 시점 /설정 한 후 메인에서 출력.
		 * 
		 * 1. 랜덤번호 생성(범위설정 매개변수)
		 * 2. 배열화
		 * 2_1. 중복 메서드 
		 * 3. 스트라이크 메서드
		 * 4. 볼 메서드
		 * 5. 출력메서드
		 * 
		 */
		int com[] = new int[3];
		int user[] = new int[3];
		int max = 9, min=1; // 랜덤수범위
		int s=0;
		int b=0;
		int cnt = 0;
		Scanner scan = new Scanner(System.in);
		
		randomArray(com, max, min);
		printArry(com);
		System.out.println("****** 야구게임 시작 ******");
		System.out.println("컴퓨터가 랜덤수를 결정하였습니다.");
		
		while(s!=3) {
			// 사용자 번호 입력 받기
			System.out.println("1~9까지 숫자 3개 입력");
			cnt++;
			for(int i =0; i<user.length; i++) {
				user[i] = scan.nextInt();
			}
			// 결과 판정 strike ball 둘 다 판정
			s= strike(com, user);
			b= ball(com, user);
			//System.out.println(s+" S "+b+" B ");
			// 0 일떄  표현하고 싶지 않다면
			if(s!=0) {
				System.out.print(s+" S ");
			}
			if(b!=0) {
				System.out.println(s+" S /"+ b+" B ");
			}
			System.out.println();
			System.out.println("게임 횟수 : "+cnt);
			if(s==0 && b==0) {
				System.out.println("OUT ! ! !");
			}
		}
		System.out.println("정 답 입 니 다! ! ");
		System.out.println("종료되었습니다.");
		
		
		
		
		
		
	
		
		
		
		
		
		
		scan.close();
	}// main 끝 
	//개수 시작값 (int) (Math.random()*범위값)+시작값
	// 범위 = min max 20 30 cnt => (ma6==================x-min)+1
//	public static int random(int start,int cnt) {
//		return (int)(Math.random()*cnt)+start;
//		}
	public static int random(int max, int min) {
		if(max < min) { // max와 min의 숫자값이 바뀌어 들어올떄 처리.
			int tmp =max;
			max = min;
			min = tmp;
			}
		return (int) (Math.random()*(max-min+1))+min;
	}
	public static boolean oxox(int arr[],int num) {
		for(int i =0; i < arr.length; i++) {
			if(arr[i]== num) {
				return true;
			}
		}
				return false;
	}
	//배열 생성 메서드 중복제거
	// true 가 리턴되면 정상적으로 배열이 생성됨을 알려줌.
	// 
	public static boolean randomArray(int arr[], int max,int min) {
		if(arr == null) {
			return false;
		}
		if((max-min+1) < arr.length) { 
			// 랜덤수의 개수가 배열의 length보다 작다면 
			return false;
		}
			int i =0;
			while (i<arr.length) {
				int r = random(max,min); // 매개변수
				if(!oxox(arr,r)) {
					arr[i] = r;
					i++;
				}
			}
			return true;
	}
	public static void printArry(int arr[]) { // 배열출력
		for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}	
	//스트라이크 메서드 
	/* 기능 : com[] , user[] 위치와 값이 일치하면 카운트를 반환기능
	*	메서드명 : strike
	*	값과 번지수(위치)가 같으면 cnt++	
	*/
	public static int strike (int com[], int user[]) {
		int cnt=0;
		for(int i =0; i<com.length; i++) {
			if(com[i]== user[i]) {
				cnt++;
			}
		}
		return cnt;
	}
	/* ball 
	 * 기능 : com[] user[] 위치 상관없이 일치  ->cnt++;
 	 */
	public static int ball (int com[], int user[]) {
		int cnt=0;
		for(int i=0; i<com.length; i++) {
			if(oxox(user, com[i])) {
				cnt++; //자리 상관없이 일치하면 ++
			}
		}
		return cnt-strike(com, user); // strike 개수 빼줘야함.
	}



}//class끝
