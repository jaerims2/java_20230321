package day13;

import java.util.*;

public class 과제2 {

	public static void main(String[] args) {

		/* 과목과 점수를 입력받아 출력, 합계 출력 같이 출력
		 * 종료 키워드 input이 나올때까지 반복(0)
		 * 
		 * 과목과 점수를 입력해주세요.
		 * 국어: 89점
		 * 수학: 44점
		 * 0 종료
		 * 입력받은 map 출력 후 
		 * 합계 : sum / 평균: avg
		 */

	Scanner scan = new Scanner(System.in);
	
	int sum=0;
	double avg=0;
	HashMap<String, Integer> scoreMap = new HashMap<String,Integer>();
	
	scoreMap.clear();
	while(true) {
		System.out.println("과목과 점수를 입력해주세요.( n 입력: 종료)");
		System.out.println("과목 입력 (ex: 수학) > ");
		String subject = scan.next();
		
			if(subject.equals("n")) {
			System.out.println("종료되었습니다.");
			break;
				}
		System.out.println("점수 입력 (ex: 90)>");
		Integer score = scan.nextInt();
		scoreMap.put(subject, score);
		}
	for(String tmp : scoreMap.keySet()) {
		sum+=scoreMap.get(tmp);
		avg= sum/(double)scoreMap.size();
	}
	System.out.println(scoreMap);
	System.out.println("합계  : " +sum+" 점");
	System.out.println("평균 :"+ avg+" 점");
	

	
	
	
	
	HashMap<String, Integer> scoreMap1 = new HashMap<String,Integer>();
	
	int exit =1;
	while(exit !=0 ) {
		System.out.println("과목과 점수를 입력해주세요");
		String subject = scan.next();
		int score1 = scan.nextInt();
		
		scoreMap1.put(subject, score1);
		System.out.println("계속:1 종료:0");
		exit = scan.nextInt();
		
		
	}
	int sum1=0;
	Iterator<String> it = scoreMap.keySet().iterator();
	while(it.hasNext()) {
		String subject = it.next();
		sum1+= scoreMap.get(subject);
		System.out.println(subject+" : "+scoreMap1.get(subject));
	}
	
	System.out.println("sum : "+ sum);
	System.out.println("avg : "+ (double)sum/scoreMap.size());
	
	
	
	
	
	scan.close();
	
	
	}
	
}//main
