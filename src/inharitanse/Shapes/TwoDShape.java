package inharitanse.Shapes;

/**
 * Created by user on 30.06.15.
 */
public class TwoDShape {

   private double width;
   private double height;

    TwoDShape(){
        width = height = 0;
    }
    TwoDShape(double x){
        width = height = x;
    }
    TwoDShape(double w,double h){
        width = w;
        height = h;
    }
    TwoDShape(TwoDShape ob){
        width = ob.width;
        height = ob.height;
    }


    void showDim(){
        System.out.println("Width and height are "+width+" and "+height);
    }
    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }
    void setWidth(double w){
        width = w;
    }
    void setHeight(double h){
        height = h;
    }

}
