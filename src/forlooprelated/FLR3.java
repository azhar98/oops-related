package forlooprelated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class FLR3 {
     LinkedHashMap<Character,Integer> linkedHashMap = new LinkedHashMap<>();
     ArrayList<Map.Entry<Character,Integer>> arrayList= new ArrayList<>();
    String name = "azharuddinmondal";
    String[] namChar;
      int index=0;
      int max=0;
      char maxChar;
    public void init() {
        for (int i = 0; i < name.length(); i++) {
            if (linkedHashMap.containsKey(name.charAt(i))){
                linkedHashMap.put(name.charAt(i),linkedHashMap.get(name.charAt(i))+1);
            }else {
                linkedHashMap.put(name.charAt(i),1);
            }
        }
        namChar = new String[linkedHashMap.size()];
        System.out.println(linkedHashMap.size());
        System.out.println(linkedHashMap);
        for (Map.Entry<Character,Integer> entry: linkedHashMap.entrySet()){
            namChar[index]=entry.toString();
            index++;
        }
        System.out.println(Arrays.toString(namChar));

//        for (int i = namChar.length - 1; i >=0; i--) {
//            System.out.println(namChar);
//        }

        for (Map.Entry<Character,Integer> entry: linkedHashMap.entrySet()){
            arrayList.add(entry);
            if (entry.getValue()>max){
                max= entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println(max+":"+maxChar);
        System.out.println("koll: "+arrayList.get(arrayList.size()-3).getKey() +":"+arrayList.get(arrayList.size()-3).getValue());


    }



    public static void main(String[] args){
        new FLR3().init();
    }
}
