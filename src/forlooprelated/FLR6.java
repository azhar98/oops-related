package forlooprelated;

import java.util.LinkedHashMap;

public class FLR6 {

    public static void initMsg() {
        LinkedHashMap<Character,Integer> linkedHashMap = new LinkedHashMap<>();
        String name="javaconceptoftheday";
        char[] nameArr = name.toCharArray();
          String subStr = null;
          int stl = 0;
        for (int i = 0; i < nameArr.length; i++) {
            char ch = name.charAt(i);
           if (!linkedHashMap.containsKey(ch)){
               linkedHashMap.put(ch,i);
           }else {
               i = linkedHashMap.get(ch);
              linkedHashMap.clear();
               System.out.println("i:"+i+"char:"+name.charAt(i));
           }
           if (linkedHashMap.size()>stl){
               subStr = linkedHashMap.keySet().toString();
               stl = linkedHashMap.size();
           }
       }

        System.out.println(subStr);
        System.out.println(stl);

    }


    public static void main(String[] args){
        initMsg();
    }

}
