package example;
//4월 26일 
public class VariableExample {
	public static void main(String[] args) {
		//가로의 길이가 7이고 세로의 길이가 10인 사각형의 넓이를 계산하여 출력하세요.
		//변수를 만들어서 풀기! System.out.println(7*10); : X!! 
		int garo=7, sero=10;
		int nulbe=garo*sero;
		System.out.println("사각형의 넓이 = "+nulbe);
		System.out.println("=================================================");
		
		//높이의 길이가 9이고 밑변의 길이가 7인 삼각형의 넓이를 계산하여 출력하세요.
		int nopi=9, mitbeon=7; 
		/*int nulbe2 = nopi*mitbeon/2; 내가 한 과제 코드 */
		//double nulbe2 = nopi*mitbeon/2; //-> 나누기가 있기때문에 double 사용
		double nulbe2=nopi*mitbeon/2.0; //-> double에서 나머지 나오도록 해주기!
		System.out.println("삼각형의 넓이 = "+nulbe2);
		System.out.println("=================================================");
		
		//10명의 전체 몸무게가 759Kg인 경우 평균 몸무게를 계산하여 출력하세요. 
		int totweight=759, count=10; //10, 759 변수가 정수기 때문에 int 사용
		/*int ave=totweight/count; 내가 한 과제코드*/
		double aveweight=(double)totweight/count; //실수값으로 바꿔주기
		System.out.println("평균 몸무게 = "+aveweight);
		
		double w_weight2=759, man2=10;
		double ave=w_weight2/man2;
		System.out.println("평균 몸무게 = "+ave); // 내가 한 과제 코드 
		
		System.out.println("=================================================");
		
		//이름이 [홍길동]인 학생이 국어점수 89점, 영어점수 93점, 수학점수 95점을 받은 경우 
		//총점과 평균을 계산하여 이름, 총점, 평균을 출력하세요. 
		//단, 평균은 소숫점 한자리까지만 출력하고 나머지는 절삭하여 출력하세요. 
		
		
		String name = "홍길동";
		/* 내가 한 과제 코드 
		double kor=89, eng=93, math=95, subj=3;
		double tot=(kor+eng+math);
		double ave3=(kor+eng+math)/subj;  
		
		System.out.println(name);
		//System.out.println("홍길동 총점 = "+tot); :총점 277.0
		System.out.println("총점 = "+(int)tot);
		//System.out.println("홍길동 평균 = "+ave4); :평균 = 92.33333333333333
		System.out.println("평균 = "+(int)(ave3*10)/10.0);
		
		//한줄 쓰기하려면 어떻게 해야하지?
		//System.out.println("이름 = "+name , "총점 = "+tot , "평균 = "+ave3); ->당연 에러ㅋㅋ
		//System.out.println("이름 = "+name ", 총점 = "+tot ", 평균 = "+ave3); -> 에러ㅋㅋ
		System.out.println("이름 = "+name+ ", 총점 = "+tot+ ", 평균 = "+ave3);
		System.out.println("이름 = "+name+ ", 총점 = "+(int)tot+ ", 평균 = "+(int)(ave3*10)/10.0);
		System.out.println("=================================================");
		*/
		int kor=89, eng=93, math=95;
		
		int tot=kor+eng+math;
		double ave3=tot/3;
		
		System.out.println("이름 = "+name+ ", 총점 = "+tot+ ", 평균 = "+(int)(ave3*10)/10.0);
		System.out.println("=================================================");
	}		
}

