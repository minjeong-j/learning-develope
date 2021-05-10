package example;
//4월 28일 
public class MultiForExample {
	public static void main(String[] args) {
		//★★★★		i=1		별=5
		//★★★★		i=2		별=4
		//★★★		i=3		별=3
		//★★		i=4		별=2
		//★			i=5		별=1
		
		for(int i=5;i>=1;i--) { //행 
			for(int j=1;j<=i;j++) { //열 
				System.out.print("★");
			}
			System.out.println();
		}
		
		//쌤 
		for(int i=1;i<=5;i++) { //행 
			for(int j=1;j<=6-i;j++) { //열 
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("==================================================");
		
		
		//★★★★★		i=1		흰별=0	검은별=5
		//☆★★★★		i=2		흰별=1	검은별=4 
		//☆☆★★★		i=3		흰별=2	검은별=3
		//☆☆☆★★		i=4		흰별=3	검은별=2
		//☆☆☆☆★		i=5		흰별=4 	검은별=1
		
		for(int i=5;i>=1;i--) { //
			for(int j=1;j<=5-i;j++) { //
				System.out.print("☆");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		//쌤풀이1, 위에 i 표시와 흰별, 검은별 개수 대입  
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print("☆");
			}
			for(int j=1;j<=6-i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------");
		//쌤풀이 2 
		// 1 2 3 4 5  >> j
		// ★★★★★   	i=1   (i,j) :(1,1)(1,2)(1,3)(1,4)(1,5)
		// ☆★★★★   	i=2			(1,2)(2,2)(2,3)(2,4)(2,5)	
		// ☆☆★★★   	i=3			(3,1)(3,2)(3,3)(3,4)(3,5)
		// ☆☆☆★★   	i=4			(4,1)(4,2)(4,3)(4,4)(4,5)
		// ☆☆☆☆★   	i=5			(5,1)(5,2)(5,3)(5,4)(5,5)
		
		for(int i=1;i<=5;i++) {
		 for(int j=1;j<=5;j++) {
			 if(i>j) {
				 System.out.print("☆");
				 } else {
				 System.out.print("★");
				}
		  }
				System.out.println();
	   }
		
		System.out.println("==================================================");
		
		//★				i=1   별=1 
		//★★★			i=2   별=3 
		//★★★★★		    i=3   별=5
		//★★★★★★★		i=4   별=7
		//★★★★★★★★★		i=5   별=9
		
		/*
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("★");
			} //!(i%2==0) 어디에 넣어줘야할지 모르겠음 
			System.out.println();
		} //내가 만든 코오드... 망 
		*/
		
		//반복처리
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("==================================================");
		
		// 1 2 3 4 5 >> j
		//★☆☆☆★  i=1
		//☆★☆★☆  i=2
		//☆☆★☆☆  i=3
		//☆★☆★☆  i=4
		//★☆☆☆★  i=5
		//바로 위 문제처럼 i값 반복은 안됨, id 부여해서 풀기 
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j || i+j==6) {
					System.out.print("★");
				} else {
					System.out.print("☆");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("==================================================");
		
		
	}
}