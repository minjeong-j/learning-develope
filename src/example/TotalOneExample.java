package example;

import java.util.Scanner;

//4월 29일, 
//키보드로 정수값 5개를 입력받아 합계를 계산하여 출력하는 프로그램을 작성하세요.
//ex) 1번째 정수값 입력 >> 10
//    2번째 정수값 입력 >> 20
//    3번째 정수값 입력 >> 30
//    4번째 정수값 입력 >> 40
//    5번째 정수값 입력 >> 50
//    [결과]합계 = 150


//한글로 문제 정리해보기 
//합계 출력 변수 필요 (tot=0)
//정수 5개 입력

public class TotalOneExample { //for문 사용, 문제가 안 풀릴때는 설계도(그림)을 그려서 해결해보자 
	public static void main(String[] args) {
		
		/*
		Scanner scanner=new Scanner(System.in);
		
		int num; // 숫자들을 여러개 출력하고 어떻게 더하는 걸까 ?
		do	{System.out.print("정수값 입력 >> ");
			num=scanner.nextInt();
			if(i=1; 1<=i; i++) {
				if() {
					System.out.println("[결과]합계 = "+sum );
				}
			}
		} while(num<0 || num>100);
		//내가 쓴 코드 
		 */
		
		Scanner scanner=new Scanner(System.in);
		
		int tot=0;		//합계 출력 변수 선언 
		for(int i=1;i<=5;i++) {
			System.out.print(i+"번째 정수값 입력 >> ");
			int num=scanner.nextInt();
			
			tot+=num;
		}
		
		System.out.println("[결과]합계 = "+tot);
		
		scanner.close();
	}
}