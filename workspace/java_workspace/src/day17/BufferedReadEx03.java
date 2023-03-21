package day17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class BufferedReadEx03 {

	public static void main(String[] args) throws IOException {

		/*
		 * out.txt 파일 읽어와서 map에 저장 후 합계 출력 이름 :점수 총 합계 출력
		 * 
		 */
		HashMap<String, Integer> out = new HashMap<>();

		// BufferedReager br = new BufferedReader(new FileReader("경로+파일명"))
		BufferedReader br = null;
		br = new BufferedReader(new FileReader("Out.txt"));
		int sum = 0;
		while (true) {
			String line = br.readLine();
			if (line == null) { // Buffer의 마지막 줄은 null = null 시 break;
				break;
			}
			// 홍길동 79 substring(startindex = 해당번지 포함, endindex = 해당번지 미포함)

			String name = line.substring(0, line.indexOf(" "));
			Integer score = Integer.parseInt(line.substring(line.indexOf(" ") + 1));
			// 점수는 공백 미포함 +1해주기
			out.put(name, score);
		}

		for (String tmp : out.keySet()) { // map은 keySet 으로 key 값 가져온 후 , get(tmp) = tmp의 value값
			System.out.println(tmp + " : " + out.get(tmp));
			sum += out.get(tmp);
		}

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double) sum / out.size());

		if (br != null) {
			br.close();
		}
	}

}
