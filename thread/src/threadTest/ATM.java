package threadTest;

public class ATM implements Runnable{
	int money = 10000;
	
	void withdraw(int money) {
//		synchronized(객체){} ->동기화 
		synchronized(this) {
		this.money -= money;
		}
		System.out.println(Thread.currentThread().getName() + "이(가)" + money + "원 출금");
		System.out.println("현재 잔액: "+ this.money+"원");
	}
	
	
	
	
	@Override
	public void run() {
//		Thread.interrupted();
//		쓰레드 종료시 위 메서드로 탈출 후 정상종료 시켜야한다.
		
//		쓰레드가 멈췄을 때에만 종료할 수 있다.
//		그래서 InterruptedException을 잡아서 프로그램 종료하는게 아니라
//		try~catch로 무조건 잡고나서 처리하라고 Exception을 받은 것이다.
		for(int i=0; i<5; i++) {
			withdraw(1000);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
