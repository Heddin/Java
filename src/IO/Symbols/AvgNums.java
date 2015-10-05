package IO.Symbols;

import com.sun.org.apache.xpath.internal.operations.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;

/**
 * Created by user on 03.07.15.
 */
public class AvgNums {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        double sum =0.0;
        double avg,t;

        System.out.println("How many numbers you will enter?");
        str = br.readLine();

        try {
            n = Integer.parseInt(str);
        }catch(NumberFormatException e){
            System.out.println("Invalid number format.");
            n = 0;
        }
        System.out.println("Enter "+n+" values.");
        for (int i=0;i<n;i++){
            System.out.print("::");
            str = br.readLine();

            try{
                t = Double.parseDouble(str);
            }catch(NumberFormatException e){
                System.out.println("Invalid number format");
                t = 0;
            }
            sum += t;
        }
        avg = sum/n;
        System.out.println("Average is: "+avg);
    }
}
