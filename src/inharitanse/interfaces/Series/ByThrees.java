package inharitanse.interfaces.Series;

/**
 * Created by temm on 02.07.2015.
 */
public class ByThrees implements Series{

    int start;
    int val;
    int prev;

    ByThrees(){
        start = 0;
        val = 0;
        prev = -3;
    }
    public int getNext(){
        prev = val;
        val += 3;
        return val;
    }
    public void reset(){
        start = 0;
        val = 0;
        prev = -3;
    }
    public void setStart(int x){
        start = x;
        val = x;
        prev = x - 3;
    }
    int getPrev(){
        return prev;
    }

}
