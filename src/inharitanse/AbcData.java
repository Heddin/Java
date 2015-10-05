package inharitanse;

/**
 * Created by temm on 01.07.2015.
 */
    class A{
        A(){
            System.out.println("Constructing A.");
        }

    }
    class B extends A{
        B(){
            System.out.println("Constructing B.");
        }
    }
    class C extends B{
        C(){
            System.out.println("Constructing C.");
        }
    }
