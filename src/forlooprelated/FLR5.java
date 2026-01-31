package forlooprelated;

import java.util.HashMap;

public class FLR5 {
    String name = "azharuddin mondal";
    String rvName ="";
    String rvsName ="";
    String fruitLists = "apple:1,lemon:1,grave:1,apple:2,apple:3,grave:4"; // output:[apple:3,lemon:1,grave:1]

    public void init() {
        for (int i = name.length()-1; i >= 0; i--) {
            rvName+= name.charAt(i);
        }
        System.out.println(rvName);

        String[] strArr = name.split(" ");
        for (String strn: strArr){
            //System.out.println(new StringBuilder(strn).reverse());
            for (int i = strn.length()-1; i >=0 ; i--) {
                rvsName+= strn.charAt(i);
            }
            rvsName+=" ";
        }
        System.out.println(rvsName);
    }


    public void init2(){
        HashMap<String,Integer> hashMap = new HashMap<>();
        String[] fruitArr = fruitLists.split(",");
        for (String fruit: fruitArr){
            String[] fruitsArr = fruit.split(":");
            String fKey = fruitsArr[0];
            int fNum = Integer.parseInt(fruitsArr[1]);
            if (hashMap.containsKey(fKey)){
                hashMap.put(fKey, hashMap.get(fKey)+fNum);
            }else {
                hashMap.put(fKey, fNum);
            }
        }
        System.out.println(hashMap);

    }

    public static void main(String[] args){
      new FLR5().init();
        new FLR5().init2();
    }
}
