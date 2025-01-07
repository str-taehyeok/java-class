package threadTest;

public class Thread1 extends Thread{
	public String data;
	
	public Thread1() {;}

	public Thread1(String data) {
		super();
		this.data = data;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(data);
		}
	}
	
	
	
}
