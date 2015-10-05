package IO.bytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by user on 03.07.15.
 */
public class CopyFile {
    public static void main(String a[]) throws IOException{

        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        try{
            fin = new FileInputStream("F:\\downloads\\shildt\\src\\IO\\text.txt");
        }catch (FileNotFoundException e){
            System.out.println("40*:File not found.");
        }

        try{
            fout = new FileOutputStream("F:\\downloads\\shildt\\src\\IO\\copyedText");
        }catch(FileNotFoundException e){
            System.out.println("no such file. Panic!");
        }

        try{
            do{
                i = fin.read();
                if (i != -1){
                    fout.write(i);
                }
            }while(i != -1);
        }catch(IOException e){
            System.out.println("File error. Panic!");
        }

        try{
            fout.close();
        }catch(IOException e){
            System.out.println("Error closing output!");
        }

        try{
            fin.close();
        }catch(IOException e){
            System.out.println("Error closing input!");
        }



    }
}
