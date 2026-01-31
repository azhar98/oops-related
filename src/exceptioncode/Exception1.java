package exceptioncode;

public class Exception1 {

    public static int msgint() {
        try{
            int a= 100/0;
            return 10;
        } catch (Exception e) {
            return 20;
        }finally {
            return 30;
        }
    }

    public static void main(String[] args){
        System.out.println(Exception1.msgint());;
    }
}
