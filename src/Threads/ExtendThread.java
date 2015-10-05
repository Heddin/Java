package Threads;

/**
 * Created by user on 20.07.15.
 */
public class ExtendThread {
    public static void main(String args[]){

        MyThreadEN mte = new MyThreadEN("Child#1");

        do {
            for (int i = 0; i < 50; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Main thread is interrupted.");
                }
            }
        }while(mte.isAlive());

        System.out.println("Main thread ending.");
    }
}
