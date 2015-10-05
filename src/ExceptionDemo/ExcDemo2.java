package ExceptionDemo;

/**
 * Created by temm on 02.07.2015.
 */
public class ExcDemo2 {
    public static void main(String args[]){
        try{
            ExcTest.genException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out-of-bounds!");
        }
    }
}
