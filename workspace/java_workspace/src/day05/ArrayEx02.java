package day05;

public class ArrayEx02 {

	public static void main(String[] args) {
		/*1-10까지의 배열 arr생성 후 출력
		 * 
		 * 
		 */

		int size= 10;
		int[] arr = new int[size];
	
		
	for(int i =0; i<arr.length; i++) {
		arr[i]=i+1; 
		
		
		System.out.print(arr[i]+ " ");
	//배열을 섞는 코드 random을 활용하여 섞는다. 1~10 까지
		// 배열 값 두개를 교환 시 임시저장소를 만들어서 교환
	}
		int a= 10;
		int b = 20;  // random 에서 선택한 번지
		int c = a;
		a= b;
		b= c;
		
		System.out.printf("a의값%d  b의값%d",a,b);
		
	//방법 : 랜덤한 번지  (0~arr.length)를 선택하여 다른 번지와 교환
	//(int)(Math.random()*개수)+시작 개수.
	
		int min =0; //시작번지
		int max =arr.length; // 배열의 길이까지. ex)10개의 값
		
		
	// 배열 섞기
		for(int i =0; i <arr.length;i++) { //for문 안에 random 값을 넣어야함.
		int random = (int)(Math.random()*max)+min; //0~10개
		
		//random 알고리즘. 
		//arr[0] , arr[random]번지의 교환.
		int tmp =  arr[i]; // tmp에 [0]번지 값 임시 저장
		arr[i] =arr[random];
		arr[random] = tmp;
		
		
		}
		System.out.println();
		System.out.println("-----섞은 후 값: ");
		
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

		System.out.println(); //줄 바꿈
		
		//오름차순 정렬 : 작은 수 부터 앞으로 오게 정렬
		//내림차순 정렬 : 큰 수 부터..
		//5 2 4 1 10 6 9 8 7 3 // 앞에 2개 수(5,2)에서 작은 값을 바꿔줌
		//2 5 ...............3 // 0번지의 수와 1 2 3..... 9번지의 수까지 비교하여 작은수가 교환됨..
		//0번지 ~10번지 1pass....... 1번지~10번지 2pass.......3번지부터..3pass// length-1번지 length번지까지
		
		for(int i =0; i<arr.length-1; i++) { // 끝까지 갈 필요 x 비교 고정값..
			
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i] <arr[j]) {//오름차순
				
				int tmp = arr[i]; // 0번지의 값을 tmp에 임시 저장
				arr[i] = arr[j]; // i의 0번지 값에 j0번지 값을 저장
				
				arr[j] = tmp; //j에 i의 0번지 값을 저장.
			
				}	
			}
			
		}
		System.out.println("==========오른..정 렬 그리고 그 후..==========");
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("==========내림... 정렬 그리고 그 후..end ========");
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					
				}
			}
		}
			
			for(int i=0; i<arr.length-1; i++) {
		System.out.print(arr[i]+" ");
			}
		
			System.out.println();
		
			
			for(int i =0; i< arr.length; i++) {
				
				for(int j =i+1; j<arr.length; j++) {
				
				
				if(arr[i]>arr[j]) {
					int tmp= arr[i] ;
					arr[i] = arr[j];
					arr[j] = tmp;
				}
				
				}
				
			}
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		System.out.println();
		System.out.println("향상된 for문");
		
		
		//향상된 for문 
		
		for(int tmp : arr) { //tmp= 뺴야하는 for문의 j값// 에 arr0번지 ~ length값 순차적으로 한개씩 옮겨 찍음..?
			System.out.print(tmp+ " ");
		}
		
		
		
		
		
	}
	}


