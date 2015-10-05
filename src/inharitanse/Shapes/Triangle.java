package inharitanse.Shapes;

/**
 * Created by user on 30.06.15.
 */
public class Triangle extends TwoDShape {
    private String style;

    double area(){
        return getWidth()*getHeight() / 2;
    }
    void showStyle(){
           System.out.println("Triangle is " + style);
    }

    Triangle(){
        super();
        style = "null";
    }

    Triangle(String s, double w, double h){
        super(w,h);
        style = s;
    }

    Triangle(double x){
        super(x);
        style = "isosceles";
    }
    Triangle(Triangle ob){
        super(ob);
        style = ob.style;
    }

}
