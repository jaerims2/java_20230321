package StudentM;
public class StdMain {
	public static void main(String[] args) {
		
		StudentManager stdM = new StudentManager();
		boolean close = true;
		do {
			switch (stdM.menuPrint()) {
			case 1:
				stdM.stdAdd(); break;
			case 2:
				stdM.stdPrint(); break;
			case 3:
				stdM.stdSearch(); break;
			case 4:
				stdM.stdDelete(); break;
			case 5:
				stdM.subAdd(); break;
			case 6:
				stdM.subUpdate(); break;
			case 7:
				stdM.subDelete(); break;
			case 8:
				close = false; break;
			default : 
				System.out.println("잘못입력하셨습니다."); break;
			}
		} while (close == true);
		System.out.println("종료되었습니다.");
	}
}