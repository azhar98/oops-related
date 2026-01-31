package forlooprelated;

import java.util.LinkedHashMap;
import java.util.Map;

public class FLR1 {

     LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();

    public String name = "azharuddin";

        public void init() {
            char[] names = name.toCharArray();
          for (char n: names) {
              if (linkedHashMap.containsKey(n)) {
                  linkedHashMap.put(n,linkedHashMap.get(n)+1);
              }else {
                  linkedHashMap.put(n,1);

              }

          }
            for ( Map.Entry<Character, Integer> entryMap: linkedHashMap.entrySet()) {
               if (entryMap.getValue() == 2) {
                   System.out.println(entryMap);
                  // break;
               }
            }

        }



    public static void main(String[] args) {
new FLR1().init();
    }
}
