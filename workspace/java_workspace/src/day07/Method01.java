package day07;

public class Method01 {

	public static void main(String[] args) {
		/* 배열을 출력하는 메서드
		 * 
		 */
		int size = 15;
		int arr[] = new int[] {1,2,44,4,5,77,7,10,20,40,66,94,32,99};
		
		printArray(arr);
		System.out.println();
		for(int tmp :sortArray(arr)) {
			System.out.print(tmp+ " ");
		}
		System.out.println();
		printArray(sortArray(arr));
		
		System.out.println();
		System.out.println();
		System.out.println("-----------랜덤 배열 정렬-----------");
		
		
		int arr2[]=randomArray(size); // random메서드 배열 호출
		 // 호출한 rondom메서드를 정렬(프린트가 한개씩 안되고 주소만 나옴)
		printArray(arr2);// (프린트한 메서드를 출력)
		
		
		
		
	}

	
	public static void printArray(int arr[]) {
		
		
		int cnt = 0;
		 
		for(int i=0; i<arr.length; i++) { 
			System.out.print(arr[i]+ " ");
		cnt++;
		if(cnt %5 == 0) {
			System.out.println();
		}
		} 
	}
	public static void printArray1(int arr[]) {
	
		int cnt=0;
		for(int i =0; i<arr.length; i++) {
		 
			System.out.println(arr[i]+ " ");
		
			
	}
		
	}
	
	
	
	
	
	
	
	
	
	
	public static int[] sortArray(int arr[]) { // 정렬만 주는 메서드. for문 고정이니 꼭 외우기
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				}
			}
		}
	return arr;
	}
	
	
	public static void sortArray1(int arr[]) { //필요로 하는 기능을 한가지만 설정.(재사용성)
		
		for(int i=0; i<arr.length-1; i++){ //첫번째 값을 .. 2..
		for(int j =i+1; j<arr.length; j++) { //두번째 값부터 비교..~length까지 돌고 for1돌아가서...
			 if(arr[i]>arr[j]) {
				 int tmp = arr[i];
				 arr[i] = arr[j];
				 arr[j] = tmp;
			 }
			
		}
	}
		
}
		
	
		
	
	 /* 기능 : 주어진 정수 배열을 콘솔에 출력하는 메서드
	  * 매개변수 : 
	  * 리턴타입 : 
	  * 메서드명 : printArray
	  * 옆으로 출력 / 5개씩 한줄에 나열
	  */

	/* 기능 : 주어진 정수 배열을 정렬하는 기능
	 * 매개변수 : 
	 * 리턴타입 :
	 * 메서드명 :  sortArray
	 * 
	 */
	/* 새로운 배열을 만들어서 랜덤수를 채워 리턴하는 메서드. 1~100
	 * size를 매개변수로 받아서 랜덤수를 채움. length 
	 * 매개변수 : x
	 * 리턴타입 : int []
	 * 메서드명 : randomArray
	 */
	public static int[] randomArray(int num) { 
		
		
		int[] arr1= new int[num];
		
		for(int i =0; i<arr1.length; i++) {
			
			arr1[i] = (int)(Math.random()*100)+1;
//			System.out.print(random[i]+ " ");
		}
		return arr1;
		
		
	}
	
}