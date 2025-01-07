package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
//		Thread1 thread1 = new Thread1("?");
//		Thread1 thread2 = new Thread1("!");

//		thread1.run(); -> 단일 쓰레드 처럼 하나씩 작업함
//		thread2.run();

//		thread1.start(); -> 멀티쓰레드
//		thread2.start();
	
		Thread2 target1 = new Thread2();
		Thread2 target2 = new Thread2();

		Thread thread1 = new Thread(target1, "★");
		Thread thread2 = new Thread(target2, "■");

//		우선순위가 메인이 제일 높지만, 아무리 올려도 순서가 바뀔 수 있다.
//		그래서 강제로 "무조건" 단일로 처리하듯이 처리할 수 있어야 한다.
//		thread1.setPriority(1);
		
//		만약 join()보다 먼저 start()를 작성하면 join()은 무시되며,
//		join()은 단일 쓰레드 처럼 먼저 작업된다.
		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		
		System.out.println("메인 쓰레드 작업"); // -> 메인인데도 불구하고 순서가 바뀔 수 있다.
		
		
		
		
		
	}
}
