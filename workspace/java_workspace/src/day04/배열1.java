package day04;

public class 배열1 {

	public static void main(String[] args) {

		/* 배열 : 같은 타입, 같은 의미를 가지는 변수들의 집합(참조변수) 
		 * - 배열 선업 방법
		 * 타입 [] 배열 이름; (선언.)
		 * 타입 배열이름 [];
		 * - 선언 & 초기화 동시에
		 * 타입[] 배열이름 =  new type[length]; // 가장 일반적인 방법
		 * 타입[] 배열이름 =  new type[] { 값 , 값 , 값, 값, 값...}; 값까지 같이. 
		 * 타입[] 배열이름 =  {값,값값값ㅂ갓ㅄㅂ갓ㅂ}; 선언과 동시에 초기화 할떄만 사용가능. 
		 * - 배열의 길이는 0 이상이어야 한다.  -는 불가.
		 * - 배열의 시작번지는 0 이다. index는 0번지부터 시작 
		 *  배열[3] =>  0 1 2
		 */
	
		
		int[] arr1; //배열 선언
		
		int arr2[] = new int[5]; // 5개의  초기값0
		
		arr1=new int[3]; // 배열 생성  초기값0
		
		int arr3[] = new int[] {1,2,3,4,5} ;
		
		int arr4[] = {1,2,3,4,5};
		
		/*배열을 사용하는 이유
		 * 배열은 반복문을 사용할수있기 때문에 편리하다.
		 * 관리가 쉽다. 연관성 있는 값끼리 한 묶음으로 취급하기 때문..
		 * 배열의 마지막 번지는 총길이 -1 (ex: [5-1])
		 * 배열의 총 길이를 구하는 메서드.length
		 * 
		 */
	
		System.out.println(arr3); // 실제 객체의 주소가 출력됨.
		System.out.println(arr3[0]); // 
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
			
		}
		System.out.println("구분선");
		arr2[0]=10;
			System.out.println(arr2[0]);
			arr2[1]=20;
			System.out.println(arr2[1]);
			
			for(int i=0; i<arr2.length; i++) {
				arr2[i]=(i*10)+10;
				System.out.println(arr2[i]);
				
			}

			//arr1 배열에 123을 저장하고 출력하시오.
			
			for(int i =0; i<arr1.length; i++) {
				arr1[i]=i+1;
				System.out.print(arr1[i]+" ");
			}
			
			
	
	
	
	
	
			
			
			
			
			
			
	
	
	
	
	
	}


}
