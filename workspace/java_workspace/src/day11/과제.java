package day11;

import java.util.Scanner;

public class 과제 {
		public static void main(String[] args) {
			/* 5개의 문자열 배열을 생성한 후, 5개의 파일명을 입력받는 코드를 작성
			 * 입력받은 파일 중 이미지 파일을 검색하여 출력하는 코드를 작성
			 * 이미지파일 형식은 (jpg png gif jpeg)
			 * ex) String[] fileName = {"java.txt","String.jpg", "method.png","String pdf","java.pdf"};
			 *
			 * contains
			 * ---- 이미지 파일 ------
			 * String.jpg
			 * method.png
			 */
			Scanner scan = new Scanner(System.in);
	        String []arr = new String[5];
	        String [] img = {"png","jpg","gif","jpeg"};
	        
	       
	        
	        
	        
	        for(int i =0; i<arr.length; i++) {
	        System.out.println("5개의 파일을 입력해주세요 (ex: java.txt)");
	        arr[i] = scan.next(); 
	        }
	       
	        
	        System.out.println("★ 이미지파일 검색 결과 ★");
	        for(String tmp : arr) {
	            int index = tmp.indexOf('.'); 
	            String std = null;
	            if(index == -1) { 
	                continue;
	            }
	            
	            std = tmp.substring(index+1); // '.'다음부터 indexof('.')+1
	                if(iscontains(img, std)) {
	                    System.out.println(tmp);
	                }
	        }
	        scan.close();
			
	}//main끝
				
	// method 
		public static boolean iscontains(String arr[], String input) {
			
			if(arr==null || arr.length ==0) { // 배열이 없는경우
				return false;
			}
			if(input ==null ) {
				return false;
			}
			for(String tmp : arr) { // 이미지값을 배열
	        if(tmp.equals(input)) {
	            return true;
	        	}
			}
	    return false;
		}	
}
	
