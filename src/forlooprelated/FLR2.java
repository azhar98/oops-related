package forlooprelated;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class FLR2 {
   public static LinkedHashMap<Character, Integer> target = new LinkedHashMap<>();
   public static ArrayList<Map.Entry<Character,Integer>> arrayListTarget = new ArrayList<>();
    static {
        target.put('a',1);
        target.put('b',1);
        target.put('c',2);
        target.put('d',1);
        target.put('e',3);
        target.put('f',1);
        target.put('g',4);
        target.put('h',2);
        target.put('i',3);
        for (Map.Entry<Character,Integer> entry: target.entrySet()){
            if (entry.getValue()>1){
                arrayListTarget.add(entry);
            }
            arrayListTarget.sort(Comparator.comparing(Map.Entry::getValue));
        }

    }

    public static void main(String[] args) {
        System.out.println(target);
        System.out.println(arrayListTarget);
        System.out.println(arrayListTarget.get(arrayListTarget.size()-2));

    }
}
