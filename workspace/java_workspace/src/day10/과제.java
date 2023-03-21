package day10;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
 
/* product 클래스 : 상품을 등록하는 클래스
 * 멤버변수 : 상품명 가격
 * 상품등록 메서드명 : insertProduct
 * 출력 메서드 toString
 * get set 생성
 * 
 * productMain 
 * 배열로 객체
 * main에서 product 배열 생성 [10]
 * 상품등록 후 list출력
 * Scanner 통해서 상품등록.
 * 상품을 등록하시겠습니가? (y/n) n시 종료
 * y=> 상품을 등록(반복등록) / n시 종료
 * while (input != 'y')  이름과 가격을 등록받아 상품배열에 등록
 * n => 종료와 동시에 등록된 제품 리스트 출력.
 */
	
		 Scanner scan = new Scanner(System.in);
		 
		 
		 Product1[] arr = new Product1[10]; // index 안에 product정보를 담을 공간 
		 String name;
		 int cnt =0; // arr 객체의 배열 index핸들링 변수
		 int price;
		 int sum=0;
			 while(true) {
				 System.out.println("상품 등록 (y:입력/n:종료)");
				 char input = scan.next().charAt(0);
				
				 if(input =='y') { 
				 Product1 tmp = new Product1();
				 
				System.out.println("상품 이름/가격 입력");
				name = scan.next();
				price = scan.nextInt();
				tmp.insertProduct(name, price);
				arr[cnt]= tmp;
				cnt++;
//				sum+=price; // 입력 받은 값을 바로 합계
					} else if(input == 'n') {
					System.out.println("종료되었습니다.");
					break;
						}
					}
			 	System.out.println("---등록된 제품 리스트---");
				for(int i=0; i<cnt; i++) {
					System.out.println((i+1)+"번째 상품 : " +arr[i]);
					sum= sum+arr[i].getPrice();
					//메서드 사용시 arr[i].printProduct 사용.
				}System.out.println("합계 : " + sum);
				
				

				scan.close();
	
		
		
		
		
		
		
		
		
		
	}
}//main class끝


