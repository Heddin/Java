package IO.bytes;

import java.io.IOException;

/**
 * Created by user on 03.07.15.
 */
public class ReadBytes {
    public static void main(String args[]) throws IOException{
        byte[] data = new byte[10];

        System.out.println("Enter some chars.");
        System.in.read(data);
        System.out.println("you entered: ");
        for (int i = 0; i < data.length; i++){
            System.out.print((char)data[i]);
        }
    }
}
