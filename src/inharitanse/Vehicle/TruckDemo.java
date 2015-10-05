package inharitanse.Vehicle;

/**
 * Created by temm on 01.07.2015.
 */
public class TruckDemo {
    public static void main(String args[]){
        Truck semi = new Truck(2,200,7,44000);
        Truck pickup = new Truck(3,28,15,2000);

        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);
        System.out.println("Semi can carry "+semi.getCargo()+" pounds.");
        System.out.println("To go to "+ dist +" miles semi needs "+gallons+" gallons of fuel.");
        System.out.println();
        gallons = pickup.fuelneeded(dist);
        System.out.println("Pickup can carry "+pickup.getCargo()+" pounds.");
        System.out.println("To go to "+ dist +" miles pickup needs "+gallons+" gallons of fuel.");

    }
}
