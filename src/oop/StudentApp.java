package oop;

public class StudentApp {
	public static void main(String[] args) {
		/*
		Student student1=new Student(1000, "홍길동", 90, 90);
		Student student2=new Student(2000, "임꺽정", 94, 88);
		Student student3=new Student(3000, "전우치", 92, 80);
		Student student4=new Student(4000, "일지매", 76, 82);
		Student student5=new Student(5000, "장길산", 84, 86);
		
		//student1.calcTot();
		//student2.calcTot();
		//student3.calcTot();
		//student4.calcTot();
		//student5.calcTot(); //calcTot 메소드 호출해 합계 구하기 
		
		student1.setKor(100);
		//student1.calcTot();
		
		student1.display();
		student2.display();
		student3.display();
		student4.display();
		student5.display();
		*/
		
		//인스턴스를 저장할 수 있는 참조요소가 여러개 존재하는 배열 생성
		// => 배열의 참조요소에는 기본값으로 null 저장
		/*
		Student[] students=new Student[5];
		
		students[0]=new Student(1000, "홍길동", 90, 90);
		students[1]=new Student(2000, "임꺽정", 94, 88);
		students[2]=new Student(3000, "전우치", 92, 80);
		students[3]=new Student(4000, "일지매", 76, 82);
		students[4]=new Student(5000, "장길산", 84, 86);
		*/
		
		Student[] students=new Student[] {
				new Student(1000, "홍길동", 90, 90)
				,new Student(2000, "임꺽정", 94, 88)
				,new Student(3000, "전우치", 92, 80)
				,new Student(4000, "일지매", 76, 82)
				,new Student(5000, "장길산", 84, 86)
		};
		
		//일괄처리를 이용하여 메소드 호출
		/*
		for(int i=0;i<students.length;i++) {
			students[i].display();
		}
		*/
		
		//int total=0;//모든 학생의 총점 합계를 저장하기 위한 변수
		
		for(Student student:students) {
			student.display();
			//학생의 총점을 반환받아 총점 합계에 누적하여 저장
			//total+=student.getTot();

			//정적필드는 클래스를 이용하여 접근해 사용 가능 - 접근지정자가 public인 경우
			//Student.total+=student.getTot();
			
			//정적메소드는 클래스를 이용하여 접근해 사용 가능
			Student.setTotal(Student.getTotal()+student.getTot());
		}
		System.out.println("=====================================================");
		//모든 학생들의 총점 합계 출력
		//System.out.println("총합계 = "+total);
		//System.out.println("총합계 = "+Student.total);
		System.out.println("총합계 = "+Student.getTotal());
		System.out.println("=====================================================");
	}
}

