package inharitanse.Shapes;

/**
 * Created by user on 30.06.15.
 */
public class Rectangle extends TwoDShape {

    Rectangle(double w, double h) {
        super(w, h);
    }

    boolean isSqure(){

        if (getWidth()== getHeight()){
            return true;
        }else{
            return false;
        }

    }
    double area(){
        
        return getWidth()*getHeight();
    }
}
