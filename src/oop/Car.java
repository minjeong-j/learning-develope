package oop;

//자동차를 표현하기 위한 클래스 
// => 클래스를 작성할 때 필드 또는 메소드에 접근 지정자를 선언하여 접근 유무 설정
//접근 지정자(Access Modifier) : private*, package, protected, public* 
// => 클래스, 필드, 생성자, 메소드에 선언하여 접근 유무를 지정하는 키워드
	// private : 클래스  내부에서만 접근 가능하며 외부에서는 접근 불가능하도록 설정하는 지정자 
	// => 필드 선언시 사용 : 인스턴스 필드에 직접적인 접근 차단 - 은닉화(Data Hiding)이라 부름
	//public : 모든 패키지의 클래스에서 접근하도록 설정하는 지정자, 명제 
	//=>메소드 선언 시 사용 가능 : 메소드를 모든 클래스에서 접근하여 사용할 수 있도록 지정
public class Car {
	// 필드(Field) : 표현에 대상에 대한 속성 구현 - 속성값 저장 
	// => 클래스에 선언된 모든 메소드에서 필드에 접근하여 사용 가능 
	private String aliasName; // 이름(별칭) - 고유값 (식별자는 카멜표기법 작성)  
	private boolean engineStatus; // 엔진 상태(시동유무) - false :off, true : on
	private int currentSpeed;// 현재속도, private 붙이기를 권,장. 
	
	//생성자(Constructor) : 객체(인스턴스)를 생성하기 위한 특별한 메소드
	// => 하나의 생성자도 선언하지 않으면 매개변수가 없는 기본 생성자가 존재하는 것으로 처리된다
	
	//메소드(Method) : 표현 대상에 대한 행위를 구현 - 명령들을 이용한 기능 구현/명령 모임 
	// => 필드를 이용하여 표현 대상의 행위를  명령을 작성해 기능으로 제공 
	
	//시동을 켜는 행위를 메소드로 구현 - engineStatus 필드값 변경
	void startEngine() {
		engineStatus=true;
		System.out.println(aliasName+"의 시동을 켰습니다."); //눈에 보여지는 기록으로 남겨줌 
	}
	
	//시동을 끄는 행위를 표현한 메소드 
	void stopEngine() {
		
		if(currentSpeed!=0) { //현재 속도가 0이 아닌 경우
			/*
			currentSpeed=0;
			System.out.println(aliasName+"의 자동차를 멈췄습니다.");\
			*/
			
			//클래스 내부에 선언된 메소드는 서로 호출 가능
			// => 코드의 중복성 최소화 : 유지보수의 효율성 증가 
			speedZero();
		}
		
		engineStatus=false;
		System.out.println(aliasName+"의 시동을 껐습니다.");
	}
	
	//속도를 증가하는 행위를 표현한 메소드 
	void speedUp(int speed) {
		if(!engineStatus) {//엔진이 꺼져 있는 경우
			System.out.println(aliasName+"의 시동이 꺼져 있습니다.");
			return;
		}
		
	 	//매개변수에 비정상적인 값이 전달된 경우 
		if(currentSpeed+speed>150) { //잘못된 값 500km가 들어오더라도 최대 속도 150이 나온다 
			speed=150-currentSpeed; 
		}
		
		currentSpeed+=speed;
		System.out.println(aliasName+"의 속도가 "+speed
				+"Km/h 증가 되었습니다. 현재 속도는" +currentSpeed+"Km/h 입니다.");
		
	}
		//자동차 속도를 감소하는 행위를 표현한 메소드
		public void speedDown(int speed) {
			if(!engineStatus) {//엔진이 꺼져 있는 경우
				System.out.println(aliasName+"의 시동이 꺼져 있습니다.");
				return;
			}
			
			if(currentSpeed<speed) {
				speed=currentSpeed;
			}
			
			currentSpeed-=speed;
			System.out.println(aliasName+"의 속도가 "+speed
					+"Km/h 감소 되었습니다. 현재 속도는 "+currentSpeed+"Km/h 입니다.");
		}
		
		//자동차를 멈추는 행위를 표현한 메소드
		public void speedZero() {
			currentSpeed=0;
			System.out.println(aliasName+"의 자동차가 멈췄습니다.");
		}
		
		//은닉화 선언된 필드를 필드값을 반환하는 Getter 메소드와 필드값을 변경하는 Setter 
		//메소드 선언 >> 캡슐화 
		//*** 게터와 세터 만들어주는거 중요함/ 메뉴-Source-generate getters and setters 
		//*** 캡슐화(Getter & Setter) 메소드 자동 생성 단축키 
		//*** [alt]+[shift]+[S] >> 팝업메뉴가 나오고 [R] >> 생성메뉴 >> 필드 선택 (대부분 all) >> Generate
		public String getAliasName( ) { //Getter 메소드 - 메소드명 : get필드명
			return aliasName; // 필드값 반환		
		}
		
		//은닉화 선언된 필드 자료형이 boolean인 경우 Is 메소드를 선언 
		public boolean isEngineStatus() {
			return engineStatus;
		}

		public void setEngineStatus(boolean engineStatus) {
			this.engineStatus = engineStatus;
		} //this. 객체, 자기 자신의 속성을 나타낼 때 사용  

		public int getCurrentSpeed() {
			return currentSpeed;
		}

		public void setCurrentSpeed(int currentSpeed) {
			this.currentSpeed = currentSpeed;
		}

		public void setAliasName(String aliasName) { //Setter 메소드 - 메소드명 : set필드명
			//매개변수로 전달되어 저장된 값으로 필드값 변경 
			// => 매개변수에 전달된 값에 대한 유효성 검사  
			//aliasName=name; //필드값 변경 매개변수 aliasName
			this.aliasName=aliasName; // 매개변수의 값을 필드에 저장해주세요 +위 String name도 String aliasName으로 변경해야함 
			
		}
		
	}




