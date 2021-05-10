package basic;

import java.util.Scanner;

//4월 29일, 키보드로 점수를 입력받아 학점을 계산하여 출력하는 프로그램을 작성하세요. 
//=> 100~90 : A, 89~80 : B, 79~70 : C, 69~60 : D, 59~0: F
//=> 입력된 점수가 0~100 범위의 정수값이 아닌 경우 메세지 출력 후 재입력 
public class InputCheckApp {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		/*
		System.out.print("점수 입력[0~100] >> ");
		int score=scanner.nextInt();
		*/
		
		/*
		//1.비정상적인 값이 입력될 경우 반복 - 정상적인 값이 입력되면 반복문 종료 
		int score=-1; //0을 줘도 되고 -101줘도 된다 1보다 작은 값 // 반복문의 조건식이 참이 되는 임의값을 변수에 저장
		while(score<0 || score>100) {
			System.out.print("점수 입력[0~100] >> ");
			score=scanner.nextInt();
			if(score<0 || score>100) {
				System.out.println("[에러]점수는 0~100 범위의 정수값만 입력 가능합니다.");
			}
		}
		*/
		
		/* 2.2번 표현
		int score; //do while 쓰면 좀 더 고급스러운 표현 
		do	{System.out.print("점수 입력[0~100] >> ");
			score=scanner.nextInt();
			if(score<0 || score>100) {
				System.out.println("[에러]점수는 0~100 범위의 정수값만 입력 가능합니다.");
			}
		} while(score<0 || score>100);
		*/
		
		int score; //3.3번 표현 
		while(true)	{ //조건식 대신 true 작성 : 무조건 참 - 무한루프 
			System.out.print("점수 입력[0~100] >> ");
			score=scanner.nextInt();
			//정상적인 값이 입력된 경우 반복문 종료 
			if(score>=0 && score<=100) break;
			//비정상적인 값이 입력된 경우 실행될 명령, 무한루프 탈출을 위해 브레이크  
			System.out.println("[에러]점수는 0~100 범위의 정수값만 입력 가능합니다.");
		}
		
		
		String grade;
		switch(score/10) {
		case 10:
		case 9: grade="A"; break;
		case 8: grade="B"; break;
		case 7: grade="C"; break;		
		case 6: grade="D"; break;
		default: grade="F";
		}
		
		System.out.println("[결과]"+score+"점 >> "+grade+"학점");
		
		scanner.close();
	}

}