package forlooprelated;

import java.util.HashMap;
import java.util.Objects;

public class FLR {

    public static HashMap<Integer,String> hashMap = new HashMap<>();

    static {
        init();
    }

    public static void init() {
        hashMap.put(1,"SUCCESS");
        hashMap.put(2,"ERROR");
        hashMap.put(3,"BAD_REQUEST");
        hashMap.put(4,"NOT_FOUND");
        hashMap.put(6,"ERROR");
        hashMap.put(5,"INTERNAL_SERVER_ERROR");
    }

    public static String getMessage(int number) {
        return hashMap.get(number);
    }

    public static void main(String[] args) {
        for (int i=0; i<7; i++){
            if (Objects.equals(getMessage(i), "ERROR")){
                System.out.println(i);
                break;
            }

        }
    }
}
