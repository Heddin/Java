package inharitanse.Shapes;

/**
 * Created by temm on 02.07.2015.
 */
public class DynShapes {

    public static void main(String args[]){

        TwoDShape shapes[] = new TwoDShape[4];

        shapes[0] = new Triangle("right",8.0,12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10,4);
        shapes[3] = new Triangle(7.0);


        for (int i = 0; i < shapes.length; i++){
            System.out.println("********************");
            System.out.println("Object is " +  shapes[i].getName());
            System.out.println("Area is "+shapes[i].area());
            System.out.println("********************");
            System.out.println();
        }

    }
}
