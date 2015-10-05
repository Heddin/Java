package enumeration;

/**
 * Created by user on 21.07.15.
 */
public class TrafficLightSimulator implements Runnable{

    private Thread thrd;
    private TrafficLightColor tlc;
    boolean stop = false;
    boolean changed = false;

    TrafficLightSimulator(TrafficLightColor init){
        tlc = init;

        thrd = new Thread(this);
        thrd.start();
    }
    TrafficLightSimulator(){
        tlc = TrafficLightColor.RED;

        thrd = new Thread(this);
        thrd.start();
    }

    synchronized void changeColor(){

        switch(tlc){
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
        }
        changed = true;
        notify();
    }
    synchronized void waitForChange(){
        try{

            while(!changed){
                wait();
            }
            changed = false;

        }catch(InterruptedException e){
            System.out.println(e);
        }
    }

    public TrafficLightColor getColor(){
        return tlc;
    }
    public void cancel(){
        System.out.println(":: ended simulation...");
         stop = true;
    }


    public void run(){
        while (!stop){

            try{

                switch(tlc){
                    case RED:
                        Thread.sleep(10000);
                        break;
                    case YELLOW:
                        Thread.sleep(2000);
                        break;
                    case GREEN:
                        Thread.sleep(12000);
                        break;
                }

            }catch(InterruptedException e){
                System.out.println(e);
            }
            changeColor();
        }
    }

}
