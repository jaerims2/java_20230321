package day05;

public class ArrayEx04 {

	public static void main(String[] args) {

		/* 2차원 배열 
		 * 자료형 배열 [] [] = new 자료형 [길이] [길이] ;
		 * 
		 * 
		 */
		int arr[] [] = new int [5][3]; //행 열

		int cnt = 1;
		//행 개수 5개 
		for(int i=0; i<arr.length; i++) { // 0~4까지의 5개의 행
			
		
		//열개수  3개
		for(int j =0; j<arr[0].length;j++) { //0번째 행에 있는 열의 개수
			arr[i][j] = cnt;
			cnt++;
		System.out.printf("%3d",arr[i][j]); // 1개의 숫자 당 3칸을 차지하게끔 표현. 	
		}
		System.out.println();
		}
		
		
	}

}
