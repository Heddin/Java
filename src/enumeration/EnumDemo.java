package enumeration;

/**
 * Created by user on 21.07.15.
 */
enum Transport{
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);
    private int speed;
    Transport(int s){
        speed = s;
    }
    int getSpeed(){
        return speed;
    }

}

public class EnumDemo {
    public static void main(String args[]){

        Transport tp;

        tp = Transport.AIRPLANE;

        System.out.println("Typical speed for an atplane is "+tp.getSpeed()+" miles per hour");

        for (Transport t : Transport.values()){
            System.out.println(t +" typical speed is " +t.getSpeed()+" miles per hour" );
        }

        System.out.println("Value of tp: "+tp);
        System.out.println();

        tp = Transport.TRAIN;

        if (tp == Transport.TRAIN) System.out.println("tp contains TRAIN");

        switch(tp){
            case CAR:
                System.out.println("A car carries people");
                break;
            case TRUCK:
                System.out.println("A truck carries freight");
                break;
            case AIRPLANE:
                System.out.println("An airplane flies.");
                break;
            case TRAIN:
                System.out.println("A train runs on the rails.");
                break;
            case BOAT:
                System.out.println("A boat sails on water");
        }

    }
}
