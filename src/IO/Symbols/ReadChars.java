package IO.Symbols;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 03.07.15.
 */
public class ReadChars {
    public static void main(String args[]) throws IOException{
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter chars, period to quit");
        do{
            c = (char) br.read();
            System.out.print(c);
        }while(c != '.');
    }
}
