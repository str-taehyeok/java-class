package inheritanceTask;

public class StudentTask extends PersonTask{
	//StudentTask
	//인스타아이디
	//각 메서드 출력
	//work 아르바이트를 한다
	//sleep 수업 시간에 잠을 잔다
	//eat 아침을 거른다
		
		String instarId;
		public StudentTask() {;}
//		insta아이디 필드 만들고 기본생성자 및 생성자 초기화를 해야하는데 부모클래스에 있는거 다 들고와야되고 super에 넣어줘야 사용 가능
		public StudentTask(String name, int age, String address, String phone, String instarId) {
			super(name, age, address, phone);
			this.instarId = instarId;
		}

		@Override // (work + ctrl+spacebar)
		void work(){
			System.out.println("아르바이트를 한다");
		}
		@Override
		void sleep() {
			System.out.println("수업 시간에 잠을 잔다");
		}
		@Override
		void eat() {
			System.out.println("아침을 거른다");
		}

}
