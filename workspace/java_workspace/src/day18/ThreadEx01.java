package day18;

// thread 클래스를 상속
class MyThread extends Thread  {
	// Thread 를 상속받으면 반드시 run() 메서드를 구현해야 함
	public void run ()	 {
		
		for(int i =0; i<200; i++) {
			System.out.println(i+"번째 "+ getName());
		}
	}
}

public class ThreadEx01 {

	public synchronized static void main(String[] args) {

		/* Thread (쓰레드)
		 * : 실행중인 프로그램(process)이 OS로 부터 메모리를 할당 받아 process 상태가 됨
		 * - n개 프로세스는 n개 이상의 Thread를 가지게 되고, 실제 작업을 수행하는 단위는 thread 단위
		 * - thread 단위는 실제 CPU가 처리하는 단위
		 * - multi-thread는 여러 스레드가 동시에 수행되는 프로그래밍
		 * - CPU는 시간을 잘게 쪼개서 thread들을 수행하면 사용자들은 동시에 처리되는듯한 효과
		 * - 스레드는 각각 자신만의 작업 공간을 가짐 (context)
		 * - 각 thread 사이에 공유하는 자원이 있을 수 있음.(java = static instance)
		 * - 여러 thread가 공유하는 자원중 경쟁이 발생하는 부분을 
		 *   critical section (임계영역) -> 해당하는 섹션에 대한 동기화(순차적 수행) 하여 구현함으로써 오류 발생 방지   
		 * 
		 * Thread 구현 방법 
		 *  1. 상속(Thread)
		 *  2. 인터페이스 구현 (Runnable)
		 *  - run() 메서드 구현
		 *  
		 *  synchronized : 동기화 잘안씀... 
		 */
		System.out.println(Thread.currentThread()); // 현재 실행중인 스레드
		MyThread th = new MyThread();
		
		th.start(); // run call 
		
		MyThread th2 = new MyThread();
		
		th2.start();
		
		
	}

}
