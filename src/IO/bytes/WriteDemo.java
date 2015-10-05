package IO.bytes;

import java.io.IOException;

/**
 * Created by user on 03.07.15.
 */
public class WriteDemo {
    public static void main(String args[]) throws IOException{

        int b;
        b = 'S';

        System.out.write(b);
        System.out.write('\n');

    }
}
