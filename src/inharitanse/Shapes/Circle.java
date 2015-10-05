package inharitanse.Shapes;

/**
 * Created by temm on 02.07.2015.
 */
public class Circle extends TwoDShape{
    final double PI = 3.141619;
    private double radius;
    Circle(){
        super();
        radius = 0.0;
    }
    Circle(double x, double r){
        super(x,"Circle");
        radius = r;
    }
    Circle(Circle ob){
        super(ob);
        radius =ob.radius;
    }

    public double getRadius() {
        return radius;
    }

    double area() {
        return 2*PI*radius;
    }
}
