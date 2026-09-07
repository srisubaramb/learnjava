package Sep5DataStructure;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDs {
    public void task1(){
        Set<Integer> set = new LinkedHashSet<>();
        set.add(90);
        set.add(12);
        set.add(89);
        set.add(78);
        //Avoiding duplicates
        set.add(78);
        //removing and verify order
        set.remove(89);
        System.out.println("Removing: " + set);
        //Check contains 89
        System.out.println("contains 89? " + set.contains(89));

    }
}

