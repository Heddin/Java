package IO.Symbols;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 03.07.15.
 */
public class TextToDisk {
    public static void main(String args[]) throws IOException{
        String str;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter text('stop' to quit)");
        try(FileWriter fw = new FileWriter("test.txt")){
            do{
                System.out.print(": ");
                str = br.readLine();
                if (str.compareTo("stop") == 0) break;
                 str = str+"\r\n"; /// New line!
                 fw.write(str);
            }while(str.compareTo("stop") != 0);

        } catch (IOException e) {
           System.out.println("I/O error: "+e.toString());
        }

    }
}
