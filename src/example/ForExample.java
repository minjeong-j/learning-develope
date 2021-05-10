package example;
//4월 28일 과제 
public class ForExample {
	public static void main(String[] args) {
		//본인 이름을 화면에 7번 출력하세요.
		//ex) 홍길동 홍길동 홍길동 홍길동 홍길동 홍길동 홍길동
		
		for(int i=1;i<=7;i++) {
			System.out.print("홍길동 "+ "\t");
		}
		System.out.println();
		
		System.out.println("=========================================");
		//1~10 범위의 정수 중 홀수를 화면에 출력하세요.
		//ex) 1     3     5     7     9   
		
		for (int i=1; i<10; i+=2) { //i<=10;도 가능
			System.out.print(i+ "\t");	
			}
		System.out.println();// 내가 한 코딩 
		
		/* 
		for(int i=1; i<=10; i++) {
			if (i%2!=0) {
				System.out.println();
			}
		} //이런 방법도 가능
		*/
		
		System.out.println("=========================================");
		//1~100 범위의 정수에서 3의 배수들의 합계와 5의 배수들의 합계를 계산하여
		//3의 배수의 합계에서 5의 배수의 합계를 뺀 결과값을 출력하세요.
		//ex) 결과 = 633
		/*
		int tot=0; 
		for (int i=1; i<=100; i++ && j=1; j<=100; j++) {
			for (int i%3==0 && j%5==0) {
				System.out.println(i-j);
			}
		}
		*/
		//3의 배수 변수, 5의 배수 변수, 
		
		int tot3=0, tot5=0;
		for(int i=1; i<=100;i++) {
			if(i%3==0) tot3+=i; //더해서 저장해라 
			if(i%5==0) tot5+=i; //더해서 저장해라 			
		} 
		
		System.out.println("결과 = "+(tot3-tot5));
		
		
		System.out.println("=========================================");
		//구구단 중 7단을 화면에 출력하세요.
		//ex) 7 * 1 = 7
		//    7 * 2 = 4
		//    ...
		//    7 * 8 = 56
		//    7 * 9 = 63
		for(int i=7; i<8; i++) { //i++값 넣으니 무한루프 멈췄다! 해결 ~
			for(int j=1; j<10; j++) { // =<9하면 자꾸 에러뜬당 
				System.out.println(i+" * "+j+" = "+(i*j)+"\t");
			}
		} // 내가 한 코딩 
		
		int dan=7;
		for(int i=1;i<10;i++) {
			System.out.println(dan+" * "+i+" = "+(dan*i));
		}
		
		System.out.println("=========================================");
		//5!의 결과값을 출력하세요.(5! = 5 * 4 * 3 * 2 * 1)
		//ex)5! = 120
		/*
		int tot2=5*4*3*2*1;
		for(int i=1; i<=5; i++) { 
			System.out.print((6-i)+" * "); //아악 효율적으로 *넣는 방법 모르겠어..ㅠ 	
		}
		System.out.print(" = "+tot2); // 내가 한 코딩 
		*/
		
		int num=5, fac=1; //fac는 곱하기 
		for(int i=num; i>=1; i--) {
			fac*=i;
		}
		System.out.println(num+"! = "+fac );
		
		System.out.println();
		System.out.println("=========================================");
		//두 변수에 저장된 정수값 사이의 정수들을 화면에 출력하세요.
		//단, 한 줄에 정수값이 7개씩 출력되도록 프로그램을 작성하세요.
		//ex) 36    37    38     39     40     41     42
		//    43    44    45     46     47     48     49
		//    50    51    52     53     54     55     56
		//    57
		
		/*
		int begin=36, end=57;
		
		for (int i=36; i<=57; i+=1) {
			for(int j=1; j<=7; j++) {
				System.out.print(i+"\t");
			}
		} //내가 한 코드 엉망ㅠ 
		*/
		
		int begin=36, end=57;
		int count=0; //카운트 변수 하나 추가
		
		for(int i=begin; i<=end;i++) {
			System.out.print(i+"\t");
			count++;
			if(count%7==0) { //7개씩 나열 
				System.out.println();
			}
		}
		if(count%7!=0) { //위에 if 실행되지 않으면 얘가 실행되게 함 
			System.out.println();
		}
		System.out.println();
		System.out.println("=========================================");
	}
}
