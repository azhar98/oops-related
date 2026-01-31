package staticcode;

public class SKBlock {
    static String name;
    static String password;

    static {
        name = "Azharuddin Mondal";
        password = "123456";
    }

    public static void main(String[] args) {
        System.out.println("Name:"+name+" & Password:"+password);
    }
}
