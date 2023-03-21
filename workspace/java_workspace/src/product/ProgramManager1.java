package product;

import java.util.Scanner;

public interface ProgramManager1 {

	void add(Scanner scan); // 메뉴추가
	void menuPrint(); // 메뉴출력
	void orderPick(String food, int count); // 주문
	void orderPrint();// 주문내역출력
	void delete(Scanner scan); // 메뉴 삭제
	void update(Scanner scan); // 메뉴 수정
	
}
