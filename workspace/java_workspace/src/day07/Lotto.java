package day07;



public class Lotto {
	
	public static void main(String[] args) {

		
		
		/* 로또번호를 생성하는 메서드.(1~45까지 . 랜덤으로 번호를 생성(당첨번호))
		 * 로또번호 = 사용자번호 6자리 숫자(1~45); (랜덤번호)
		 * 당첨번호 = 당첨번호 7자리(6+1(보너스번호.마지막에 생성된번호)) (1~45)
		 * 배열2개.
		 * 
		 * 사용자 당첨 번호 랜덤으로 발생시켜서
		 * 로또의 등수 확인.()
		 * 배열은 메인에서 생성. 매개변수로 받아서 생성
		 *
		 */
		int size1 = 7;
		int size =6;
		int lotto[] = new int[size1];
		int user[] = new int[size];
		
		randomArray(lotto);
		randomArray(user);
		System.out.println("당첨 번호 (7자리)");
		printArray1(lotto);
		System.out.println("사용자 번호 (6자리)");
		printArray1(user);
	 // 배열 채우고 비교.
		int rank = lottoRank(lotto, user);
			if(rank== -1) {
				System.out.println("꽝");
			}else { 
				System.out.println(rank+ " 등 당첨");
				
			}
	}
	/* 1.랜덤으로 로또번호 생성 기능 1~45 생성후 리턴 num값
	 * 리턴타입 : int
	 * 매개변수 : num
	 * 메서드명 : lottoNum
	 * */
	public static int lottoNum() {
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
				int r = lottoNum();
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
	
	/* 4. 중복제거.. 배열 값이 같은 값이 들어있지 않게 체크. 배열과 랜덤 수 주고..
	 * 리턴: int[]
	 * 매개: num
	 * 이름: oxox
	 */

		
		public static boolean oxox(int arr[],int random) { // random 값을 임의설정.
			//continue문을 쓸 수 있을 경우 true /false 반환 메서드 가능.
			// 
			for(int tmp : arr) {
				if(tmp == random) {
					return true;
				}
			}return false;
}
	
	/* 5. 등수 체크하는 메서드
	 * 배열에 생성한 랜덤값이 있는지 체크(있으면 true 없으면 false)
	 * 리턴: int 등수 리턴
	 * 매개: 당첨번호 사용자번호
	 * 이름: lottohRank
	 * 
	 * -- 당첨기준
	 * 사용자번호 와 로또번호 6개 일치 1등
	 * 5개 일치 + 보너스 : 2등
	 * 5개 일치 :3등
	 * 4개 일치 :4등
	 * 3개 일치 :5등
	 * 나머지 꽝 (-1리턴).
	 */
		public static int lottoRank(int lotto[],int user[]) {
			// 위 두 배열은 값의 갯수가 다름.
			// 배열의 순서가 바뀌거나 같은 배열을 두개 넣거나. erorr 
			if(lotto.length<= user.length) {
				return -1;
			}
			
			int cnt=0; // 당첨번호 개수 카운트
			for(int i=0; i<user.length; i++) { // user arr기준으로
				//user : 1 2 3 4 5 6
				//lotto: 1 2 7 8 5 4             9
				if(oxox(user, lotto[i])) {
					cnt++; // 보너스 제외
				}
			}
			switch(cnt) {
			case 6: return 1; // return까지만 보고 break; 생략가능 
			case 5: 
				if(oxox(user, lotto[lotto.length-1])) {
					return 2;
				} else {
					return 3;
				}
			case 4: return 4;
			case 3: return 5;
				
				default: return -1;
			}
			
		}

}

	
