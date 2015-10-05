package inharitanse.Vehicle;

/**
 * Created by user on 01.07.15.
 */
public class Vehicle {

    private int passengers;
    private int fuelcap;
    private int mpg;

    Vehicle(int p, int f, int m){

        passengers = p;
        fuelcap = f;
        mpg = m;

    }
    int range(){
        return mpg*fuelcap;
    }
    double fuelneeded(int miles){
        return (double) miles/mpg;
    }

}
