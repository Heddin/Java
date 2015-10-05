package inharitanse.interfaces.Queve;

import inharitanse.Shapes.Circle;

/**
 * Created by temm on 02.07.2015.
 */

class FixedQueue implements ICharQ{
        private char q[];
        private int putloc,getloc;

        public FixedQueue(int size){
            q = new char[size+1];
            putloc = getloc = 0;
        }
        public void put(char ch){
            if (putloc==q.length-1){
                System.out.println(" - Queue is full");
                return;
            }
            putloc++;
            q[putloc] = ch;

        }
        public char get(){
            if (getloc == putloc){
                System.out.println(" - Queue is empty.");
                return (char) 0;
            }
            getloc++;
            return q[getloc];

        }

}

class CircularQueue implements ICharQ{
        private char q[];
        private int putloc,getloc;

        CircularQueue(int size){
            q  = new char[size+1];
            putloc = getloc =0;
        }

        public void put (char ch){
            if (putloc+1 == getloc | (putloc==q.length-1) & (getloc==0)) {
                System.out.println(" - Queue is Full");
                return;
            }
            putloc++;
            q[putloc] = ch;

        }
        public char get(){
            if (getloc == putloc){
                System.out.println(" - Queue is empty.");
                return (char) 0;
            }
            getloc++;
            if (getloc == q.length) getloc = 0;
            return q[getloc];

        }

}
class DynQueue implements ICharQ{
    private char q[];
    private int putloc,getloc;

    DynQueue(int size){
        putloc = getloc =0;
        q = new char[size+1];
    }

    public void put(char ch) {
        if (putloc==q.length-1){
            char t[] = new char[q.length*2];
            for (int i = 0; i < q.length; i++) t[i] = q[i];
            q = t;
        }

     putloc++;
     q[putloc] = ch;

    }

    public char get() {
        if (getloc == putloc){
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
class IQDemo{

    public static void main(String args[]){

        FixedQueue fq = new FixedQueue(10);
        CircularQueue cq = new CircularQueue(5);
        DynQueue dq = new DynQueue(10);

        ICharQ iQ;

        char ch;
        int i;

        iQ = fq;

        for (i = 0; i < 10; i++){
            iQ.put((char)('A'+i));
        }
        System.out.println("Contents of FixedQ:");
        for (i = 0; i < 10; i++){
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        iQ = cq;

        for (i = 0; i < 10; i++){
            iQ.put((char)('Z'-i));
        }
        System.out.println("Contents of CircularQ:");
        for (i = 0; i < 10; i++){
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        iQ = dq;

        for (i = 0; i < 10; i++){
            iQ.put((char)('A'+i));
        }
        System.out.println("Contents of DynamicQ:");
        for (i = 0; i < 10; i++){
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();
        for (i = 0; i < 20; i++){
            iQ.put((char)('A'+i));
        }
        System.out.println("Contents of DynamicQ:");
        for (i = 0; i < 20; i++){
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();
    }

}