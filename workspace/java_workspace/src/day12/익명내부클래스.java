package day12;

public class 익명내부클래스 {

	public static void main(String[] args) {

		// 익명 내부클래스
	
	Outer out = new Outer();
	Runnable runner = out.getRunnable(10);
	runner.run();
	
	
	}

}

class Outer{
	
	int outNum =10;
	static int sNum=200;
	
	Runnable getRunnable(int i ) {
		//매개변수와 지역변수는 값이 들어올때 final로 (컴파일러 통해서 자동으로) 변경돼서 들어옴.
		
		int num =100; //final int num 과 같은 의미

		
		class MyRunnable implements Runnable {
			int localNum = 1000;
			
			
			@Override
			public void run() {
				
				//매개변수 멤버변수 수정 불가
				
				
				System.out.println("매개변수 i : "+ i);
				System.out.println("메서드 안 num = "+num);
				System.out.println("in 클래스 안 localNum"+localNum);
				
				System.out.println("out클래스 outNum="+ outNum);
				System.out.println("out클래스 static sNum= "+sNum);
			}
			
		}
		return new MyRunnable();
	
	}
	
	
	
}