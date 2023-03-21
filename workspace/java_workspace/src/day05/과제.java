package day05;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {

		/* 가위바위보 만들기
		 * 컴퓨터가 가위,바위,보 중 랜덤으로 선택 (1=가위,2=바위,3=보) switch
		 * 형변환 해줘야함.
		 * 내가 가위바위보 중 선택해서 입력
		 * 승/ 패 /무에 대한 결과출력.
		 * 삼항 연산자 (조건식)? true : false;
		 * 
		 */
		
		Scanner scan= new Scanner(System.in);
		
//		
//		int random = (int)(Math.random()*3);
//		
//		System.out.println("가위=0 , 바위=1, 보=2 중 하나의 숫자를 입력해주세요");
//		int input = scan.nextInt();
//		
//		System.out.printf("컴퓨터 값 :%d , 사용자 입력 값 :%d",random,input);
//		
//		if(random == input) {
//			System.out.println("비겼습니다.");
//		} else {
//			System.out.println();	
//			System.out.println(random+1 == input? "이겼습니다.":"졌습니다.");
//			
//		}
//			int num = 3;

//			System.out.println((num % 2 == 0)? "짝수" : "홀수");
//
//			
//
//			int comNum = (int)((Math.random()*3)+0);
//
//			Scanner scan = new Scanner(System.in);
//
//			System.out.println("가위(0),  바위(1), 보(2)중 하나의 숫자를 입력해주세요: ");
//
//			int userNum = scan.nextInt();
//
//			System.out.println(comNum + "," + userNum);
//
//			if(comNum == userNum) {
//
//				System.out.println("비겼습니다.");
//
//			} else {
//
//				System.out.println((comNum + 1 == userNum)? "이겼습니다." : "졌습니다.");
//
//			}
//
//			
//
//			
//
//			
//
//		}



	
//		int num = 3;
//		
//		
//		System.out.println((num%2 == 0)? "짝수" : "홀수");
	
		
		System.out.println("가위 바위 보 게임 시작");
		int comNum = (int) (Math.random()*3);
		System.out.println("컴퓨터가 결정을 완료했습니다.");
		System.out.println("가위 바위 보 중에 하나를 선택하세요");
		String myChoice = scan.next();
		
		String comChoice =(comNum == 0) ? "가위" : (comNum ==1)? "바위":"보";
		System.out.println("com 선택> "+comChoice);
		
		if(comChoice.equals(myChoice)) { //== 
			System.out.println("비겼습니다.");
		}else {
			if(comChoice.equals("가위")) {
				System.out.println(myChoice.equals("바위")? "이겼습니다":"졌습니다");
				
			}else if (comChoice.equals("바위")) {
				System.out.println(myChoice.equals("보")? "이겼습니다":"비겼습니다.");
			}else {
				System.out.println(myChoice.equals("가위")?"이겼습니다":"졌습니다");
				
				
			}
		}
		
		System.out.println("게임 종료");
		
		
		
		
		
		
	scan.close();
	
	}

}
