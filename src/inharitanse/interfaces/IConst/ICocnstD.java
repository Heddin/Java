package inharitanse.interfaces.IConst;

import com.sun.org.apache.bcel.internal.generic.ICONST;

/**
 * Created by temm on 02.07.2015.
 */
public class ICocnstD implements IConst {

    public static void main(String args[]){
        int nums[] = new int[MAX];
        for (int i = MIN; i < 11; i++){
            if (i >= MAX) System.out.println(ERRORMSG);
            else {
                nums[i] = i;
                System.out.println(nums[i] + " ");
            }
        }
    }
 }
