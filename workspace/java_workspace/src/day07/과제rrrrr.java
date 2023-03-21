package day07;

import java.util.Scanner;

public class 과제rrrrr {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		
		
	
		
		
		int comNum[]= new int[3];
		int user[] = new int[3];
		
		comArr(comNum); // 랜덤값 com[]에 담기.
		System.out.print("정답미리확인 : ");
		print(comNum); // 정답확인
		System.out.println("**********야구게임 시작**********");
		sbc(comNum, user); // 두 배열 비교 결과값 입출력
		userArr(user);
		
		 scan.close();
		 
	}	// main method 끝
		
	
	
	
	
		// <mothod 생성>
	 public static int randomNum() { // 0.랜덤 수 메서드.
		 return (int)(Math.random()*9)+1;
	 }	
	 
	public static void print(int arr[]) { // 0-1. 배열 프린트 메서드
		
		for(int tmp : arr) {
				System.out.print(tmp+ " ");
			}System.out.println(); //줄바꿈
		}
	
	public static void userArr(int arr[]) { // 1.입력받을 user 메서드
	
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = scan.nextInt();
			}
		}
	
	 public static void comArr(int[] arr) { // 2. 중복x 랜덤생성 메서드.
		int i=0;
		
		while (i<arr.length) {
			int r = randomNum();
			if(!oxox(arr, r)) {
				arr[i] =r;
				i++;
			 }
		 }	
	 }
	public static boolean oxox(int arr[], int random) {// 2-1.중복제거 메서드.
		
		for(int tmp : arr) {
			if( tmp == random) {
				return true;
			
			}
		} return false;
		
	}
 	
	
	public static void sbc(int arr1[], int arr2[]) { //3. 결과값 출력 메서드.
		int cnt = 0;
		int strike = 0;
		int ball = 0;
		
		int comNum[] = arr1;
		int userNum [] = arr2;
		
		while(true) {
	    	strike = 0;
	    	ball = 0;
	    	cnt++;
	    	
	    	for(int i  = 0; i < userNum.length; i++) {
	    			
	        		System.out.println("1~9 사이의 정수를  !한개씩! 입력 하세요 : "); 
	                	userNum[i] = scan.nextInt(); 
	                		
	                            }
	            for(int i = 0; i < comNum.length; i++) {
	            	
	            	
	            	for(int j = 0; j < userNum.length; j++) {
	            		
	                    	if(comNum[i] == userNum[j] && i == j) {
	                            	
	                    		strike++;
	                             }
	                    	else if(comNum[i] == userNum[j] && i != j) {
	                           
	                    		ball++;
	                    		 } 
	             }
	          }
		System.out.println(strike + " 스트라이크 " + ball + " 볼 ");
			
			if(strike == 0 && ball ==0) {
				System.out.println("out");
			}
	    	if(strike == 3) {
	    		
	        		System.out.println(" 정답. 종료되었습니다. 횟수: "+ cnt);
	        		break;
	       
	    	}
		}	
	}	
}// class끝

