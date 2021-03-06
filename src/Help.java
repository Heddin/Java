import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 20.07.15.
 */
public class Help {
    String helpfile;
   Help(String fname){
        helpfile = fname;
    }
    boolean helpon(String what){
        int ch;
        String topic,info;
        try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))){

            do{
                ch = helpRdr.read();
                if (ch == '#'){
                    topic = helpRdr.readLine();
                    if(what.compareTo(topic) == 0){ //topic found
                        do{
                            info = helpRdr.readLine();
                            if (info != null) System.out.println(info);
                        }while((info != null) && (info.compareTo("") != 0));

                    return true;
                    }
                }
            }while(ch != -1);

        }catch(IOException e){
            System.out.println("Error accessing help file");
            return false;
        }

        return false; //no help on such topic;
    }


    String getSelection(){
        String topic = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter topic: ");
        try{
            topic = br.readLine();
        }catch (IOException e){
            System.out.println("Error reading system console");
        }
        return topic;
    }
}
