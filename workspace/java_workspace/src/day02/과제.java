package day02;

public class 과제 {

	public static void main(String[] args) {

		/*1~100까지 2의 배수를 출력
		 * 2 4 6 8 10 \n
		 * 12 ... 20 \n
		 * 22 ....30 \n
		 */
		/*sysoutln으로 줄바꿈을 할수있다.
		 * 10의 배수단위로 줄바꿈.. 10배수 if문안에 sysoutln문
		 * 
		 */
		for(int i= 1; i<=100; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
				}
			if(i%10==0) {
				System.out.print(i);
				}
			}
		}
	}
