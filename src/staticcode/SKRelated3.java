package staticcode;

public class SKRelated3 {
    static int data = 50;

    static class InnerClass {
        void show() {
            System.out.println("Data from static nested class: " + data);
        }
    }

    public static void main(String[] args) {
       // OuterClass.InnerClass obj = new OuterClass.InnerClass();
        //obj.show();
        new SKRelated3.InnerClass().show();
    }
}
