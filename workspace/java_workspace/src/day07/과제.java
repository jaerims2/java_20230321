package day07;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
    /* 야구게임
     * 컴퓨터 3자리의 숫자를 생성(1~9까지만) 배열로 생성
     * 유저가 3자리의 숫자를 맞추는 게임.배열로 생성
     * 몇번쨰만에 ..
     * count 
     * 
     * 
     * 3 5 7
     * 3 7 8 
     * 1s 1b(자리와 숫자 모두일치 s / 숫자만 일치 b)
     * 
     * 3 5 7 
     * 6 8 1
     * 3 out
     * 
     * 3 5 7 
     * 3 4 6 
     * 그러면  
     * 1s
     * 자리와 숫자가 일치하면 strike
     * 숫자만 일치하면 ball , 0개 맞추면 out
     * 
     * -----야구게임 시작
     * 컴퓨터가 숫자를 정했습니다.
     * 숫자를 입력해주세요. (1~9, 3자리) > 
     *  3 5 6 
     *  > 2s
     *  3s 다맞으면 종료.(게임횟수 출력)
     */
    
	Scanner scan = new Scanner(System.in);
	
	
	
	int[] comNum = new int[3]; // 컴퓨터 배열
	randomArray(comNum);
	printArray1(comNum);
	System.out.println();
	int[] userNum = new int[3]; // 내 배열
	int strike =0;
	int ball=0;
	int cnt =0;
	while(true) {
		
    	for(int i  = 0; i < userNum.length; i++) {
        		System.out.println("1~9사이의 정수를 입력하세요 : "); 
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
    	if(strike == 3) {
        		System.out.println(" 정답! 횟수 : "+ cnt);
        break;       
	}
    	strike = 0;
    	ball = 0;
    	cnt++;
	}
	
	
	}

	public static int comNum() {
		return (int)(Math.random()*9)+1;
 			
 		}
 		
	
	/* 2. 랜덤의 담아값을 배열에 주는 메서드. 랜덤번호를 배열에 저장하는기능.
	 * 리턴타입 : void
	 * 매개변수 : int배열
	 * 메서드명 : printArray
	 * 
	 * */
	public static void randomArray(int arr[]) {
		
//		 for(int i=0; i<arr.length;i++) {
//			 int r= lottoNum();
//			 if(!oxox(arr, r)) {
//				 arr[i] = r;
//			 }else {
//				 i--;
//			 }
			int i=0;
			while (i<arr.length) {
				int r = comNum();
				if(!oxox(arr, r)) {
					arr[i] =r;
					i++;
				}
			}
			
			
		
		
		
	}
	

	
	/* 3. 정수 배열을 콘솔에 출력하는 메서드.
	 * 리턴 : void
	 * 매개 : 입력 받기.
	 * 이름 : scannerArray
	 */
	
	public static void printArray1(int arr1[]) {
		for(int i=0; i<arr1.length; i++) { 
			System.out.print(arr1[i]+ " ");
		}
		System.out.println();
	}	
	
	
	
	
	
	
	
	
	
	
	public static boolean oxox(int arr[],int random) { // random 값을 임의설정.
		//continue문을 쓸 수 있을 경우 true /false 반환 메서드 가능.
		// 
		for(int tmp : arr) {
			if(tmp == random) {
				return true;
			}
		}return false;
	}
	
	
	
	 
		// 위 두 배열은 값의 갯수가 다름.
		// 배열의 순서가 바뀌거나 같은 배열을 두개 넣거나. erorr 
		
		
	
}
