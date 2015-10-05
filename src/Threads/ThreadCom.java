package Threads;

/**
 * Created by user on 21.07.15.
 */
public class ThreadCom {
    public static void main(String args[]){

        TickTock tt = new TickTock();
        TTThread mt1 = new TTThread("Tick",tt);
        TTThread mt2 = new TTThread("Tock",tt);

        try{
            mt1.thrd.join();
            mt2.thrd.join();
        }catch(InterruptedException e){
            System.out.println("main thread is interrupted");
        }


    }

}
