package example;

import java.util.Scanner;

//4월 29일 
//키보드로 정수값을 입력받아 1~9 범위의 정수값을 곱한 결과를 출력하는 프로그램을 작성하세요.
//단,입력된 정수값은 2~9 범위의 정수값만 허용되며 범위 밖의 정수값을 입력한 경우 메세지 출력 후 재입력
//ex) 단 입력[2~9] >> 7 //if, for문
//    7 * 1 = 7
//    7 * 2 = 14
//    ...
//    7 * 8 = 56
//    7 * 9 = 63

//문제 한글 정리 
// 정수값을 입력받아 곱한 결과 출력 
// 2~9 정수값만 허용 
// 범위가 아니면 메세지 출력 후 재입력하도록 

public class GugudanExmaple {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//비정상적인 값이 입력될 경우 		
		int num;
		do {
			System.out.print("정수값 입력[2~9] >> "); 
			num=scanner.nextInt();
			if(num<2 || num>9) {
				System.out.println("[에러]정수값은 2~9만 입력가능합니다.");
			}
		} while(num<2 || num>9); 
		
		for(int i=2; i<10; i++);{
			for(int j=1; j<10; j++) {
				System.out.println(num+"*"+j+ " = " +(num*j)+"\t" );
				
			}
		}
	scanner.close();	
	
	/* 쌤 풀이 
	 Scanner scanner=new Scanner(System.in);
		
		int dan;
		while(true) { //while문 조건에 항상 참이 되는 식을 넣으면 무한루프 만들 수 있다 
			System.out.print("단 입력[2~9] >> ");
			dan=scanner.nextInt();
			if(dan>=2 && dan<=9) break;//정상적인 입력값인 경우 반복문 완전히 종료, 조건식의 판단 결과와 상관없이 탈출구 
			System.out.println("[에러]2~9 범위의 정수값만 입력 가능합니다.");			
		}
		
		for(int i=1;i<=9;i++) {
			System.out.println(dan+" * "+i+" = "+(dan*i));
		}
		
		scanner.close();
	 */
	
	System.out.println("==================================");	
	}
}
