package day05;

public class ArrayEx01 {

	public static void main(String[] args) {
		/* 5개 값을 가지는 배열을 생성 후
		 * 1~50 사이의 랜덤값을 저장 후 출력
		 * 
		 * 
		 * 
		 */
		int size= 5;
		int[] arr= new int[size];
		int random=0;
		for(int i =0; i<arr.length; i++) {
			
			random = (int)(Math.random()*5)+1;
			arr[i] = random;
		System.out.printf("arr[%d]",arr[i]);	
		}
	
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
