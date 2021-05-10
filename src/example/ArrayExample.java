package example;
//4월 30일 
public class ArrayExample {
//Array 합계와 평균
	public static void main(String[] args) {
		//사람들의 나이를 저장한 배열 선언
		int[] age={27,16,22,36,57,60,43,23,14,29,44,52,69,51,39,33,11};
		
		//배열에 저장된 사람들의 평균 나이를 계산하여 출력하세요.
		//ex) 평균 나이 = 36살
		
		/*
		int[] array= {27,16,22,36,57,60,43,23,14,29,44,52,69,51,39,33,11};
		int tot=0;
		for(int num:array) {
			tot+=num;
		}
		
		System.out.println("나이의 합계 = " +tot+"살");
		System.out.println("평균 나이 = " +tot/17+"살"); //17을 세지 않고 변수로 넣어줘야하나? 
		*/
		
		int[] array= {27,16,22,36,57,60,43,23,14,29,44,52,69,51,39,33,11};
		int sum=0; 
		for(int i=0; i<array.length; i++) { //i는 0부터 array.length-1까지 하나씩 증가 
			sum+=array[i];
		}
		
		System.out.println("나이의 합계 = " +sum+"살");
		System.out.println("평균 나이 = " +sum/array.length+"살");
		
		
		
		System.out.println("======================================================");
		//배열에 저장된 사람들의 나이를 연령별로 구분하여 인원수를 계산하여 출력하세요.
		//ex) 10대 = 3명
		//    20대 = 4명
		//    ...
		//    60대 = 2명 /연령대 6개 10,20,30,40,50,60
		// if-else if 혹은 switch 사용도 가능, count[num/10-1]++; 
		
		/*
		int count10=0;
		for(int number:array) {
			if(number>10 && number<20) {
				count10++;
			} else if(number>20 && number<30) {
				
			}//이렇게 쓰면 변수이름 여러개쓰고 너무 길어짐 
		}
		
		System.out.println("10대 인원수 = "+count10);
		System.out.println("20대 인원수 = "+count);
		System.out.println("30대 인원수 = "+count);
		System.out.println("40대 인원수 = "+count);
		System.out.println("50대 인원수 = "+count);
		System.out.println("60대 인원수 = "+count);
		 */
		
		int[]count = new int[6]; // 변수는 초기값 줘야하지만 배열은 기본적으로 초기화 0 저장된다 
		for(int num:age) {
			count[num/10-1]++; //27/10-1=2-1=count[1];
		}
		for(int i=0; i<count.length; i++) {
			System.out.println((i+1)*10+"대 인원수 = "+count[i]+"명");
		}
		
		
		System.out.println("======================================================");
	}
}