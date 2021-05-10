package example;

import java.util.Scanner;

//컴퓨터로부터 제공받은 정수 난수값을 키보드로 입력하여 맞추는 프로그램을 작성하세요.
// => 1~100 범위의 정수 난수값을 제공받도록 작성
// => 난수값을 맞출 수 있는 기회는 10번만 제공되도록 작성
// => 키보드 입력값이 1~100 범위가 아닌 경우 메세지 출력 후 재입력
// => 난수값과 입력값이 같은 경우 입력 횟수 출력 후 프로그램 종료
// => 난수값과 입력값이 다른 경우 "큰값 입력" 또는 "작은값 입력" 형식의 메세지 출력
// => 난수값을 10번 안에 맞추지 못한 경우 난수값이 출력되도록 작성


//문제 한글 풀이 
//1~100 난수값 범위 입력 
//반복의 횟수 10번 정해짐 for
//1~100 범위가 아닌 경우 에러 메세지 출력 후 재입력 
//정답 맞히면 입력횟수 출력 
//정답 맞히는과정 중 : 작성한 값에 따라 큰값 입력/작은값 입력 출력 
//못 맞히면 정답 출력 
//+난수값, 사용자가 입력하는 입력값 변수 필요 

public class UpAndDownExample {
	public static void main(String[] args) {
		//Scanner scanner=new Scanner(System.in);
		int num = 0; 		
		//for문 사용
		
		for(int i=1;i>=0;i--) {  
				System.out.println("정수 입력 >> ");
				
			}
		
		/*
		while(true) {
			System.out.print("정수 입력 >> ");
			num=scanner.nextInt();
			
			if(num<0 || num>101); {
				System.out.println("[에러]정수 입력값은 1~100까지 가능합니다.");
			}
		} 내가 쓴거 ㅠ 정신차려어 
		*/
		
		/*/정수 난수값 제공받도록 
		for(int i=1;i<2;i++) {
			System.out.println(i+"번째 정수 난수값 = "+((int)(Math.random()*100)%100+1));
		} 	
		*/
		
		//ing num=(int)(Math.random()*100)+1 : 1~100까지 숫자범위를 출력하는 난수가 됨 
		//실수에 *100을 하고 (int)를 사용하면 앞의 정수부분만 남는다 =>0~99 범위 
		//1~100의 숫자를 얻기 위해선 (int)(Math.random()*100)에 +1을 해준다 
		
		//쌤 문제풀이 
		Scanner scanner=new Scanner(System.in);
		
		//1~100 범위의 정수 난수값을 제공받아 변수에 저장
		int dap=(int)(Math.random()*100)+1;
		
		//정답 관련 상태정보를 저장하기 위한 변수 선언
		// => false : 정답을 맞추지 못한 상태, true : 정답을 맞춘 상태
		boolean result=false;
		
		//10번의 입력 기회를 제공하기 위한 반복문 
		// => 정수값을 입력받아 난수값과 비교하여 결과 출력
		for(int i=1;i<=10;i++) {
			//사용자로부터 키보드 입력값을 제공받아 변수에 저장
			// => 비정상적인 정수값이 입력될 경우 재입력되도록 반복 처리
			int input;
			while(true) {
				System.out.print(i+"번째 정수값 입력[1~100] >> ");
				input=scanner.nextInt();
				if(input>=1 && input<=100) break;
				System.out.println("[에러]1~100 범위의 정수값만 입력 가능합니다.");
			}
			
			//난수값과 입력값을 비교하여 결과 출력
			// => 난수값과 입력값이 같은 경우 반복문 종료
			if(dap==input) {
				System.out.println("[메세지]축하합니다."+i+"번만에 맞췄습니다.");
				result=true;
				break;//반복문 종료
			} else if(dap>input) {
				System.out.println("[결과]"+input+"보다 큰 값을 입력해 보세요.");
			} else { //dat<input인 경우
				System.out.println("[결과]"+input+"보다 작은 값을 입력해 보세요.");
			} 
		}
		
		if(!result) {//정답을 맞추지 못한 상태인 경우
			System.out.println("[메세지]정답을 맞추지 못했군요. 정답은 ["+dap+"]입니다.");
		}
		
		scanner.close();
	}
}
