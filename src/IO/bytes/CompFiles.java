package IO.bytes;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by user on 03.07.15.
 */
public class CompFiles {
    public static void main(String args[]){
        int i = 0;
        int j = 0;

        try(FileInputStream f1 = new FileInputStream("F:\\downloads\\shildt\\src\\IO\\text.txt");
            FileInputStream f2 = new FileInputStream("F:\\downloads\\shildt\\src\\IO\\copyedText")){

            do{
                i = f1.read();
                j = f2.read();
                if (i != j) break;
            }while(i != -1 && j != -1);

            if (i != j){
                System.out.println("Files different!");
            }else{
                System.out.println("Files are equal.");
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
