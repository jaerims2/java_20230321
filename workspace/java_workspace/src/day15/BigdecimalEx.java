package day15;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigdecimalEx {

	public static void main(String[] args) {
/*  BigDecimal : java에서 숫자를 정밀하게 저장 / 표현하기 위한 클래스
 * 돈 ,소수점 정밀한 계산이 필요한 경우는 필수
 * 단점 : 느린속도 
 * 
 * 
 */
		
		BigDecimal db = new BigDecimal("1000.1234"); // 객체 생성 후 값을 초기화
//		BigDecimal db1 = new BigDecimal("1000.1234"); // 객체 생성 후 값을 초기화
//		double db1 = 1000.1234; // 와 같은 의미
		// 값을 초기화 하기 위해서는 문자열로 값을 넘겨줘야 함.
		
		BigDecimal db2 = new BigDecimal("100");
		// == 객체의 주소가 같은지 비교 
		
		System.out.println(db+" 1번값");
		System.out.println(db2+" 2번값");
		System.out.println(db == db2);
		System.out.println(db.equals(db2));
		
		// compareTo : 두 값을 비교시 같으면 0, 작으면 -1, 크면 1
		// 사칙연산 안됨
		
		// + add - subtrack * multiply 
		// / divide % remainder
		
		System.out.println(db.add(db2)+" +");
		System.out.println(db.subtract(db2)+" -");
		System.out.println(db.multiply(db2)+" *");
		System.out.println(db.divide(db2)+" /");
		System.out.println(db.remainder(db2)+" %");
		
		System.out.println(db.max(db2) +" 값 비교 max값");
		System.out.println(db.min(db2) +" 값 비교 min값");
		
	//	BigInteger
		BigInteger bi = BigInteger.valueOf(10000);
		System.out.println(bi);
		
//		* 형변환 * 
		int int_bi = bi.intValue(); // Integer -> int
		long long_bi = bi.longValue(); // Integer -> long
		String string_bi = bi.toString();
}

}
