public class task2 extends Thread
{ public void run()
  { System.out.println("Thread name is : "+Thread.currentThread().getName());
  }
  public static void main(String args[])
  {
   task1 t2 = new task2();
   t2.start();
   }
 }
