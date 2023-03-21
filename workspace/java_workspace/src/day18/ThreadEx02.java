package day18;


class MyThread2 implements Runnable {

	@Override
	public void run() {
		// 반드시 RUN() 메서드 구현
		for(int i =0; i< 200; i++) {
			System.out.println(i+" 번째 "+ Thread.currentThread().getName());
		}
	}
	
}
public class ThreadEx02 {
	public static void main(String[] args) {
		//Runnable
		
		MyThread2 mt = new MyThread2();
		Thread th1 = new Thread(mt);
		th1.start(); // th1이 끝날때까지 기다려.
		
		try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		Thread th2 = new Thread(new MyThread2());
		th2.start();
		try {
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main End");
	}

}
