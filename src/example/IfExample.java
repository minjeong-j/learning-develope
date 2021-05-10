package example;

public class IfExample {
	public static void main(String[] args) {
		//1.변수에 저장된 문자값을 출력하세요.
		//단, 변수에 저장된 문자값이 소문자인 경우 대문자로 변환하여 출력하세요.
		/*
		char mun='x';
		
		char x = 'X';
		System.out.println("mun = " +x); //내가 한 코드ㅋㅋㅋ
		 */
		
		char mun='x';
		if(mun>'a' && mun<='z') { //변수값이 소문자인 경우 
			//'a':97 'A':65  97-X=65 , 32빼주면 된다 
			//mun=mun-32; >> 에러, 자동형변환 일어남 //mun-=32; >> 자동형변환 안일어남 :앞과 뒤는 다른 식
			mun-=32;//변수값을 소문자에서 대문자로 변환하여 저장 
		}
		
		System.out.println("============================================================");
		//2.변수에 저장된 정수값이 4의 배수인지를 구분하여 출력하세요.
		//배수면 배수다/ 아니면 아니다로 출력
		int num=345644;
		
		if(num%4==0) { //배수조건식
			System.out.println("4의 배수가 맞다.");
		} else {
			System.out.println("4의 배수가 아니다.");
		}
		
		//쌤이 쓴 결과표현 참고 
		if(num%4==0) { //배수조건식
			System.out.println("[결과]"+num+" >> 4의 배수가 맞다.");
		} else {
			System.out.println("[결과]"+num+" >> 4의 배수가 아니다.");
		}
		
		
		System.out.println("============================================================");
		//3.올해가 평년인지 윤년을 구분하여 출력하세요.
		//2월이 29일까지 있으면 윤년
		// => 년도를 4로 나누어 나머지가 0인 경우 윤년
		// => 위 조건을 만족하는 년도 중 100으로 나누어 나머지가 0인 경우 평년
		// => 위 조건을 만족하는 년도 중 400으로 나누어 나머지가 0인 경우 윤년
		// 달력에 사용가능, 자바 calendar관련 라이브러리 존재 
		int year=2021;
		/*
		if(year%100==0) {
			System.out.println("평년이 맞다.");
		} else if(year%400==0) {
			System.out.println("윤년이 맞다.");
		} 아무 값도 나오지 않는 코드... 뭐가 잘못된거고 어떻게 풀어야하지?
		*/
		
		if(year%4==0 && year%100!=0  || year%400==0) { //윤년과 평년 구분할 수 있는 조건식
			System.out.println("[결과]"+year+"년은 윤년입니다.");
		} else {
			System.out.println("[결과]"+year+"년은 평년입니다.");
		}
		
		System.out.println("============================================================");
		//4.이름이 [홍길동]인 학생이 국어점수 89점, 영어점수 93점, 수학점수 95점을 받은 경우
		//총점과 평균, 학점을 계산하여 이름, 총점, 평균, 학점을 출력하세요. 
		// => 국어,영어,수학 점수 중 하나라도 0~100 범위가 아닌 경우 프로그램 강제 종료
		//    System.exit(0) : 프로그램을 강제로 종료하는 메소드
		// 학점은 평균을 이용해서 계산하기
		// => 평균을 이용한 학점 계산 : 100~90:A, 89~80:B, 79~70:C, 69~60:D, 59~0:F
		// => 평균은 소숫점 두자리까지만 출력하고 나머지는 절삭 처리 하세요.
		String name="홍길동";
		int kor=89, eng = 93, mat=95, sub=3;
		
		/* 여기서부터 새로 설명듣고 내용추가함 
		//+a : 입력값에 대한 유효성 검사(Validation) =>검증
		if(!(kor>=0 && kor<=100) || (eng<0 || eng>100) || (mat<0 || mat>100)) { //표현은 다양하게 할 수 있음
			System.out.println("[에러]0~100 범위를 벗어난 비정상적인 점수가 입력되었습니다.");
			System.exit(0); //프로그램 종료
			=> 어떤 점수가 잘못되었는지는 모른다, 사용자 편의성 떨어짐 
		}
		*/
		
		boolean valid=false;
		
		if(kor<0 || kor>100) {
			System.out.println("[에러]0~100 범위를 벗어난 비정상적인 국어점수가 입력되었습니다.");
			//System.exit(0); //프로그램 종료
			valid=true;
		}
		
		if(eng<0 || eng>100) {
			System.out.println("[에러]0~100 범위를 벗어난 비정상적인 영어점수가 입력되었습니다.");
			//System.exit(0); //프로그램 종료
			valid=true;
		}
		
		if(mat<0 || mat>100) {
			System.out.println("[에러]0~100 범위를 벗어난 비정상적인 수학점수가 입력되었습니다.");
			//System.exit(0); //프로그램 종료
			valid=true;
			
		if(valid==true) {//조건식 대신 boolean 변수값을 이용하여 명령 선택 가능 => if(valid) 사용 가능
			System.exit(0); //프로그램 종료
		}
		
		}
		
		/*
		if(kor<0, eng<0, mat<0, && kor>100, eng>100, mat>100) {
			System.exit(0);
		} >>>>에러남 ㅠ 
		
		int tot=kor+eng+mat;
		double ave=tot/sub;
		System.out.println("이름 = "+name+ ", 총점 = "+tot+ ", 평균 = "+(ave)); //평균 소수점 둘째자리...?
		double hakjum=ave;
		
		if(ave>=0 && ave<=100) {
		String grade="";
		switch((int)hakjum/10) {
		case 10:
		case 9: grade="A"; break;
		case 8: grade="B"; break;
		case 7: grade="C"; break;
		case 6: grade="D"; break;
		default: grade="F";
		}
		
		System.out.println("이름 = "+name+ ", 총점 = "+tot+ ", 평균 = "+(ave)+ ", 학점= "+grade+ "학점");
		} 내가 한 과제코드 
		*/
		int tot=kor+eng+mat;
		double ave=tot/sub;
		String grade="";
		//switch(ave/10); //에러
		switch((int)ave/10) {
		case 10:
		case 9: grade="A"; break;
		case 8: grade="B"; break;
		case 7: grade="C"; break;
		case 6: grade="D"; break;
		default: grade="F"; break;
		}
		System.out.println("이름 = "+name+ ", 총점 = "+tot+ ", 평균 = "+(int)(ave*100)/100.0+ ", 학점= "+grade);
	
		
				
		System.out.println("============================================================");
	}
}		









