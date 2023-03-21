package day06;

public class Method04 {

	public static void main(String[] args) {

		/* 전부 메서드로 처리.
		 * 1. 랜덤 정수 5개를 배열에 담아서 그 int배열을 리턴하는 메서드.(범위 : 1~100) 
		 * 
		 * 리턴타입 : int[] // for배열
		 * 매개변수 : 
		 * 변수명  : random
		 * 2. 위에서 담은 배열의 5개를 평균을 연산하는 메서드( return double 평균:리턴/ )
		 * 리턴타입: double 
		 * 매개변수:
		 * 변수명 : avg
		 * 
		 * 3. 평균을 출력하는 메서드 / 정수 5개와 평균을 출력 하는 메서드.
		 * 리턴타입: void
		 * 매개변수: int arr[], double avg (배열과 평균) => 타입과 배열인지 아닌지..중요
		 * 변수명 : allPrint
		 * 
		 * main에서는 연산식이 있으면 안됨. 모두 메서드에서 만들어서 사용.
		 * 데이터 전달 및 호출.
		 */
		/* int arr[] = random();
		 * for(int tmp : arr) {
		 * sysout(tmp); }	
		 * double avg = avg(arr));
		 * sysout(avg)
		 */
		/* 생성한 메서드를 메인에서 호출하여 사용할때.
		 * 호출할 메서드 타입에 맞는 변수선언 후 
		 * 메서드 호출 후 매개변수 값에 선언한 변수이름 입력...
		 * 굳이,,,? 안담아도 됩니당
		 * 한줄로 표현해도 됩니다.
		 * 
		 */
		int arr[]= random();
		double avg=0;
		allPrint(arr, avg);
		allPrint(arr, avg);
		
		
		
		
		
	}

	
	public static int[] random() {
		
		int[] arr = new int[5];
		for(int i = 0;i<arr.length; i++ ) {
			int random = (int)(Math.random()*100)+1;
			arr[i]= random;
			
		}
		
		return arr;
	}
	
	public static void avg() { //매개변수: arr[] 따로 new arr 안 만들어도 괜찮아요.!.
		int arr1[] = random();
		
		
		int sum=0;
		int avg=0;
		for(int i=0; i<arr1.length; i++) {
		sum =sum+arr1[i];	 
		}
		avg = sum/arr1.length;
//		System.out.print(arr1,avg);
	}
	
	public static void allPrint(int[] random, double avg) {
		System.out.println("5개의 랜덤 값 : ");
		for(int tmp : random) {
			
			System.out.println(tmp +" ");
		}
		System.out.println();
		System.out.println("위 5개 값의 평균 : "+avg);
	}
	
}
