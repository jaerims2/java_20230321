package day12;

public class 과제 {

	public static void main(String[] args) {

		
		/* tv의 세부기능
		 * 모든 기능은 power가 on인 상태
		 * 채널 0~10까지 / 10-0/ 0-10순환 
		 * vol 0~20까지 업다운 가능 0이되면 "음소거"라고 출력
		 * vol 0이하로 내려가지 않음, 20이상올라가지 않음
		 * 리모콘을 상속 후 리모콘을 구현한 tv객체 생성 
		 */
	Tv t = new Tv();
	// t 호출 test

	}// main끝
}
interface remocon { // 리모콘을 상속 후 리모콘을 구현한 tv객체 생성
	void powerOn();
	void powerOff();
	void channelUp();
	void channelDown();
	void volUp();
	void volDown();
	} // remocon끝

class Tv implements remocon {
	private boolean power;
	private int ch;
	private int vol;
	
	@Override
	public void powerOn() {
		
		System.out.println("Tv ON");
		power = true;
	}

	@Override
	public void powerOff() {
	
		System.out.println("Tv OFF");
		power = false;
	}

	@Override
	public void channelUp() {
		
		if(power != true) {
			System.out.println("Tv의 전원을 켜주세요");
			return;
			}
		ch++;
		if(ch>10) {
			ch=0;
		}
		System.out.println("현재 채널 :"+ch);
	}

	@Override
	public void channelDown() {
		if(power != true) {
			System.out.println("Tv의 전원을 켜주세요");
			return;}
		ch--;
		if(ch<=0) {
			ch=10;
		}
		
		System.out.println("현재 채널 :"+ch);
	}

	@Override
	public void volUp() {
		
		if(power != true) {
			System.out.println("Tv의 전원을 켜주세요");
			return;}
		
		
		vol++;
		if(vol>20) {
			vol=20;
			System.out.println("최대 볼륨입니다.");
			return;
		}
		System.out.println("현재 볼륨 : "+vol);
	}

	@Override
	public void volDown() {
		
		if(power != true) {
			System.out.println("Tv의 전원을 켜주세요");
			return;}

		vol--;
		if(vol<=0) {
			vol=0;
			System.out.println("음소거");
			return;
		}
		System.out.println("현재 볼륨 : "+vol);
	}
	
}//tv class끝
	