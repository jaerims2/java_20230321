package day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx01 {

	public static void main(String[] args) throws ParseException {

		/* 날짜를 문자열로 format 설정
		 * 
		 * 
		 * 
		 */
		Date date = new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd(E) hh:mm:ss");
		
		String dataString = sdf.format(date);
		System.out.println(dataString);
		
		//문자열을 날짜로
		String dateStr = "2009-09-30 08:30:50";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd(E) hh:mm:ss");
		Object date2 = sdf2.parseObject(dateStr);
		System.out.println(date2);
	}

}
