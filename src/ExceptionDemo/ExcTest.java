package ExceptionDemo;

/**
 * Created by temm on 02.07.2015.
 */
public class ExcTest {
    static void genException(){
        int num[] = new int[4];

        System.out.println("Before Exception generated");

        num[7] = 7;
        System.out.println("this won't be displayed");
    }
}
