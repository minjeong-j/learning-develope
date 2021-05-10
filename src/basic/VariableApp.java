package basic;

public class VariableApp {

	public static void main(String[] args) {
		//변수 선언형식) 자료형 변수명; 
		int su; //정수값을 저장하기 위한 변수 선언
		su=100; //변수에 정수값 100 저장 - 대입연산자 (=) 이용
		System.out.print("초기값 = ");
		System.out.println(su); //변수값 100 출력
		//int su;// 동일한 영역에 같은 식별자 선언하면 에러
		
		su=200; //변수에 정수값 200 저장 - 기존값 대신 새로운 값 저장
		System.out.print("변경값 = ");
		System.out.println(su);
		System.out.println("=================================================");
		//변수 선언 및 초기값 저장
		
		int num=100;
		//["문자열"+값] 또는 값+"문자열"] >> 문자열 결합
		// =>  +연산자를 이용해 문자열에 값을 결합하여 제공
		System.out.println("num = " +num); //명령을 두번쓰지 않고 한번 쓰게 결합
		System.out.println("=================================================");
		
		System.out.println("올해는 "+2+0+2+1+"년입니다.");
		System.out.println(+2+0+2+1+"년은 소띠해입니다.");
		//"" : 문자가 하나도 없는 문자열 NullString*  
		System.out.println(""+2+0+2+1+"년은 소띠해입니다."); 
		System.out.println("=================================================");
	}

}
