package day05;

public class String02 {

	public static void main(String[] args) {

		
		
		
		// 이것이자바다.txt 파일에서 파일명과 확장자를 분리하여 출력.
	
	String str = "이거시바자다.txt";
	
	System.out.println();
	System.out.println("파일명 : "+str.substring(0,str.indexOf(".")));
	System.out.println("확장자 : "+str.substring(str.indexOf(".")+1));
	
	
	
	System.out.println(str.contains("바자")); // 해당 true/ 불포함 false
	
	
	
	}

}
