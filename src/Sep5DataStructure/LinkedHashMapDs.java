package Sep5DataStructure;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDs {
    public void task1(){
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Arun" , 90001);
        map.put("Jothi" , 2124);
        map.put("Jezz" , 9102);
        System.out.println("Map order preserved: " + map.entrySet());
        System.out.println("Is the map empty? " + map.isEmpty());
        System.out.println("Contains key Arun? " + map.containsKey("Arun"));
        System.out.println("Contains Value 9102? " + map.containsValue(9102));
    }
}
