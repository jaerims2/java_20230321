package day18;

class Bank {
	
	//계좌의 잔고
	private int money = 10000;
	
	
	// 입금
	public synchronized void saveMoney(int save) { 
		// 동기화 시 해당 공유영역에 누가 먼저 접근하던지 cpu점유 중 다른 객체의 접근방지 
		int m = this.money;
		
		try {
			Thread.sleep(3000); // 3초 = 1000분의1
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(m+save);
	}
	// 출금
	
	public synchronized void minusMoney(int minus) {
		int m = this.money;
		try {
			Thread.sleep(200); // 0.2
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(m-minus);
	}
	
	
	
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}

class Hong extends Thread {
	public void run() { // 입금
		System.out.println("입금 시작");
		SynchronizedMain.myBank.saveMoney(3000); // 3천원 입금
		System.out.println("3천원+잔고 : "+ SynchronizedMain.myBank.getMoney());
	}
}

class Shin extends Thread {
	public void run() { // 출금
		System.out.println("출금 시작");
		SynchronizedMain.myBank.minusMoney(1000);
		System.out.println("천원-잔고 : "+ SynchronizedMain.myBank.getMoney());
	}
 }

public class SynchronizedMain {

	public static Bank myBank = new Bank(); // 공유영역

	public static void main(String[] args) {

		Hong h = new Hong();
		h.start();
		
		Shin s = new Shin();
		s.start();
		
		
	}
}

