
import java.util.concurrent.TimeUnit;
public class Target implements Runnable {

	private static int count = 0;
	private int id;
	
	@Override
	public void run() {
		System.out.println("Thread" + id + "> starts");

		
		for (int i=10; i>0; i--) {
			System.out.println("Thread" + id +  + i);
			try{
				TimeUnit.MILLISECONDS.sleep((long)(Math.random() * 1000));	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread" + id + "> Ends");

	}
	public Target() {
		this.id = ++count;
	}
}




