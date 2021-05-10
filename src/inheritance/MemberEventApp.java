package inheritance;

public class MemberEventApp {
	public static void main(String[] args) {
		//자식 클래스의 생성자로 인스턴스를 생성할 경우 부모 클래스의 생성자가 먼저 호출되어   
		//부모 인스턴스를 만든 다음 자식 인스턴스 생성하여 상속관계 성립 
		// => 참조변수에는 자식 인스턴스 저장 
		MemberEvent member1=new MemberEvent();
		
		//참조변수에는 자식 인스턴스가 저장되어 있으므로 자식 인스턴스의 메소드 호출 
		//=> 자식 인스턴스는 부모 인스턴스를 상속받아 참조 가능하므로 부모 인스턴스의 메소드 호출 가능 
		member1.setId("abc123");
		member1.setName("홍길동");
		member1.setEmail("abc@daum.net");
		
		member1.display(); //자
		System.out.println("===================================================");
		MemberEvent member2=new MemberEvent("xyz789", "임꺽정", "xyz@naver.com");
		member2.display();
		System.out.println("===================================================");
		
		
	}
}
