package Threads;

/**
 * Created by user on 20.07.15.
 */
public class UseThreads {
    public static void main(String args[]){
        MyThread mt = new MyThread("Child#1");
        Thread newThread = new Thread(mt);
        newThread.start();

        MyThreadEN mte = new MyThreadEN("Child#2");

        for(int i = 0; i<50;i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                System.out.println("Main thread is interrupted.");
            }
        }

        System.out.println("Main thread ending.");
    }
}
