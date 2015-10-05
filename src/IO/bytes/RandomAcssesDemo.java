package IO.bytes;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by user on 03.07.15.
 */
public class RandomAcssesDemo {
    public static void main(String args[]){

        double[] data = {19.4, 10.1, 123.4, 33.0, 87.9, 74.25};
        double d;
        try(RandomAccessFile raf = new RandomAccessFile("random.dat","rw")){
            for (int i = 0; i < data.length; i++){
                raf.writeDouble(data[i]);
            }
            raf.seek(0);
            d = raf.readDouble();
            System.out.println("First val is: "+d);

            raf.seek(8);
            d = raf.readDouble();
            System.out.println("Second val is: "+d);

            raf.seek(3*8);
            d = raf.readDouble();
            System.out.println("Fourth val is: "+d);
            System.out.println();

            System.out.println("Here's every other vals: ");

            for (int i = 0; i < data.length;i+=2){
                raf.seek(8*i);
                d = raf.readDouble();
                System.out.println(d+" ");
            }
        }catch(IOException e){
            System.out.println("I/O Error:  \n"+e.getMessage());
        }

    }
}
