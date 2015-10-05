package IO.Symbols;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 03.07.15.
 */
public class ReadLines {

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        System.out.println("Enter lines!");
        System.out.println("'stop' to quit");

        do{
            str = br.readLine();
            System.out.println(str);
        }while(!str.equals("stop"));
    }
}
