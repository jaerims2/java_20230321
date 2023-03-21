package day12;

public class Exception05 {

	public static void main(String[] args) {
		//메서드 
		/* 기능 : 배열의 길이 (size) 가 주어지면 
		 * 길이만큼 배열을 생성하여 배열을 돌려주는 메서드
		 * 값은 random(max min)으로 반환 
		 * 범위를 매개변수로 받기
		 * 메인에서 try catch 설정
		 * 
		 * 메서드에서 예외처리 throw 처리
		 * -size가 0보다 작다면 예외발생 중복 상관x
		 * -max가 0보다 작다면 
		 * 
		 */
		
		/* 배열을 받아서 배열에 랜덤값을 채우는 메서드
		 * -랜덤값은 max min 받아서 처리
		 * -배열이 null일 경우 
		 * -배열의 길이가 0보다 작을 경우
		 */
		
		
		int max=10, min =1, size=5;
		int arr[]=null;
		
		try {
			 int[] arr1=randomArr(size, max, min);
			 insertArr(arr, max, min);
			System.out.println();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

	
	
	
	public static int[] randomArr(int size,int max,int min) {
		//배열의 길이가 0, index범위 넘어갔을때
		if(size <=0) {
			throw new RuntimeException("배열의 길이는 0보다 작습니다.");
		} if(max <=0) {
			throw new RuntimeException("랜덤 범위가 없습니다.");
		}
		int[] arr= new int[size];
		
		for(int i =0; i< size; i++) {
			arr[i]= (int)(Math.random()*max-min+1)+min;
			}
		return arr;
	}
	
	
	public static void insertArr(int arr[], int max,int min) throws Exception {
		
		if(arr == null) {
			throw new Exception("배열의 값이 없습니다.");
		}
	    if(arr.length == 0 ) {
	    	throw new Exception("배열의 길이가 없습니다.");
	    }
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*max-min+1)+min;
			System.out.print(arr[i]+" ");
		}
	}

}
