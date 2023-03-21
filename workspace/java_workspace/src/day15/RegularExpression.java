package day15;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {

		/*
		 * RegularExpression : 정규표현식 문자의 형식을 검증하는 형태 전화번호, 비밀번호, 파일 확장자 (파일첨부 시 확장자
		 * 체크(화면구성시)) 특정한 규칙을 가진 문자열의 집합을 표현하는 데 사용하는 형식 언어 [a-zA-Z] 띄어쓰기 x : 모든 대소문자 1개
		 * 가능 대괄호로 묶어서 표현 \d : 숫자 가능 (02|010)-\d{3,4}-\d{4} = 010 or 02 - 3,4자리숫자 -
		 * 4자리숫자 \w : [a-zA-Z0-9] : 대소문자 ,숫자 1개만 가능 . : 모든 문자중 한개의 문자 ? : 없음 또는 1개, * :
		 * 없음 또는 1개 이상 {n , } : 3자리 이상 {3, 7} 3자리 or 7자리
		 */

		// 배열중 b로 시작하는 단어만 찾기
		String[] strArr = { "bat", "baby", "cat", "cb", "data", "disk", "count", "apple", "banana" };

		Arrays.sort(strArr);// 정렬 가능

		for (int i = 0; i < strArr.length; i++) {
			System.out.println(" " + strArr[i] + " ");
		}
		System.out.println("-----------------------------");

		// 패턴 클래스
		Pattern pattern = Pattern.compile("c[a-zA-Z]*");
		// c로 시작하는 단어
		// 글자수 제한도 가능

		for (String str : strArr) {
			Matcher matcher = pattern.matcher(str);
			if (matcher.matches()) { // 패턴 일치시 true 반환
				System.out.print(str + " ");
			}
		}
	}

}
