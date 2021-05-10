package basic;
//4월 30일 
//1~45 범위의 중복되지 않는 정수 난수 6개를 제공받아 오름차순 정렬하여 출력하는 프로그램을 작성하세요. 
//정렬(Sort) : 값을 순서대로 나열하는 기능 
//=> 오름차순 정렬(Ascending Sort), 내림차순 정렬(Descending Sort)
public class LottoApp { //로또 자동ㅋㅋㅋㅋ 
	public static void main(String[] args) {
		//6개의 정수난수를 저장하기 위한 배열 선언 
		int[] lotto=new int[6];
		
		//1~45 범위의 정수난수를 제공받아 배열 요소에 저장 
		for(int i=0; i<lotto.length;i++) {//새로운 난수값이 저장되는 요소의 첨자
			//요소에 저장된 새로운 난수값을 기존 요소들의 난수값과 비교하여 모두 다른 경우
			//반복문 종료 - 기존 요소의 난수값과 같은 경우 반복 처리 
			while(true) {
				//요소에 새로운 정수난수를 제공받아 저장
				lotto[i]=(int)(Math.random()*100)%45+1;
				
				//중복 상태정보를 저장하기 위한 변수
				//=> false : 미중복, true : 중복
				boolean result=false; 
				
				//기존 요소들의 난수값과 비교하는 반복문
				for(int j=0; j<i;j++) { //기존 요소의 첨자를 표현, 조건식이 거짓일 경우 빠져나감, j의 최대값은i-1임  
					//lotto[i] : 새로운 난수값이 저장된 요소
					//lotto[j] : 기존 난수값이 저장된 요소					
					if(lotto[i]==lotto[j]) {
						result=true;
						break; //중복된 경우 빠져나감 
					}
				}
				
				if(!result) break;//while 구문 종료 
				//=>for(int j=0; j<i ~ 부터 중복 숫자 제거된다 
			}
		}
		
		//숫자 순서를 차례대로 출력=>정렬, 
		//배열의 요소값들을 서로 비교하여 오름차순 정렬하여 저장
		//=>선택 정렬 알고리즘(Selection Sort Algorithm) 이용 
		for(int i=0; i<lotto.length-1;i++) {//비교 요소의 첨자 : 처음~마지막-1
			for(int j=i+1;j<lotto.length;j++) {//피비교 요소의 첨자 : 비교+1~마지막
				//lotto[i] : 비교 요소, lotto[j] : 피비교 요소
				if(lotto[i]>lotto[j]) {//오름차순정렬 
					//두요소의 값을 치환(Swap)
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
		
		//배열 요소값 출력
		System.out.println("행운의 숫자 >> ");
		for(int num:lotto) {
			System.out.print(num+" ");
		}
		System.out.println();
		
	}
}
