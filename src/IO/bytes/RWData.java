package IO.bytes;

import java.io.*;
/**
 * Created by user on 03.07.15.
 */
public class RWData {
    public static void main(String args[]){
        int i = 10;
        double d = 1023.6;
        boolean b = true;

        try(DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata.io"))){

            System.out.println("Writing i" );
            dataOut.writeInt(i);

            System.out.println("Writing d" );
            dataOut.writeDouble(d);

            System.out.println("Writing b" );
            dataOut.writeBoolean(b);

        } catch (IOException e) {
            System.out.println("Write Error. Panic!");
        }

        try(DataInputStream dataIn = new DataInputStream(new FileInputStream("testdata.io"))){

            i = dataIn.readInt();
            System.out.println("read i sucsses: "+ i);

            d = dataIn.readDouble();
            System.out.println("read d sucsses: "+ d);

            b = dataIn.readBoolean();
            System.out.println("read b sucsses: "+ b);


        }catch (IOException e){
            System.out.println("Read Error. Panic!");
        }
    }
}
