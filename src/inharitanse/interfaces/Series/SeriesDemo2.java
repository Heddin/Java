package inharitanse.interfaces.Series;

/**
 * Created by temm on 02.07.2015.
 */
public class SeriesDemo2 {
    public static void main(String args[]){

        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();

        Series ob;

        for (int i = 0; i < 5; i++){
            ob = twoOb;
            System.out.println("Next byTwos value is "+ob.getNext());
            ob = threeOb;
            System.out.println("Next byThrees value is "+ob.getNext());
        }

    }

}
