package day12;

public class Exception03 {

	public static void main(String[] args) {
		/* 자주 발생하는 예외 코드들
		 * 
		 * 
		 */
		// ArithmeticException:0으로 나누었을 때 발생
//			double a = 1/0; 
//			System.out.println(a);
		
		//ArrayIndexOutBoundsException :배열의 index가 범위를 벗어났을 때
//		int arr[] = new int[5];
//		for(int i=0; i< arr.length;i++) {
//			System.out.println(arr[i]);
//		}
	
//		P p = new P();
		//classcastingException 
		C c = null;
//		NullPointException 
//		c.print();
		
	}

class P {
int num = 10;	
}
class C extends P {
	int num1= 100;
	void print() {
		System.out.println(num1);
	}
}
}
