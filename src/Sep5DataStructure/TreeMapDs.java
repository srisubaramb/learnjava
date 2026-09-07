package Sep5DataStructure;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDs {
    public void task1(){
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(90, "Arun");
        treeMap.put(20 , "Godot");
        treeMap.put(21 , "Kiko");
        System.out.println("Sorted map " + treeMap.entrySet());
        //Lopping and getting every elements
        for(Map.Entry<Integer, String> items : treeMap.entrySet()){
            System.out.print(items.getKey() + " ");
            System.out.print(items.getValue());
            System.out.println();
        }
    }
}
