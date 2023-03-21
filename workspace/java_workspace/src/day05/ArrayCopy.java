package day05;

public class ArrayCopy {

	public static void main(String[] args) {
		/*String 배열 생성 후 값 3 개 
		 * 국어 영어 수학 이라는 글자를 담은 후 출력  
		 */
		
		/* 배열은 길이를 가지고있음.
		 * 한번 정해진 길이는 이후 추가/삭제 불가
		 * 배열의 길이를 늘리거나 줄이고 싶을 경우 배열복사 ArrayCopy를 이용  
		 */
		int size= 3;
		
		
		String arr[] = new String[size];
		arr[0] = "국어";
		arr[1] = "영어";
		arr[2] = "수학";
		
	
		for(String tmp : arr) { // tmp의 타입은 arr타입과 일치
			System.out.println(tmp);
		}
		//사회 과학 추가..
		//기존에 배열에서 추가를 하려면 더 큰 배열을 만들어서 이사 해야함.
		String arr2[] = new String[6];
		for(String tmp : arr2) {
			System.out.print(tmp+" ");
		}
		for(int i =0;i<arr.length; i++) {
			arr2[i] = arr[i];
			
		}for(String tmp : arr2) {
			System.out.print(tmp+" ");
		}
		
		
		System.out.println(arr);
		System.out.println(arr2);
	
	
	
	System.out.println();
	// Array Copy를 이요한 방법.
			String arr3[] = new String[arr.length*2]; // 기존arr배열보다 2배 많은 크기.
			
			//System.arraycopy (복사할 배열(처음 배열) , 시작번지, 새배열,시작번지,개수);
			System.arraycopy(arr,0, arr3,0, arr.length);
			for(String tmp : arr3) {
				System.out.print(tmp);
			}
			
			
			
	
	
	
	
	
	
	}

}
