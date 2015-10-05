package inharitanse.Shapes;

/**
 * Created by user on 30.06.15.
 */
public class Shapes {

    public static void main(String args[]){
        Triangle t1 = new Triangle("isosceles",4.0,4.0);
        Triangle t2 = new Triangle("right",8.0,12.0);
        Triangle t3 = new Triangle(t1);

        ColorTriangle ct1 = new ColorTriangle("Blue","right",8.0,12.0);
        ColorTriangle ct2 = new ColorTriangle("Red","isosceles",2.0,2.0);

        System.out.println("info for t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is "+t3.area());

        System.out.println();

        System.out.println("Info for t1:");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is "+t1.area());

        System.out.println();

        System.out.println("Info for t2:");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is "+t2.area());

        System.out.println();

        System.out.println("Info for ct1:");
        ct1.showStyle();
        ct1.showDim();
        ct1.showColor();
        System.out.println("Area is "+ct1.area());

        System.out.println();

        System.out.println("Info for ct2:");
        ct2.showStyle();
        ct2.showDim();
        ct2.showColor();
        System.out.println("Area is "+ct2.area());
    }
}
