public class task1 extends Thread
{ public void run()
  { System.out.println("Thread name is : "+Thread.currentThread().getName());
  }
  public static void main(String args[])
  {
   task1 t1 = new task1();
   t1.start();
   }
 }
