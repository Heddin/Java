package IO.Symbols;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by user on 03.07.15.
 */
public class PrintWriterDemo {

    public static void main(String args[]) throws IOException{

        PrintWriter pw = new PrintWriter(System.out,true);

        int i = 10;
        double d = 1023.56;

        pw.println("Using PrintWriter!");
        pw.println(i);
        pw.println(d);
        pw.println(i+"+"+d+"="+(i+d));

    }
}
