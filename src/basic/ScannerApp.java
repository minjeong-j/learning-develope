package basic;
//4월 29일 
import java.util.Scanner; // Scanner 쳤을 때 이 표현이 나와야한다 

public class ScannerApp {

	public static void main(String[] args) {
		//Scanner 클래스 : 입력장치(키보드, 파일 등)로부터 값을 제공받기 위한 메소드가 선언된 클래스
		//Scanner 클래스로 객체를 생성하여 변수에 저장 - 변수에 저장된 객체로 메소드 호출
		//Scanner 치고 ctrl+space 자바.유틸 써있는 세번째 스캐너 그거 사용해야 함 
		//=>키보드로부터 값을 입력받기 위한 Scanner 객체 생성
		//=>Sysytem.in : 키보드 입력 스트림 - 키보드로 입력된 값을 전달하는 객체 
		Scanner scanner =new Scanner(System.in); //이해하려고 하지말고 외우기***/ =이하 부분:객체
		
		System.out.print("이름 입력 >> ");
		//Scanner.next.Line() : 입력값을 문자열로 변환해서 반환하는 메소드 
		//사용자 키보드로 입력받은 문자열을 변수에 저장 
		// => 키보드 입력값이 없는 경우 프로그램의 흐름(스레드)가 일시 중지된다 
		//=> 사용자 키보드로 값을 입력한 후 엔터를 입력***하면 스레드가 재실행됨 
		String name=scanner.nextLine(); 
		
		System.out.print("나이 입력 >> ");
		//Scanner.nextInt() : 입력값을 정수값으로 변환하여 반환하는 메소드
		//사용자 키보드로 입력받은 정수값을 변수에 저장
		// => 키보드 입력값이 정수값이 아닌 경우 예외(Exception) 발생 
		int age=scanner.nextInt();
		
		System.out.println("[결과]"+name+"님은 "+age+"살입니다.");
				
		//Scanner.close() : Scanner 객체를 제거하는 메소드 
		scanner.close(); //스캐너 닫아주어야 에러 안남~! 
		//사용자로부터 값을 받아 완성시킬 수 있음 
	}

}