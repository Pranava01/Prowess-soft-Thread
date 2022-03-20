public class task3 extends Thread
{ public void run()
  { System.out.println("Hello All");
  }
  public static void main(String args[])
  {
   task3 t1 = new task3();
   t1.start();
   task3 t2 = new task3();
   t2.start();
   task3 t3 = new task3();
   t3.start();
   task3 t4 = new task3();
   t4.start();
   task3 t5 = new task3();
   t5.start();
   }
 }
