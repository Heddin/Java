package enumeration;

/**
 * Created by user on 21.07.15.
 */
public class TrafficLightDemo {
    public static void main(String args[]){

        TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.RED);
        for (int i = 0; i < 9; i++){
            System.out.println(t1.getColor());
            t1.waitForChange();
        }
        t1.cancel();



    }
}
