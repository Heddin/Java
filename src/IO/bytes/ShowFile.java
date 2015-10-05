package IO.bytes;
import java.io.*;
/**
 * Created by user on 03.07.15.
 */
public class ShowFile {

    public static void main(String args[]) throws IOException{

        int i;


        if (args.length != 1){
            System.out.println("Usage: java ShowFile <filename>");
        }
        try(FileInputStream fin = new FileInputStream("F:\\downloads\\shildt\\src\\IO\\text.txt")){

            do{
                i = fin.read();
                if(i != -1){
                    System.out.print((char)i);
                }
            }while(i != -1);

        }catch(FileNotFoundException e){
            System.out.println("File not found!");
            return;
        }catch(IOException e) {
            System.out.println("Error reading file");
        }

    }


}
