package staticcode;

public class SKRelated1 {
    static String courseName="Java";
    /*
    Accessing Static Members from Non-Static Context or method
     */
    void course() {
        System.out.println(courseName); // accessing static members directly
        System.out.println(SKRelated1.courseName); // using class name
    }

    public static void main(String[] args){
        new SKRelated1().course();
    }
}
