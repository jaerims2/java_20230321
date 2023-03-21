package day07;

import java.util.Scanner;

import day06.Method07;

public class 과제다시하기 {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {

		
		
		int comNum[] = new int[3];
		int userNum[] = new int[3];
		Lotto.randomArray(comNum); // lotto메소드 호출 /  배열 생성
		Lotto.printArray1(comNum); // 랜덤값 미리 확인. 
		sbc(comNum, userNum); // 결과값 연산 및 입출력
	
		scan.close();
	}// main 끝
	
	
//	< method >
	
	public static void sbc(int arr1[], int arr2[]) { // 3.결과값연산 입출력
		
		
	System.out.println(">>야구게임 시작");
	System.out.println("컴퓨터가 숫자를 결정했습니다.");
	while(true) {
	int s=0;
	int b=0;
	int count =0;
	int comNum[] = arr1;
	int userNum[] = arr2;
	
	System.out.println("> 숫자 입력(1~9, 숫자 3개) : "); 
	String user = scan.next(); 
	String[] userNumStrArr= user.split(""); 
	for (int i=0; i<arr2.length;i++) {
		count++;
		arr2[i] = Integer.parseInt(userNumStrArr[i]);
		}
	for(int i=0; i<comNum.length;i++) {
		for(int j =0; j<userNum.length; j++) {
			if(comNum[i] == userNum[j] && i == j) { 
				s++;
			}else if (comNum[i] == userNum[j] && i != j) {
				b++;	
			}
		}
	}
	
	System.out.println(">>" + s + " S / "+ b+ " B " );
	
	// 출력조건.
	if(s ==0 && b==0) {
		System.out.println("out ^^..");
	} 
	if(s==3) {
		System.out.println("정답입니다. 시도 횟수 : "+count);
		break;
			}
		}
	}
}//class끝
