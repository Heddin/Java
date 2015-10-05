package ErrorMSG;

/**
 * Created by temm on 02.07.2015.
 */
public class ErrorMsg {
    final int OUTERR = 0;
    final int INNERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

    String msgs[] = {
        "Output Error",
        "Input Error",
        "Disk Full",
        "Index Out-of-Bounds"
    };

    String getErrorMsg(int e){
        if (e >=0 & e < msgs.length){
            return msgs[e];
        }else{
            return "Unknown Error";
        }
    }

}
