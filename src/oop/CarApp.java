package oop;

//Car 클래스를 이용하여 작성된 프로그램 
public class CarApp {
	public static void main(String[] args) {
		//클래스로 객체(인스턴스)를 생성하여 참조변수에 저장
		// 형식) 클래스명 참조변수=new 클래스명()
		// => 객체(인스턴스)를 생성하면 인스턴스 필드에는 기본값이 자동으로 저장되어 초기화
		// => 기본값 : 숫자형 : 0, 논리형 : false, 참조형 : null 
		Car carOne=new Car(); //카 클래스=> 자동차를 표현하는 자료형, new car(); => 이 부분이 자동차 
		Car carTwo=new Car();
		
		System.out.println("carOne ="+carOne);
		System.out.println("carTwo ="+carTwo);
		System.out.println("==============================================================");
		//참조변수를 이용하여 참조변수에 저장된 객체(인스턴스)의 요소에 접근하여 사용
		// => .연산자를 이용하여 객체(인스턴스)의 요소(필드 또는 메소드) 접근 
		//문제점)인스턴스로 필드에 직접적인 접근을 허용할 경우 비정상적인 값 저장에 대한 제한을 
		//할 수 없어 실행결과가 잘못되는 오류 발생 가능 
		//해결법} 인스턴스로 필드에 직접적인 접근을 허용하지 않도로 필드의 은닉화 처리 
		//=? 은닉화 선언된 필드에 접근할 경우 에러 발생 
		// => Getter 메소드와 Setter 메소드를 호출하여 필드를 간접적으로 접근하여 제어 
		//carOne.aliasName="티코";
		carOne.setAliasName("티코");
		//carOne.engineStatus=false;
		carOne.setEngineStatus(false);
		//carOne.currentSpeed=0;
		carOne.setCurrentSpeed(0);
		
		//System.out.println("첫번째 자동차의 별칭 = "+carOne.aliasName);
		//Getter 메소드를 호출하여 필드값을 반환받아 사용 
		System.out.println("첫번째 자동차의 별칭 = "+carOne.getAliasName());
		//System.out.println("첫번째 자동차의 엔진상태 = "+carOne.engineStatus);
		System.out.println("첫번째 자동차의 엔진상태 = "+carOne.isEngineStatus());
		//System.out.println("첫번째 자동차의 현재속도 = "+carOne.currentSpeed);	
		System.out.println("첫번째 자동차의 현재속도 = "+carOne.getCurrentSpeed());
		System.out.println("==============================================================");
		
		//carTwo.aliasName="싼타페"; //이렇게 값을 넣어주기 전까지는 null 
		carTwo.setAliasName("싼타페");
		
		//System.out.println("두번째 자동차의 별칭 = "+carTwo.aliasName); //기본적으로 null 들어가있음, null은 존재하지 않아 참조할 수 없다/별칭이 없다를 뜻함 
		System.out.println("두번째 자동차의 별칭 = "+carTwo.getAliasName());
		//System.out.println("두번째 자동차의 엔진상태 = "+carTwo.engineStatus);
		System.out.println("두번째 자동차의 엔진상태 = "+carTwo.isEngineStatus());
		//System.out.println("두번째 자동차의 현재속도 = "+carTwo.currentSpeed);
		System.out.println("두번째 자동차의 현재속도 = "+carTwo.getCurrentSpeed());
		System.out.println("==============================================================");
		//객체(인스턴스)를 이용하여 메소드 호출 - 기능 구현 
		carOne.startEngine();
		carOne.speedUp(30);
		carOne.speedUp(50);
		carOne.speedDown(40);
		carOne.speedZero();
		carOne.stopEngine();
		System.out.println("==============================================================");
	}
}






