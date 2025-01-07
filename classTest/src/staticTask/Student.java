package staticTask;

public class Student {

//	학생 총점과 평균을 구해주는 클래스로 구현
//	필드 : 학번, 이름, 국어점수, 영어점수, 수학점수, 토탈, 평균
	int studentNum;
	String name;
	int kGrade, eGrdae, mGrade, total;
	double average;
//	기본생성자 만든다.
	public Student() {;}
	public Student(int studentNum,String name,
			int kGrade, int eGrade, int mGrade) 
	{
		this.studentNum=studentNum;
		this.name=name;
		this.kGrade=kGrade;
		this.eGrdae=eGrade;
		this.mGrade=mGrade;
		this.total=kGrade + eGrade + mGrade;
		this.average=(double)total/3;
	}
	public static void main(String[] args) {
//	객체화
//	초기값으로 : 학번, 이름, 국어점수,영어점수, 수학점수
		Student stu1 = new Student(111, "김태혁", 77, 98, 75);
//	총점과 평균을 출력

		stu1.total += stu1.kGrade+stu1.eGrdae+stu1.mGrade;
		stu1.average=(double)stu1.total/3;
		
		
		System.out.println("총 점:"+stu1.total);
		System.out.printf("평균:%.2f",stu1.average);
		
	     Student yonghee = new Student(0002, "김영희", 100, 100, 88);
	     System.out.println(yonghee.total);
	     System.out.println(yonghee.average);

	}
	
	
	
	
}
