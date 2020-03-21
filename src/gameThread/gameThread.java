package gameThread;

public class gameThread extends Thread{

	
	public void run() {
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
