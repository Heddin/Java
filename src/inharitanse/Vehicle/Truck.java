package inharitanse.Vehicle;

/**
 * Created by temm on 01.07.2015.
 */
public class Truck extends Vehicle {
    private int cargocap;

    Truck(int p,int f, int m, int c){
        super(p,f,m);
        cargocap = c;
    }
    int getCargo(){
        return cargocap;
    }
    void putCargo(int c){
        cargocap =c;
    }
}
