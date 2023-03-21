package day14;

import java.util.Calendar;

public class SetEx0003 {

	private static int aa= 0;

	public static void main(String[] args) {
		
		/* 날짜시간 클래스
		 * Calendar 클래스 사용 => 추상클래스
		 * 직접 객체를 생성할 수 없다.
		 * new연산자를 통해서 객체 구현이 불가
		 * getInstance()를 이용하여 구현한 클래스를 통해 인스턴스를 얻어 옴
		 * 
		 * month : (0~11월) +1 
		 * week : 1=일 , 2 월 , 3화 ,4수 ...
		 * am_pm : am=0 , pm=1
		 * 
		 */
		Calendar now= Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = now.get(Calendar.MONTH)+1; // 달은 항상 +1
		System.out.println(month);
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println("주: "+week);
		System.out.println(year +" - "+ month+" - "+day);
		
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		String weekString = null;
		
		switch(week) {
		case 1: weekString ="일"; break;
		case 2: weekString ="월"; break;
		case 3: weekString ="화"; break;
		case 4: weekString ="수"; break;
		case 5: weekString ="목"; break;
		case 6: weekString ="금"; break;
		case 7: weekString ="토"; break;
		default : break;
		}
		
		System.out.println(year+"-"+month+"-"+day+"("+weekString+")");
		int ampm=now.get(Calendar.AM_PM);
		System.out.println(" test");
		System.out.println(ampm==0?"오전":"오후"+" "+hour+":"+minute+" "+second);
		
		
		

		

		
		
		
	
		// 2023 02 17 (금)
		// 오후 2:42 
		
	
		
	}

}
