package inharitanse.dynDisdpMeth;

/**
 * Created by temm on 02.07.2015.
 */
public class DynDispDemo {

    public static void main (String a[]){

        Sup superOb = new Sup();
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();

        Sup supRef;

        supRef = superOb;
        supRef.who();

        supRef = subOb1;
        supRef.who();

        supRef = subOb2;
        supRef.who();

    }
}
