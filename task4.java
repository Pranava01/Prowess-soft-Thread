public class task4 implements Runnable
{ public void run()
  { System.out.println("Hello All");
  }
  public static void main(String args[])
  {
   task4 T4 = new task4();
   Thread th1 = new Thread(T4);
   th1.start();
   Thread th2 = new Thread(T4);
   th2.start();
   Thread th3 = new Thread(T4);
   th3.start();
   Thread th4 = new Thread(T4);
   th4.start();
   Thread th5 = new Thread(T4);
   th5.start();
   }
 }
