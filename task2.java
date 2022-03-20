public class task2 implements Runnable
{ public void run()
  { System.out.println("Thread name is : "+Thread.currentThread().getName());
  }
  public static void main(String args[])
  {
   task2 t2 = new task2();
   Thread th1 = new Thread(t2, "First Thread");
   th1.start();
   }
 }
