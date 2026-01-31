package staticcode;

public class SKRelated {
    public static int a=10;
    static int b=20;
       int c=12;
    static void display() {
        System.out.println("print the static block.....");
    }

    /*
        1. Accessing Static Members from Static Context (like main() method)
         */
    public static void main(String[] args) {

        //accessing static variables and methods directly
        System.out.println("print value of a:"+a);
        display();

        //accessing variable and method using the class name.
        System.out.println("print value of a:"+ SKRelated.a);
        SKRelated.display();
    }

}


