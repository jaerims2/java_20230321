package day14;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateTimeEx01 { // LacaldateTime 사용권장 쓰기 편함

	public static void main(String[] args) {

		LocalDateTime today= LocalDateTime.now();
		System.out.println(today);
		
		// 2023 -02 17 t14:30:01.233735
		//날짜만 추출
		System.out.println(today);
		String curr = today.toString();
		System.out.println(curr);
		System.out.println(curr.substring(0, curr.indexOf("T")));
		System.out.println(curr.substring(11,curr.indexOf(".")));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dtf.format(today));
		
		//내가 원하는 날짜 생성
		LocalDateTime sDate = LocalDateTime.of(2003, 9, 30, 8, 30);
		System.out.println(sDate.format(dtf));
		
		
	
	}

}
