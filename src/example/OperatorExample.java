package example;
//4월 27일 
public class OperatorExample {
	public static void main(String[] args) {
		//245678초를 일시분초 형식으로 변환하여 출력하세요.
		//하루는 86400초
		//대입연산자, 나누기와 퍼센트 이용 => d-day, 날짜계산에 사용 
				
		/*
		int time=245678;
		double day=time/24;
		double hour=day/
		double min=hour/
		double sec=min/
		*/
		
		int cho=245678;
		System.out.print(cho+"초 >> ");
		
		int day=cho/(24*60*60); //하루를 초단위로 바꿔주는 계산식(시간/분/초)
		//int day=cho/86400; //으로 정리가능 
		
		cho%=86400; //cho=cho%86400; 초를 86400으로 나눈 나머지 
		int hour=cho/(60*60);
		cho%=3600;
		
		int min=cho/60;
		int sec=cho%60;
		System.out.println(day+"일 "+hour+"시 "+min+"분 "+sec+"초");
		
		
		System.out.println("===============================================");
		//한대의 가격이 1억 5천원만인 비행기를 20대 구매할 경우 지불해야될 금액을 계산하여 
		//출력하세요. 
		//단, 15대 이상 구매할 경우 1대당 25%의 할인율을 적용하여 계산하세요. 
		//대입연산자, 삼항연산자 사용:15대 이상이면 가격을 바꾸고 15대 이하는 가격을 바꾸지 않는다
		
		
		int num=14;
		long price=150_000_000l; 
		long p=price*num;
		
		int num2 =6;
		long totp=(long)(price*0.75);
		long p2=totp*num2;
		
		long tot=p+p2;
		System.out.println(tot); //내가 한 과제 코드 ㅠ 
		
		
		int danga=150_000_000, gae=20; //21억 안넘으니 int, 무조건 long으로 잡지는 말자
		//long don=danga*(long)gae; //지불할 금액, int*int=int >> int*long으로 변환해준다 
		long don=(long)(gae>=15?danga*0.75:danga)*gae; //할인되는거 적용하기 
		
		System.out.println("지불금액 ="+don);
		
		
		System.out.println("===============================================");
		}
						
	}
