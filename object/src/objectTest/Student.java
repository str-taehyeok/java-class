package objectTest;

import java.util.Objects;

public class Student {
	
	private int id;
	private String name;
	private int age;
	
	public Student() {;}

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
//	alt shift s -> h	
//	hashcode, equals 재정의
//	필요에 따라 재정의해서 써야되는 생각 해야됨
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id;
	}

	public static void main(String[] args) {
		Student student = new Student();
		student = new Student(1, "김태혁", 27);
		
//		책 대여 프로그램
		if(student.equals(new Student(1, "김태혁", 27))){
			System.out.println("대여 완료");
		}else {
			System.out.println("도난 신고");
		}
		
		
		
		
	}
}
