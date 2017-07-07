import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread {
	
public static void main(String[] args) {
			System.out.println("Starting");
			
			
			ExecutorService execService = Executors.newFixedThreadPool(10);
			
			execService.execute(new Target());
			execService.execute(new Target());
			execService.execute(new Target());
			execService.execute(new Target());
			execService.execute(new Target());
			execService.execute(new Target());
			execService.execute(new Target());
			execService.execute(new Target());
			execService.execute(new Target());
			execService.execute(new Target());
			
			execService.shutdown();

			System.out.println("Ending");
			

		}

	}



