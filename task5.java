import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class SimpleThreadPool 
{    public static void main(String[] args)
 {   ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 1; i <=10; i++) 
        {   Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
         }
        executor.shutdown();
  }
}
class WorkerThread implements Runnable 
{    private String command;
     public WorkerThread(String s)
     { this.command=s;
      }
    @Override
    public void run() 
    { System.out.println(command);
    }
}
