package inheritanceTask;

public class InheritanceTask2{

	
	void behavior(PersonTask person) {
		if(person instanceof StudentTask) {
			StudentTask st = (StudentTask)person;
			st.eat();
		}else if(person instanceof EmployTask) {
			EmployTask et = (EmployTask)person;
			et.eat();
		}
	}
	
	
	 public static void main(String[] args) {
//	 사람, 학생, 직장인을 객체화 후 각 메서드를 출력      
		 PersonTask p = new PersonTask();
		 PersonTask s = new StudentTask();
		 PersonTask e = new EmployTask();
		 System.out.println("☆사람일 경우☆");
		 p.work();
		 p.sleep();
		 p.eat();

		 System.out.println("☆학생일 경우☆");
		 s.work();
		 s.sleep();
		 s.eat();
		 
		 System.out.println("☆직장인일 경우☆");
		 e.work();
		 e.sleep();
		 e.eat();
//		 InheritanceTask2 it2 = new InheritanceTask2();
//		 it2.behavior(new StudentTask());
//		 it2.behavior(new EmployTask());
	 }
}
