package staticcode;

public class SkRelated2 {

    static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        /*
        accessing the static method using class name or directly
         */
        System.out.println(SkRelated2.square(4));
        System.out.println(square(3));
    }
}
