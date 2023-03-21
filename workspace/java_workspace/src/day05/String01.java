package day05;

public class String01 {

	public static void main(String[] args) {
		/* String Class = 문자열을 다루는 클래스
		 * String str = new String(); X
		 * String str = "가나다"; O // 일반 변수선언 처럼 생성가능.
		 * 
		 * 
		 * 
		 */
		String str = "Hellow World~!!";
		System.out.println(str);
		
		//charAt(index) " index 번지에 있는 문자열을 반환.
		System.out.println("==charAt==");
		System.out.println(str.charAt(5)); // charAt(번지수)
		
		//length : 전체 글자의 길이
		System.out.println("-- length --");
		System.out.println(str.length()); //str의 전제 글자 길이 출력.
	
		//compareTo(str) : str문자열과 비교해서 같으면 0, 글자사전 순으로 앞이면 -1,뒤면 1
		System.out.println("-------compatreTo-------");
		System.out.println("b".compareTo("c")); // 문자에 대한 오름내림차순 가능..(사전상 순서에 맞게)
		System.out.println("b".compareTo("a"));
		System.out.println("b".compareTo("h"));
		System.out.println("b".compareTo("b"));
	
		//concat(str) : 이어붙이기(+ 연산자와 같은 의미) !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		System.out.println("--------concat-------");
		System.out.println("abc".concat("def")); // abc + def
		System.out.println("abc"+"def");
		
		//equals : 두 문자열이 같은지 확인하는 것(대소문자 구분).
		System.out.println("------equals---------");
		System.out.println("abc".equals("abc")); // true / false 값으로 나옴.
		System.out.println("abc".equals("def"));	//같 /   다름
		System.out.println("abc"=="abc"); // ==  == equals // 단순 글자 비교가능..

		//intdexOf(str) : 문자의 위치를 찾아주는 기능
		System.out.println("----------indexOf---------");
		System.out.println("abc".indexOf("b")); // b의 번지수를 표현해줌...
		System.out.println("abc".indexOf("d")); // 찾는 글자가 없을 시 -1 출력
		
		
		String email = "wofla2055@gmail.com";
		
		System.out.println(email.indexOf("@")); // 
		System.out.println(email.indexOf("5")); // 중복값 입력 시 앞에있는 번지수 표현.
		System.out.println(email.lastIndexOf("5")); // 끝에서 부터 찾음..
		
		
		//substring : 문자열 추출.!  !! ! ! ! ! ! ! !! 
		System.out.println("----------substring-----------");
		System.out.println(email.substring(0)); // 번지수를 입력하면, 해당번지 수 부터 ~ 끝까지 추출
		System.out.println(email.substring(0, 5)); // 0번지 부터 / +5개 까지 추출.
		System.out.println(email.substring(0, email.indexOf("@")));
		System.out.println(email.substring(email.indexOf("@")+1)); // @+1자리 수 부터...
		
		
		//trim : 불필요한 공백 삭제
		System.out.println("----trim------");
		System.out.println("                 Hellow               ".trim());// 다수의 공백을 지우고 문자열만 출력.
		
		//replace : 글자 치환
		
		System.out.println("----replace-----");
		System.out.println("Hellow World".replace("World", "JAVA")); // char String모두 다 변경 가능
	
		// split : 특정 값을 기준으로 나누기
	
		System.out.println("--- split----");
		String  str1 ="shin,jae,rim";
		String[] arr = str1.split(","); // ,(쉼표)를 기준으로 배열값을 입력
		for(String tmp : arr) {
			System.out.print(tmp+ " ");
		}
		System.out.println();
	
		String num1 = "1";
		String num2 = "2";
		String sum = num1+num2;
		System.out.println(sum);
		
		
		//parseInt : 문자를 숫자로 변환
		
		int num3 = Integer.parseInt(num1); // 문자열을 정수형으로 형변환
		System.out.println(num3);
		int num4 = Integer.parseInt(num2);
		System.out.println(num4);
		int sum1 = num3+num4;
		System.out.println(sum1);
		
	
	
	
	
	
	}

}
