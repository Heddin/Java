package ErrorMSG;

/**
 * Created by temm on 02.07.2015.
 */
public class FinalID {

    public static void main(String args[]){
        ErrorMsg err = new ErrorMsg();

        System.out.println(err.getErrorMsg(err.INNERR));
        System.out.println(err.getErrorMsg(err.OUTERR));

    }
}
