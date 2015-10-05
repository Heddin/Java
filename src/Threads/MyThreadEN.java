package Threads;

/**
 * Created by user on 20.07.15.
 */
public class MyThreadEN extends Thread {


    MyThreadEN(String name){
       super(name);
       start();
    }
    public void run(){
        System.out.println(getName()+" starting.");
        try{
            for (int i=0;i<10;i++){
                Thread.sleep(400);
                System.out.println("In "+getName()+", count is "+i);
            }
        }catch(InterruptedException e){
            System.out.println(getName()+" interrupted.");
        }
        System.out.println(getName()+" terminating.");
    }

}
