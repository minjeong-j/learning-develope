package example;

import java.util.Scanner;

//키보드로 정수값을 계속 입력받아 합계를 계산하여 출력하는 프로그램을 작성하세요.
//단, 입력된 정수값이 0인 경우 입력을 종료하고 합계 출력
//ex) 정수값 입력[0:종료] >> 10
//    정수값 입력[0:종료] >> 20
//    정수값 입력[0:종료] >> 30
//    정수값 입력[0:종료] >> 0
//    [결과]합계 = 90

//문제 한글로 정리해보기 
//정수값 계속 입력 count, total.. 
//0이 입력되지 않은경우 합계 계산 sum
//0이면 입력 종료 
//반복*의 횟수 불확실 while 사용 


public class TotalTwoExample {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		/*
		int num;
		do {
			System.out.print("정수값 입력 >> ");
			num=scanner.nextInt(); 
				if(num<=0) {
					System.out.println("[0 입력]입력을 종료하고 합계가 출력됩니다.");
				} //입력된 정수 전체를 어떻게 더해주지.... 
		} while(num>0 || num<0); { //무한루프 수정 필요 
			for(int i=1; i!=0; i+=num) {
				System.out.println(i+" + "+i);
			}
		}
		//내가 쓴 코드 
		 */
		int tot=0; //변수 선언과 값 초기화 
		
		while(true) {
			System.out.print("정수값 입력[0:종료] >> ");
			int num=scanner.nextInt();
			
			if(num==0) break; //0이 입력되면 종료 !! ㅘ 우와ㅘ 
			
			tot+=num;
		}
		
		System.out.println("[결과]합계 = "+tot);
		
		scanner.close();
	}
}
		