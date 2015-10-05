package inharitanse.abcs;

/**
 * Created by temm on 01.07.2015.
 */
    class A{
        int i,j;
        A(int a,int b){
           i=a;
           j=b;
        }
        void show(){
            System.out.println("i and j: "+i+" "+j);
        }

    }
    class B extends A{
        int k;
        B(int a, int b, int c){
            super(a,b);
            k = c;
        }
        void show(){
            super.show();
            System.out.println("k: "+k);
        };
    }
    class C extends B{
        C(int a,int b,int c) {
            super(a,b,c);
            System.out.println("Constructing C.");
        }
    }
