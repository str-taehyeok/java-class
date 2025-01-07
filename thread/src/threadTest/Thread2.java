package threadTest;

public class Thread2 implements Runnable{
	
//	run은 자원에 쓰레드가 접근
//	자원에 접근한 쓰레드를 확인할 수 있게 작업을 완료
//	동시가 아니라 차례로 객체 하나씩 접근
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
